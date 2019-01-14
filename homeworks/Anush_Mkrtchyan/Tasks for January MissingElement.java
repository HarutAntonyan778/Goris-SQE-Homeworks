public class MissingElement {
    public static void findMissing(int[] arr) {
        arr = sortingArr(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != 1)
                System.out.println(arr[i] + 1);
        }
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
        return arr;
    }
}
