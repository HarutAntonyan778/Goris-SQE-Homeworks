package com.company;

public class  SearchPikovi {

    public int[] searchpik(int[] a) {
        int[] b = new int[a.length];
            for (int j = 1; j < a.length-1; j++) {

                if (a[j] > a[j + 1] && a[j] > a[j-1]) {
                    b[j] = a[j];

                }
            }
        for (int i =1; i < b.length-1; i++){
            System.out.println("  " + b[i] + "  ");
        }return b;
        }
    }

