package com.verissimo.namor;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Parser {

    private static final String ITEM_SEPARATOR = "\\|";
    public static final DateTimeFormatter LOG_DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
    public static final DateTimeFormatter PRM_DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd.HH:mm:ss");
    private static final int COL_DATE = 0;
    private static final int COL_IP = 1;
    private static final int COL_REQUEST = 2;
    private static final int COL_STATUS = 3;
    private static final int COL_USERAGENT = 4;

    private Path path;
    private Set<LogLineDTO> lines;
    private Map<String, Long> ipCountMap;
    private List<String> ipsOverThreshold;

    public Parser(Path path) {
        this.path = path;
        this.lines = new HashSet<>();
    }


    public static LogLineDTO parseLine(String line) {
        String[] strings = line.split(ITEM_SEPARATOR);

        LogLineDTO dto = new LogLineDTO();

        dto.setDate(LocalDateTime.parse(strings[COL_DATE], //
                LOG_DATE_FORMAT));
        dto.setIp(strings[COL_IP]);
        dto.setRequest(strings[COL_REQUEST]);
        dto.setStatus(Integer.parseInt(strings[COL_STATUS]));
        dto.setUserAgent(strings[COL_USERAGENT]);

        //System.out.println(dto);

        return dto;
    }

    public void readFile() {
        TimeController.startTask("readFile");

        try (BufferedReader reader = Files.newBufferedReader(this.path, StandardCharsets.ISO_8859_1)) {
//        try {
//            lines = Files.readAllLines(path) //
//                    .parallelStream() //
//                    .map(line -> parseLine(line)) //
//                    .collect(Collectors.toSet());

            String line = null;
            while ((line = reader.readLine()) != null) {
                lines.add(parseLine(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            TimeController.endTask();
        }
    }


    public LocalDateTime getDateTimeLimit(LocalDateTime startTimeToFind, String findDuration) {
        if ("hourly".equals(findDuration)) {
            return startTimeToFind.plus(1L, ChronoUnit.HOURS);
        }

        if ("daily".equals(findDuration)) {
            return startTimeToFind.plus(1L, ChronoUnit.DAYS);
        }

        throw new IllegalArgumentException("duration not supported");
    }

    public void countByFilters(String findStartDate, String findDuration) {
        TimeController.startTask("countByFilters");

        LocalDateTime startTimeToFind = LocalDateTime.parse(findStartDate, PRM_DATE_FORMAT);
        LocalDateTime endTimeToFind = getDateTimeLimit(startTimeToFind, findDuration);

        ipCountMap = lines.stream() //
                // .parallel() //
                .filter(dto -> dto.getDate().isAfter(startTimeToFind) && dto.getDate().isBefore(endTimeToFind)) //
                .collect(Collectors.groupingBy(dto -> dto.getIp(), Collectors.counting()));

        // ipCountMap.entrySet().forEach(el -> System.out.println(el.getKey() + ":" + el.getValue()));

        TimeController.endTask();
    }

    public void applyFilterThreshold(Long findThreshold) {
        TimeController.startTask("applyFilterThreshold");

        ipsOverThreshold = ipCountMap.entrySet().stream() //
                .filter(item -> item.getValue() >= findThreshold) //
                .map(item -> item.getKey()) //
                .collect(Collectors.toList());

        TimeController.endTask();
    }

    public void printIps() {
        TimeController.startTask("printIps");

        //ipsOverThreshold.forEach(System.out::println);

        TimeController.endTask();
    }

    public static void main(String[] args) {
        String findStartDate = "2017-01-01.00:00:00";
        String findDuration = "daily";
        Long findThreshold = Long.valueOf("200");
        Path path = Paths.get("/mnt/dados3/Java/cursos/java-8-ocp/src/com/verissimo/namor/access.log");
        //Path path = Paths.get("/mnt/dados3/Java/cursos/java-8-ocp/src/com/verissimo/namor/access_test.log");

        TimeController.startExecution();
        TimeController.setDebug(true);

        Parser parser = new Parser(path);
        parser.readFile();
        parser.countByFilters(findStartDate, findDuration);
        parser.applyFilterThreshold(findThreshold);
        parser.printIps();

        TimeController.endExecution();
    }

}
