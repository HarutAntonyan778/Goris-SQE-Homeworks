import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int number1 = input.nextInt();
        int number2 = 0;
        if (number1 % 10 != 0) {
            while (number1 > 0) {
                number2 = (number2 * 10) + (number1 % 10);
                number1 /= 10;
            }
            System.out.println(number2);
        } else {
            while (number1 > 0) {
                number2 = (number2 * 10) + (number1 % 10);
                number1 /= 10;
            }
            System.out.println("0" + number2);

        }
    }
}
