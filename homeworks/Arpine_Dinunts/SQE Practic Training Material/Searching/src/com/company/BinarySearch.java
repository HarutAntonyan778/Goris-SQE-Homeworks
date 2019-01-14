package com.company;

public class BinarySearch {
    public  int binarySearch(int[] array ,int begin , int theEnd , int item){

        if(begin > theEnd) return -1;
        int middle =  (begin + theEnd ) / 2;
        if(array[middle] == item) return middle;
        else if(item < array[middle]){
            return binarySearch(array,begin,middle-1,item);
        } else return binarySearch(array,middle+1, theEnd,item);

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

