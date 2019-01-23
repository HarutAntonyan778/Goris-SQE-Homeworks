public class Main {
    public static void main(String[] args) {
        int r;
        int b[] = {1, 1, 1, 1, 8, 8, 3, 6, 6, 6, 5, -1, 2, 2};
        int i;
        int n = b.length;
        int k = 0;
        bubbleSort(b);
        int[] a = new int[n + 1];
        for (r = 0; r < n; r++) {
            a[r] = b[r];
        }

        int c = 1;
        int in[] = new int[10];
        int[] e = new int[10];
        for (i = 0; i < n; i++) {
            if (a[i] == a[i + 1])
                c++;
            else {
                e[k] = a[i];
                in[k] = c;
                k++;
                c = 1;
            }
        }
        for (int f = 0; f < k; f++) {
            for (int g = 0; g < k - f - 1; g++) {
                if (in[g] < in[g + 1]) {
                    int aaa = in[g];
                    in[g] = in[g + 1];
                    in[g + 1] = aaa;
                    int bbb = e[g];
                    e[g] = e[g + 1];
                    e[g + 1] = bbb;
                }
            }
        }
        int d = 0;
        for (int x = 0; x < k; x++) {
            for (int y = 0; y < in[x]; y++) {
                System.out.print(e[d]);
            }
            d++;
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
}
