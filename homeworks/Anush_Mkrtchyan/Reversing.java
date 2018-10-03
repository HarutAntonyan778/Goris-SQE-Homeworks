import java.util.Scanner;

public class Reversing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int endrevers = 0;
        System.out.println(reversing(first, endrevers));

    }

    public static int reversing(int a, int end) {
        String k = String.valueOf(a);
        int count = k.length();
        if (count < 2)
            return end + a;
        else {
            end = (end + a % 10) * 10;
            return reversing(a / 10, end);
        }

    }
}
