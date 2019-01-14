package com.company;

public class Quicksort {
    public int[] arr;

    private void swap( int i, int j ) {
        int temp;

        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void quicksort( int left, int right ) {
        int i, last;

        if (left >= right )
            return;
        swap( left, (left + right)/2 );
        last = left;
        for ( i = left+1; i <= right; i++ )
            if ( arr[i] < arr[left] )
                swap( ++last, i );
        swap( left, last );
        quicksort( left, last-1 );
        quicksort( last+1, right );

    } // quicksort


    public void printList () {
        int length = arr.length;

        for(int i = 0; i < length; i++ ) {
            if ( i == length-1 )
                System.out.println(arr[i] + ".");
            else
                System.out.print(arr[i] + ", ");
        }
    }

}

// O(n) = n logn/2 himqov/

