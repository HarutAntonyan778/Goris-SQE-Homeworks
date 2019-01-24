public class CountingSort {

    public void sort(int [] arr) {
        for (int i=0; i<arr.length; i++){
            if(arr[i]<0){
                System.out.print("The counting sort can not sort when array have negative number:");
                System.exit(0);
            }
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
        System.out.println();
    }
}
