//Reverse number with recursive method
public class Main {
    public static void main(String[] args) {
        rev(654301);
    }
    public static int n2 =0;
    static void rev ( int n){
        n2 = (n2 * 10) + (n % 10);
        n = n / 10;
        if (n == 0) {
            System.out.println(n2);
        } else {
            rev(n);
        }
    }
}
