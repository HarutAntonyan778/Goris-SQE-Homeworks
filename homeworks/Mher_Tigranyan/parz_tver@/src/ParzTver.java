import java.util.Scanner;

public class ParzTver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean parz = true;

        if (number < 2) {
            parz = false;
        } else {
            for (int j = 2; j < number; j++) {
                if (number % j == 0) {
                    parz = false;
                }
            }
        }
        if (parz == true) {
            System.out.print(number + "-@ parz tiv e");
        } else {
            System.out.println(number + "-@ parz tiv che");
        }
    }
}
