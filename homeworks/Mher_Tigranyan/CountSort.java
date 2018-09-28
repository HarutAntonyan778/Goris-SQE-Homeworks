public class CountSort {
    public static void main(String[] args) {
        int[] arr1 = {4, 56, 4, 8, 1, 4, 6};
        int temp = arr1[0];
        // find max value
        for (int i = 1; i < arr1.length; i++) {
            if (temp < arr1[i]) {
                temp=arr1[i];
            }
        }
        //creat second array with max value
        int[] arr2 = new int[temp+1];
        //creat
        // corresponding value of arr2 +1
        for (int j = 0; j<arr1.length; j++){
            arr2[arr1[j]] += 1;
        }
        // sout items of arr2 corresponding time
        for (int k = 0; k<arr2.length; k++){
            for (int l = 0; l<arr2[k]; l++){
                System.out.print(k+" ");
            }
        }
    }

}
