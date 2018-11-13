package com.verissimo.aula010_Enums;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

interface I { }
enum EnumA implements I { A, AA, AAA};  //1

public class EnumExample {

    public enum EnumB{ B, BB, BBB;
        // public Object clone(){ return B; } //2
    }

    public static enum EnumC{ C, CC, CCC };

    // public static enum EnumD extends EnumC{ DDD }; //3

    public static void main(String[] args)
    {
        // System.out.println(EnumC.CC.index()); //4
        System.out.println(EnumC.CC.ordinal()); //4

        System.out.println(EnumC.CCC.name()); //6
        System.out.println(EnumB.values());
        System.out.println(EnumB.valueOf("BBB"));
        System.out.println(EnumC.valueOf("ccc")); //5
    }

}
