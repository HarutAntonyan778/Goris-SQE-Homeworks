import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n-- >0){
            String s = sc.nextLine();
            String x = "\\([-+]?(([1-8]?\\d)(\\.\\d+)?|90(\\.0+)?)";
            Pattern p = Pattern.compile(x+", "+ y);
            Matcher m = p.matcher(s);
            if(m.find()){
                System.out.println("Valid");
            }
            else System.out.println("Invalid");
        }
    }
}
