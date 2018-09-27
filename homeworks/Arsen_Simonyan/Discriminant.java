package com.company;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        int c = 2;
        int discriminant = b * b - 4 * a * c;
        if (discriminant == 0) {
            System.out.println(-b / (2 * a));
        } else if (discriminant < 0) {
            System.out.println("havasarumy lucum chuni");
        } else {
            System.out.println(-b - Math.sqrt(discriminant)/(2 * a));
            System.out.println(b - Math.sqrt(discriminant)/(2 * a));
        }
    }
}