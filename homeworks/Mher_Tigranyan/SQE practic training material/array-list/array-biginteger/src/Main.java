public class Main {
    public static void main(String[] args) {
        String s1 = "7654729850328997631007285998163550104";
        String s2 = "5980139243970186632651869926335829102";
        System.out.println(sum(s1,s2));
    }

    public static String sum(String addend1, String addend2) {
        StringBuilder str = new StringBuilder();
        for ( int i1 = addend1.length() - 1, i2 = addend2.length() - 1, carry = 0;
              i1 >= 0 || i2 >= 0 || carry != 0;
              i1--, i2-- ) {
            int num1;
            int num2;
            if (i1 < 0){
                 num1 = 0;
            } else {
                 num1 = Integer.parseInt(Character.toString(addend1.charAt(i1)));
            }
            if (i2 < 0){
                num2 = 0;
            } else {
                num2 = Integer.parseInt(Character.toString(addend2.charAt(i2)));
            }

            int number = num1 + num2 + carry;
            if (number > 9) {
                carry = 1;
                number -= 10;
            } else {
                carry = 0;
            }

            str.append(number);
        }
        return str.reverse().toString();
    }
}