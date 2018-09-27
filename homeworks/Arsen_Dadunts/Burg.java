import java.util.Scanner;



public class Burg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (int i =1 ; i <=number ; i++) {
            for (int j = i; j <=number ; j++) {
                System.out.print(" ");
            }
            for (int a = 1; a <=i ; a++) {
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}
