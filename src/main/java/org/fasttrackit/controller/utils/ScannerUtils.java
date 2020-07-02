package org.fasttrackit.controller.utils;

import java.util.Scanner;

public class ScannerUtils {

    public static final Scanner SCANNER=new Scanner(System.in);

    public static int readNExtSingleInt(){
        int integer = SCANNER.nextInt();
        SCANNER.nextLine();
        return integer;
    }

    public static double readNExtSingleDouble(){

        double value=SCANNER.nextDouble();
        SCANNER.nextLine();
        return value;
    }
//
//    public static void main(String[] args) {
//        System.out.println("Enter an int:");
//        int int1=SCANNER.nextInt();
//        int int2=SCANNER.nextInt();
//        int int3=SCANNER.nextInt();
//
//        SCANNER.nextLine();
//
//        System.out.println("Entered:"+int1);
//        System.out.println("Entered 2:"+int2);
//        System.out.println("Entered 3:"+int3);
//
//        System.out.println("Enter string:");
//        String line = SCANNER.next();
//        System.out.println("Entered string: "+line);

}
