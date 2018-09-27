import java.util.Scanner;
public class BubleSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter length of array: ");
        int numOfFriends = Integer.parseInt(scan.nextLine());

        int input[] = new int[numOfFriends];
        for (int h = 0; h < input.length; h++) {
            System.out.print("Enter the number " + (h+1) + " : ");
            input[h] = Integer.parseInt(scan.nextLine());
        }

//        int[] input = {4, 2, 9, 6, 23, 12, 34, 0, 1};
        int n = input.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (input[i] > input[k]) {
                    int temp;
                    temp = input[i];
                    input[i] = input[k];
                    input[k] = temp;
                }
            }

        }
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
}
