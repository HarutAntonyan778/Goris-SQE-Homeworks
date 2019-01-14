package com.company;

public class Smallest2 {

    public static int[] smallest2(int [] a) {
        //int min1 =0; int min2 = 0;
        int[] b = new int[a.length];
        for (int i = 0; i < a.length - 1; i++) {
            if (a[0] < a[1]) {
                b[0] = a[0];
                b[1] = a[1];
            }

        }return b;
    }

    public static void  bubblesort(int[] arr) {
        for (int i = 0; i < arr.length; i++){ //O(n)
            for (int j = i+1; j < arr.length; j++){  //O(n)
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        } for (int i = 0; i < arr.length; i++){
            System.out.println("  " + arr[i] + "  ");
        }
    }

}
