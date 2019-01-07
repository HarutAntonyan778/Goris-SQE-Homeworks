import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{965, 67, 465, 54, 123, 43, 32, 12, 898, 5, 657};
        sort(a);
    }

    public static void sort(int[] a) {
        ArrayList v = new ArrayList();
        int i;
        for (i = 1; i < a.length - 1; ++i) {
            if (i + 1 == a.length - 1) {
                if (a[i + 1] > a[i]) {
                    v.add(a[i + 1]);
                }
            } else if (i - 1 == 0) {
                if (a[i - 1] > a[i]) {
                    v.add(a[i - 1]);
                }
            } else if (a[i] > a[i + 1] && a[i] > a[i - 1]) {
                v.add(a[i]);
            }
        }
        System.out.print("The peak numbers is:");
        for (i = 0; i < v.size(); ++i) {
            System.out.print(" "+v.get(i));
        }
    }
}
