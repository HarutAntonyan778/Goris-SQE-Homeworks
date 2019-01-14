public class DecreasingArr {
    public static int arr[];

    public static int[] sortDecreasingArr() {
        int b[][] = new int[arr.length][2];
        int array[] = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            int q = number(arr[i], arr);
            b[j][0] = arr[i];
            b[j][1] = q;
//            System.out.println(b[j][0]+" "+b[j][1]);
            deleteElement(arr[i], q);
            i=-1;
            j++;
        }
        int m = 0;
        for (int i = 0; i < b.length; i++) {

            if (b[i][1] == maxQ(b)) {
                for (int k = m; k < m + maxQ(b); k++) {
                    array[ k ] = b[i][0];
              System.out.println( array[k] );
                }
                m=m+maxQ(b);
                b[i][1] = 0;
                i=-1;
            }
        }
        return array;
    }


    public static int number(int element, int arr[]) {
        int q = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element)
                q++;
        }
        return q;
    }

    public static int maxQ(int b[][]) {
        int max = b[0][1];
        for (int i = 0; i < b.length; i++) {
            if (b[i][1] > max) {
                max = b[i][1];
            }
        }
        return max;
    }

    public static int[] deleteElement(int element, int q) {
        int c[] = new int[arr.length - q];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != element) {
                c[j] = arr[i];
//                System.out.println(c[j]);
                j++;
//                System.out.println(arr[i]);

            }
        }
        return arr = c;
    }
}
