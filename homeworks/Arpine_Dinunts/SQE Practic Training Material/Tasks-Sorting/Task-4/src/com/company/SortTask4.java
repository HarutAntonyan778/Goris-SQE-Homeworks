package com.company;

import java.util.Arrays;

public class SortTask4 {
    void swap(int arr[], int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // This function sorts arr[0..n-1] in wave form, i.e.,
    // arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4]..
    void sortInWave(int arr[], int n)
    {
        // Sort the input array
        Arrays.sort(arr);

        // Swap adjacent elements
        for (int i=0; i<n-1; i += 2)
            swap(arr, i, i+1);
    }
}
