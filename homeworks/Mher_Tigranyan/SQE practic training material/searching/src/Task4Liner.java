public class Task4Liner {
    public static int searchPeak(int arr[], int a) {
        if (arr[0] > arr[1]){
            return arr[0];
        }
        if (arr[a - 1] > arr[a - 2]) {
            return arr[a-1];
        }
        for(int i = 1; i < arr.length - 1; i++) {
            if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {

                return arr[i];
            }
        }
        return Integer.MIN_VALUE;
    }

    public static void main(String args[]) {
        int arr[] = {1, 3, 6, 10, 30, 55, 1};
        int a = arr.length;
        int peak = searchPeak(arr, a);
        if (peak == Integer.MIN_VALUE) {
            System.out.println("the peak is not exist");
        } else {
            System.out.print("the peak element is " + peak);
        }
    }
}