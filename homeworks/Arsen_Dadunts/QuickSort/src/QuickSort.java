public class QuickSort {

    public void sort(int[] a, int length) {
        int i = 0, j = length - 1;
        int p = a[a.length / 2];
        int temp;

        do {
            while (a[i] < p) i++;
            while (a[j] > p) j--;
            if (i <= j) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        } while (i <= j);
        if (j > 0) sort(a, j);
        if (length > i) sort(a, length - i);
    }

    public void check(int[] b) {
        for (int i = 0; i < b.length; i++) {
            System.out.print(" " + b[i]);
        }
    }
}
