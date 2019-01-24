import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {965, 67, 465, 54, 123, 43, 32, 12, 898, 5, 657};
        int [] array2={5,32,23,13,38,63,4,13,41,23,10,52};
        int [] array3={2,25,21,33,28,35,15,43,13,13,178,152};
        findPeakNumbers(array1);
        findPeakNumbers(array2);
        findPeakNumbers(array3);
    }

    public static void findPeakNumbers(int[] arr) {
        ArrayList v = new ArrayList();
        int i;
        for (i = 1; i < arr.length - 1; ++i) {
            if (i + 1 == arr.length - 1) {
                if (arr[i + 1] > arr[i]) {
                    v.add(arr[i + 1]);
                }
            } else if (i - 1 == 0) {
                if (arr[i - 1] > arr[i]) {
                    v.add(arr[i - 1]);
                }
            } else if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
                v.add(arr[i]);
            }
        }
        System.out.print("The peak numbers is:");
        for (i = 0; i < v.size(); ++i) {
            System.out.print(" "+v.get(i));
        }
        System.out.println();
    }
}
