package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SortTask4 ob = new SortTask4();
        int arr[] = {10, 90, 49, 2, 1, 5, 23};
        int n = arr.length;
        ob.sortInWave(arr, n);
        for (int i : arr)
            System.out.print(i + " ");
    }
}
