import java.util.Arrays;

public class Main {
    static void missingElements(int arr[], int low, int high) {
        bubbleSort(arr);
        int i = binarySearch(arr, low, 0, arr.length - 1);
        int x = low;

        while (i < arr.length && x <= high) {
            if (arr[i] != x) {
                System.out.print(x + " ");
            } else {
                i++;
            }
            x++;
        }

        while (x <= high) {
            System.out.print(x + " ");
            x++;
        }

    }

    static int binarySearch(int arr[], int x, int left, int right) {
        if (x < arr[0]) {
            return 0;
        }
        if (x > arr[arr.length - 1]) {
            return arr.length;
        }

        int mid = (right + left) / 2;

        if (arr[mid] == x) {
            return mid;
        }

        if (arr[mid] < x) {
            if (mid + 1 < right && arr[mid + 1] >= x) {
                return mid + 1;
            }
            return binarySearch(arr, x, mid + 1, right);
        } else {
            if (mid - 1 >= left && arr[mid - 1] < x) {
                return mid;
            }
            return binarySearch(arr, x, left, mid - 1);
        }
    }

    private static void bubbleSort(int[] arr) {
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

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 4, 9, 6};
        int low = 1, high = 10;
        missingElements(arr, low, high);
    }
}
