package com.verissimo.aula013_lambda;

import com.verissimo.aula000_dtos.MyItemDTO;

import java.util.Optional;
import java.util.Random;

public class OptionalPlayground {

    public static String randomString() {
        Random gerador = new Random();
        if (gerador.nextBoolean()) {
            return "The name is João";
        }

        return null;
    }

    public static void main(String[] args) {
        MyItemDTO dto = new MyItemDTO();
        dto.setId(100L);

        String nome = randomString();
        dto.setName(Optional.ofNullable(nome).orElse("Not informed"));

        System.out.println(dto);
    }

}
