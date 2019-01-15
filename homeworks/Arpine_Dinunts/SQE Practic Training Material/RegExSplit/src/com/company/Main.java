package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

//        Scanner inputNum = new Scanner(System.in);
//        System.out.print("Please enter the 10-digit phone number: ");
//        String phoneNum = Integer.toString(inputNum.nextInt());
//
//        String first = phoneNum.substring(0,3);
//        String second = phoneNum.substring(3,6);
//        String third = phoneNum.substring(6,10);
//
//        System.out.print("Country code is " + first + ",");
//        System.out.print("Local area code is " + second + ",");
//        System.out.print("Number is " + third +":");

        String REGEX = "^(\\d{1,3})[- ](\\d{1,3})[- ](\\d{4,10})$";
        Pattern phoneNum = Pattern.compile(REGEX);

        Matcher matcher = phoneNum.matcher("374-77-333213");
        if (matcher.matches()) {
            System.out.println("Country cod: " + matcher.group(1));
            System.out.println("Local area cod: " + matcher.group(2));
            System.out.println("Number: " + matcher.group(3));
        }

    }
}
