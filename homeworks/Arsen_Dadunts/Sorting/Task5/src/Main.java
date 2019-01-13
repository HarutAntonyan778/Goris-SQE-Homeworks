import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 14, 11, 51, 15};
        printmissingelements(arr);

    }

    public static void printmissingelements(int arr[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the low number:");
        int low = scanner.nextInt();
        System.out.println("Enter the hight number:");
        int hight = scanner.nextInt();
        if (low > hight) printmissingelements(arr);

        int arr2[] = new int[hight - low];
        boolean list[] = new boolean[hight - low];

        for (int i = low, j = 0; i < hight; i++, j++) {
            arr2[j] = i;
            for (int k = 0; k < arr.length; k++) {
                if (arr[k] != i) list[j] = true;
                else {
                    list[j] = false;
                    break;
                }
            }
        }

        for (int i = 0; i < list.length; i++) {
            if (list[i] == true)System.out.println(" " + arr2[i]);
        }
    }
}