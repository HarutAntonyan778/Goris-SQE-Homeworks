/*
Write a code to reverse the given number (example` 1234 > 4321)
 */

public class ReverseNumber {
    public static void main(String[] args) {
            int number = 2008;
            int reverse = 0;

            while (number != 0) {
                int tiv = number % 10;
                reverse = reverse * 10 + tiv;
                number = number / 10;
            }
            System.out.println(reverse);
    }
}
