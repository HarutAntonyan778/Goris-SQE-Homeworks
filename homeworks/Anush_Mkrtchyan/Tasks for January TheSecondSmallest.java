public class TheSecondSmallest {
    private static int arr[];

    public static void printSmallests(int arr1[]) {
        arr = arr1;
        int b[] = sortingArr(arr);
        System.out.println(" The smallest element is " + b[0]);
        System.out.println("The second smallest element is " + b[1]);
    }

    public static int[] sortingArr(int[] arr) {
        for (int j = 0; j < arr.length - 2; j++) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    int t = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = t;
                }
            }
        }
//        for( int i=0; i<arr.length; i++)
//            System.out.println(arr[i]);
        return arr;
    }
}
