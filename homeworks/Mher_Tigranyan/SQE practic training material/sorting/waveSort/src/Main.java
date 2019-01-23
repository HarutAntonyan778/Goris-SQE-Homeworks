class Main {
    static void wave(int arr[], int n) {
        bubbleSort(arr);
        for (int i = 0; i < n - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }

    public static void main(String args[]) {
        int arr[] = {7, 85, 38, 2, 1, 6, 23};
        wave(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
