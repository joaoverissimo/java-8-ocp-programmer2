package com.verissimo.aula007_abstract;

import java.io.*;
import java.sql.*;

interface I1{   void m1() throws IOException;}
interface I2{   void m1() throws SQLException;}

public class InterfaceThrowsConflict implements I1, I2 {

    public void m1() {
        System.out.println("Hi there");
    }

    public static void main(String args[])  throws Exception {
        InterfaceThrowsConflict tc = new InterfaceThrowsConflict();
        I1 i1 = (I1) tc; //This is valid.
        i1.m1();
    }
}