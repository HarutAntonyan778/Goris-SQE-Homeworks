public class ReverseNumber {
    public static void main(String[] args) {
        int number = 1245, reversedNumber = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number /= 10;
        }
        System.out.println(reversedNumber);
    }
}
