import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Pattern phoneNumber = Pattern.compile("^(\\d{1,3})[- ](\\d{1,3})[- ](\\d{4,10})$");
        Matcher matcher = phoneNumber.matcher("374-99-313363");
        if (matcher.matches()) {
            System.out.println("country cod: " + matcher.group(1));
            System.out.println("local cod: " + matcher.group(2));
            System.out.println("number: " + matcher.group(3));
        }
    }
}