public class RepeatElement {
    public static void repeatElemenIs(int[] arr) {
        int i;
        for (i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    System.out.println(arr[i] + " is the first element that repeats");
                    return;
                }

            }
        }
    }
}
