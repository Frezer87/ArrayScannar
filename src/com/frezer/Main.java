package com.frezer;

import com.sun.org.apache.xml.internal.security.keys.content.MgmtData;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner test = new Scanner(System.in);
        double num[] = new double[4];

        int i = 0;
        double sum = 0;
        double ave = 0;
        System.out.println("Enter your name ");
        String hello = test.next();
        System.out.println("Hello " + hello + "\n" + "  Enter numbers ");

        for (i = 0; i < num.length; i++) {

            num[i] = test.nextInt();
            sum = sum + num[i];

        }
        ave = sum / 4;
        System.out.println("Hi "+ hello +" here is the avarage of numbers " + ave);

    }
}