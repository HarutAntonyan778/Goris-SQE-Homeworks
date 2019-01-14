public class BubbleSorting {
    public int [] bubbleSorting(int [] arr){
        for( int j=0; j<arr.length-2; j++) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    int t = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = t;
                }
            }
        }
        for( int i=0; i<arr.length; i++)
            System.out.println(arr[i]);
        return arr;
    }
}
