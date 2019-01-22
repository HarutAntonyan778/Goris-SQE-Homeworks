public class CountSort {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 9, 5, 3, 4, 3};
        counting_sort(arr1);
    }
     static void counting_sort(int[] arr1){
        int temp = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (temp < arr1[i]){
                temp = arr1[i];
            }
        }
        int[] arr2 = new int[temp + 1];

         for (int i = 0; i < arr1.length; i++) {
             arr2[arr1[i]] += 1;
         }

         for (int i = 0; i < arr2.length; i++) {
             while (arr2[i] != 0){
                 System.out.print(i + ", ");
                 arr2[i] -= 1;
             }
         }
    }
}
