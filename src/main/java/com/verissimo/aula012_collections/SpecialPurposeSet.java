package com.verissimo.aula012_collections;

import java.util.EnumSet;
import java.util.Set;

public class SpecialPurposeSet {

    enum DIAS {
        DOM, SEG, TER, QUA, QUI, SEX, SAB
    }

    public static void main(String[] args) {
        Set fds = EnumSet.of(DIAS.DOM, DIAS.SAB);
        System.out.println(fds);

        Set uteis = EnumSet.range(DIAS.SEG, DIAS.SEX);
        System.out.println(uteis);
    }

}
