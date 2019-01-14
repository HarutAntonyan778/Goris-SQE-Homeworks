package com.company;

public class Bubblesort {
    void bubblesort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++){ //O(n)
            for (int j = i+1; j < arr.length; j++){  //O(n)
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }
}

// O(n^2)