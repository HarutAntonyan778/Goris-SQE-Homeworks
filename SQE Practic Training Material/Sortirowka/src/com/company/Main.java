package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
         int [] b = {24, 2, 45, 20, 56, 75, 12, 16, 56, 99, 53, 12};

        System.out.println("1.Sorted array /Bubble sort/:");
        Bubblesort bs = new Bubblesort();
        bs.bubblesort(b);
        System.out.println("sorted array: " + Arrays.toString(b));
        System.out.println();

        System.out.println("2.Sorted array /Merge sort/:");
        int data[] = {15,20,5,1,36,23,4,10,8};
        Mergesort merges = new Mergesort();
//        for (int i = 0; i < 9; i++) {
//            System.out.print(data[i] + " ");
//        }
        merges.MergeSort(data, 0, data.length-1);
        for (int i = 0; i < 9; i++) {
            System.out.print(data[i] + " ");
        }


        System.out.println();
        System.out.println("3.Sorted array /Insertion sort/:");
        Insertionsort is = new Insertionsort();
        is.insertionSort(b);
        System.out.println("sorted array: " + Arrays.toString(b));
        System.out.println();


        System.out.println("4.Sorted array /Counting sort/:");
        Countingsort csort = new Countingsort();
        csort.sort(b);
        System.out.println("sorted array: " + Arrays.toString(b));
        System.out.println();


        System.out.println("5.Sorted array /Quick sort/:");
        Quicksort Sort = new Quicksort();
        Sort.arr = new int[]{24, 2, 45, 20, 56, 75, 12, 16, 56, 99, 53, 12};
        int length = Sort.arr.length;

        System.out.println("unsorted list.");
        Sort.printList();

        Sort.quicksort(0, length-1);

        System.out.println("sorted list.");
        Sort.printList();
        System.out.println();

    }
}
