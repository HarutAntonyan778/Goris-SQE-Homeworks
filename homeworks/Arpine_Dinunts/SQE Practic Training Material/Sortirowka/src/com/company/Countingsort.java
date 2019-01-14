package com.company;

public class Countingsort {
    //int [] a = {9,8,5,6,4};
   // int [] b = new int [a.length];

    public int sort(int [] a){
        int max = a[0];
        for (int i = 1; i < a.length-1; i++) {
            if (a[i] > max) {
                max = a[i];
            } //O(n)

        }
        int [] sortedNumbers = new int [max+1];
        for (int i = 0; i < a.length-1; i++){
            sortedNumbers[a[i]]++;
        } // O(k)

        int k = 0;
        for (int i = 0; i <= max; i++){
            for (int j = 0; j < sortedNumbers[i]; j++){
                a[k] = i;
                k++;
            }
        }return a[k]; //O(n)
    }
}

// O(n+k+n) = O(n+k), k = const;