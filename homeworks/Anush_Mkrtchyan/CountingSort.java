package com.company;

public class CountingSort {

    public static void main(String[] args) {
        int a[] = {8, 9, 5, 5, 7, 8, 4, 12, 0, 3, 1};
        int max = a[0];
        for (int i = 0; i < a.length; ++i) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        int counta[] = new int[max + 1];
        for (int i = 0; i < a.length; ++i) {
            int k = a[i];
            counta[k] +=1;
        }
        for (int i = 0; i < counta.length; i++) {
            for (int j = 0; j < counta[i]; j++) {
                System.out.println(i);
            }
        }
    }
}
