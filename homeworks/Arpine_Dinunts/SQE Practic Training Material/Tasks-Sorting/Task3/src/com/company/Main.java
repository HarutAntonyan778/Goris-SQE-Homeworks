package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Test t = new Test();
      //  int arr[] = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
        int arr[] = {0, 1, 15, 25, 6, 7, 30, 40, 50};
        int arr_size = arr.length;
        t.printUnsorted(arr, arr_size);
    }
}
