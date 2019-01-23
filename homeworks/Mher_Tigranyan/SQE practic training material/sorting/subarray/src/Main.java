class Main {
    static void unsorted(int arr[]) {
        int n = arr.length;
        int a = 0, b = n - 1, i;

        for (a = 0; a < n - 1; a++) {
            if (arr[a] > arr[a + 1])
                break;
        }
        if (a == n - 1) {
            System.out.println("The array is sorted");
            return;
        }

        for (b = n - 1; b > 0; b--) {
            if (arr[b] < arr[b - 1])
                break;
        }

        int max = arr[a];
        int min = arr[a];
        for (i = a + 1; i <= b; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }

        for (i = 0; i < a; i++) {
            if (arr[i] > min) {
                a = i;
                break;
            }
        }

        for (i = n - 1; i >= b + 1; i--) {
            if (arr[i] < max) {
                b= i;
                break;
            }
        }

        System.out.println(" the subarray lies between the indexes " + a + " and " + b);
        return;
    }

    public static void main(String args[]) {
        int arr[] = {5, 6, 30, 24, 22, 40, 32, 31, 35, 55, 65};
        unsorted(arr);
    }
}
