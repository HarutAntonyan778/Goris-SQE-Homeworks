import java.util.Scanner;

public class CountingSort {

    public void sort() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i=0; i<arr.length; i++){
            if(arr[i]<0) return sort();
        }
        
        int temp = 0;
        while (temp < length) {
            arr[temp] = scanner.nextInt();
            temp++;
        }
        int max = arr[1];
        for (int i = 0; i < arr.length; ++i) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int[] arr2 = new int[max + 1];
        for (int i = 0; i < arr.length; ++i) {
            ++arr2[arr[i]];
        }
        for (int i = 0; i < arr2.length; i++) {
            while (arr2[i] > 0) {
                arr2[i]--;
                System.out.print(" " + i);
            }
        }
    }
}
