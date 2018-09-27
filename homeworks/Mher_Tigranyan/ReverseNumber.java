public class ReverseNumber {
    public static void main(String[] args){
        int number1 = 95421;
        int number2 = 0;
        while (number1>0){
            number2 = (number2 * 10) + (number1 % 10);
            number1 = number1 / 10;
        }
        System.out.println(number2);
    }
}
