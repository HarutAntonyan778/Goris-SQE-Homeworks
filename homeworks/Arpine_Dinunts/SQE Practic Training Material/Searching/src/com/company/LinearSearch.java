package com.company;

public class LinearSearch {
    public static int Lsearch(int[] a, int search) {
        for (int i = 0; i <= a.length; i++) {
            if (a[i] == search) {
                return i;
            }
        }
        return -1;
    }
}
