public class Number {
    public static void main(String[] args){
        int n1 = 1245;
        int n2 = 0;
        while (n1>0){
            n2 = (n2 * 10) + (n1 % 10);
            n1 = n1 / 10;
        }
        System.out.println(n2);
    }
}
