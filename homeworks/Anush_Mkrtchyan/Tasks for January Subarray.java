public class Subarray {
    public void findIndex( int []arr){
        findLeftIndex(arr);
        findRightIndex(arr);
    }
    public  void findLeftIndex(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        int b[] = new int[arr.length];
        for( int i=0; i<arr.length; i++)
            b[i]=arr[i];
        b=sortingArray(b);
        for (int i = 0; i < b.length; i++) {
            if (arr[i] == b[i]) {
                left++;
            } else {
                System.out.print(left+"  ");
                return;
            }
        }
    }
    public void findRightIndex(int arr1[]){
        int right = arr1.length-1;
        int b[] = new int[arr1.length];
        for( int i=0; i<arr1.length; i++)
            b[i]=arr1[i];
        b = sortingArray(b);
        for( int i=0; i<arr1.length; i++){
            if (arr1[arr1.length -1- i] == b[b.length-1 - i]) {
                right--;
            } else  {
                System.out.println(right);
                return;
            }
        }
    }

    public  int[] sortingArray(int[] arr) {
        for (int j = 0; j < arr.length - 2; j++) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    int t = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = t;
                }
            }
       }
//        for (int i = 0; i < arr.length; i++)
//            System.out.println(arr[i]);
        return arr;
    }
}
