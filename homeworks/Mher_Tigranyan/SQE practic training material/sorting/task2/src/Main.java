import java.util.*;

public class Main {
    public static void main(String[] args) {
        int r;
        int b[] = {1, 1, 1, 2, 1, 2, 3, 6, 6, 6, 5};
        int i;
        int n = b.length;
        int k = 0;
        Arrays.sort(b);
        int[] a = new int[n + 1];
        for (r = 0; r < n; r++) {
            a[r] = b[r];
        }

        a[r] = 1000000;
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
                    int[] ans = swap(in[g], in[g + 1]);
                    in[g] = ans[0];
                    in[g + 1] = ans[1];
                    int[] an = swap(e[g], e[g + 1]);
                    e[g] = an[0];
                    e[g + 1] = an[1];
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

    static int[] swap(int n1, int n2) {
        int temp;
        temp = n1;
        n1 = n2;
        n2 = temp;
        int ans[] = new int[2];
        ans[0] = n1;
        ans[1] = n2;
        return ans;
    }

}
