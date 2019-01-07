import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            findsmallestnumbers();
        }
        public static void findsmallestnumbers() {
            Scanner scanner =new Scanner(System.in);
            System.out.print("Enter the array length: ");
            int length=scanner.nextInt();
            int [] a = new int[length];
            int temp=0;
            while (temp<length){
                a[temp]=scanner.nextInt();
                temp++;
            }
            if (a.length<2){
                System.out.println("The array have not enough element:");
                findsmallestnumbers();
            }
            if (a.length==2){
               if (a[0]>a[1]) System.out.println("The first smallest number is: " + a[1]);
               else System.out.println("The first smallest number is: " + a[0]);
                System.out.println("The array have not second smallest element:");
                System.exit(0);
            }
            int min1 = a[1];
            int min2 = a[2];

            for (int i = 0; i <a.length; i++) {
                if (min1>a[i]) {
                    min2 = min1;
                    min1 = a[i];
                }
                else if (a[i] < min2 && a[i] != min1)
                    min2 = a[i];
            }

            System.out.println("The first smallest number is"  + min1 +"\nThe second smallest number is: "+ min2);
        }
    }
