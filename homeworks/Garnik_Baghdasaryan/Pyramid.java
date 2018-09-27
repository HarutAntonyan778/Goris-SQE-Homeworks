public class Pyramid {
    public static void main(String[] args) {
        int num = 10;
        for(int i=0;i<num;i++) {
            for(int a=0;a<num-i;a++) {
                System.out.print(" ");
            }
            for(int b=0;b<=i;b++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
