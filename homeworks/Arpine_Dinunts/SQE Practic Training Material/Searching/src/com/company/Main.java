package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        LinearSearch lsearch = new LinearSearch();
        int [] a = {0,6,2,7,1,3};
        System.out.println(lsearch.Lsearch(a,7));

        BinarySearch bsearch = new BinarySearch();
        bsearch.bubblesort(a);
        System.out.println(bsearch.binarySearch(a,0, a.length,6));
    }
}
