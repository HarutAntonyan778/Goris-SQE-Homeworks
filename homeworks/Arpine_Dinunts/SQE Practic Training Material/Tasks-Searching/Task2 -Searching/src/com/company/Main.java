package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// Task2-Searching
        int[] a = {1, 2, 4, 6, 3, 7, 8};
        FindMissingElement fmiss = new FindMissingElement();
        fmiss.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(fmiss.findmissing(a));

        // Task3-Searching
        SearchPikovi spik = new SearchPikovi();
        int [] c = {10,10,5, 7, 23, 45, 37};
        System.out.println(spik.searchpik(c));
       // System.out.println(Arrays.toString(c));

        // Task4-Searching
        Smallest2 sm2 = new Smallest2();
        int [] e = {10,10,5, 7, 23, 30, 37};
        sm2.bubblesort(e);
        //System.out.println(Arrays.toString(e));
        System.out.println(sm2.smallest2(e));
        System.out.println(e[0] + "   " + e[1]);

        // Task5-Searching
        RepeatElement rep = new RepeatElement();
        int [] d = {10, 5, 3, 4, 3, 5, 6};
        System.out.println(rep.repeatelement(d));

    }
}
