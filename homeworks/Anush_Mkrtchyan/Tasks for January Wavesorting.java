public class Wavesorting {
    private int[] bubblesorting(int arr[]) {
        for (int j = 0; j < arr.length - 2; j++) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] < arr[i]) {
                    int t = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = t;
                }
            }
        }
        return arr;
    }

    public int[] wave(int[] arr) {
        int c[] = new int[arr.length];
        int b[] = bubblesorting(arr);
        int index = b.length / 2;
        int j = 0;
        for (int i = 0; i < c.length; i++) {
            if (i % 2 == 0) {
                c[i] = b[j];
                System.out.println(c[i]);
                j++;
            } else {
                c[i] = b[index];
                System.out.println(c[i]);
                index++;
            }
        }
        return c;
    }


}
