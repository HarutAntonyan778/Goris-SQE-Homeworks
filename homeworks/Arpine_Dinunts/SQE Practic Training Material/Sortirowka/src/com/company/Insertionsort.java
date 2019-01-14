package com.company;

public class Insertionsort {
    public void insertionSort(int[] a) {
        for (int j = 2; j < a.length; j++) { // O(n)

            int n = a[j];
            int k = j;

            while (k > 0 && a[k-1] > n) { // O(1+2+3+...+n-1)=O((1+n-1)n/2)=O(n^2/2)=O(n^2)
                a[k] = a[--k];
            }
            a[k] = n;
        }

    }
}

// O(n)+O(n^2) = O(n^2)