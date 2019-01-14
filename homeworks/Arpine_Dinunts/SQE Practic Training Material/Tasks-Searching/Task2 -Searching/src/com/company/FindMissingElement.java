package com.company;

public class FindMissingElement {
   // int p;
   public int findmissing(int[] a){

       for(int i = 0; i < a.length-1; i++){
           if (a[i]+1 != a[i+1]){
                return a[i]+1;
              // break;
           }
       } return -1;
   }
    public void sort(int [] a){
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }

        }
        int [] sortedNumbers = new int [max+1];
        for (int i = 0; i < a.length; i++){
            sortedNumbers[a[i]]++;
        }

        int k = 0;
        for (int i = 0; i <= max; i++){
            for (int j = 0; j < sortedNumbers[i]; j++){
                a[k] = i;
                k++;
            }
        }
    }

}
