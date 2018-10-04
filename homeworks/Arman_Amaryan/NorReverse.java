public class NorReverse {
    public static void main(String[] args) {

        System.out.println(reverse(1234567));
    }

    static int reverse ( int a){
        if (a < 10) return a;
        int v = a%10;
        return v * astijan(length(a)-1) + reverse(a/10);
    }

    public static int length(int a) {
        int length = 1;

        for (int i = a; i > 10 ; i/=10) {
            length++;
        }

        return length;
    }

    public static int astijan(int a) {
        int n = 1;
        for (int i = 0; i < a ; i++) {
            n*=10;
        }

        return n;
    }
}
