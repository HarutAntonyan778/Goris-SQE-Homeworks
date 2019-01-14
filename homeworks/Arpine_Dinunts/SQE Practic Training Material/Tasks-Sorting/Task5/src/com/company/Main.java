package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SortMissing sm = new SortMissing();
        int arr[] = { 1, 3, 5, 4 };
        int low = 1, high = 10;
        sm.printMissing(arr, low, high);
    }
}
