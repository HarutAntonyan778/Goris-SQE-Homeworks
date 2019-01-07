public class Main {
    public static void main(String[] args) {
        int[] c = new int[]{3, 1, 7, 4, 5, 2, 8, 6, 10};
        bubblesort(c);
    }

    public static void bubblesort(int[] a) {
        int i;
        for (i = 0; i < a.length; ++i) {
            for (int j = 0; j < i; ++j) {
                if (a[j] > a[j + 1]) {
                    int b = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = b;
                }
            }
        }
        for (i = 0; i < a.length - 1; ++i) {
            if (a[i + 1] - a[i] == 2) {
                System.out.println(a[i] + 1);
                break;
            }
        }
    }
}
