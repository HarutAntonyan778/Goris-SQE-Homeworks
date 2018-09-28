import java.util.Scanner;
public class BubbleSort {

    public static void main(String[] args) {
    int []arr={9, 5, 7, 8, 1, 2, 3};
    for(int i=0; i<arr.length-1; i++) {
        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int t = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = t;
            }
        }
    }
        for ( int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");        }



    }
}

