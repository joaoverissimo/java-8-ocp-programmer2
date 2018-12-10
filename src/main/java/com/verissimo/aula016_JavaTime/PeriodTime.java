package com.verissimo.aula016_JavaTime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTime {

    public static void main(String[] args) {
        /**
         *  Os primeiros meses completos são contados e, em seguida, o número restante de dias é calculado.
         *  O número de meses é então dividido em anos (1 ano é igual a 12 meses).
         *  Um mês é considerado se o dia final do mês for maior ou igual ao dia de início do mês.
         *
         *  O resultado deste método pode ser um período negativo se o final for antes do início
         *  (ano, mês e dia terão um sinal negativo).
         */
        LocalDate d1 = LocalDate.of(2019, 01, 01);
        LocalDate d2 = LocalDate.of(2019, 01, 03);

        Period diff = Period.between(d1, d2);

        System.out.println("in days is: " + diff.getDays()); //in days is: 2
        System.out.println("in months is: " + diff.getMonths()); //in months is: 0
        System.out.println(diff); //P2D


        LocalDate d3 = LocalDate.of(2019, 02, 01);
        LocalDate d4 = LocalDate.of(2021, 01, 10);

        Period diff2 = Period.between(d3, d4);

        System.out.println("in days is: " + diff2.getDays()); //in days is: 9
        System.out.println("in months is: " + diff2.getMonths()); //in months is: 11
        System.out.println(diff2); //P1Y11M9D => 1 year, 11 months, 9 days

        LocalDate d5 = LocalDate.of(2019, 03, 01);
        LocalDate d6 = LocalDate.of(2018, 01, 06);
        System.out.println(Period.between(d5, d6)); //P-1Y-26D

    }

}
