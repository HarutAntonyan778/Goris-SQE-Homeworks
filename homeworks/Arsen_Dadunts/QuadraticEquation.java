import java.util.Scanner;

public class  QuadraticEquation {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("The quadratic equation should have this form ax^2 + bx + c = 0 ");
       System.out.println("Please enter the a value:");
       double a = input.nextDouble();
       System.out.println("Please enter the b value:");
       double b = input.nextDouble();
       System.out.println("Please enter the c value:");
       double c = input.nextDouble();

       Double D = b * b - 4 * a * c; // why the variable name is in upper case and why you are using Double instead of double ?
       if (a == 0) {
           System.out.println("The a value can't 0:");
       } else if (D > 0) {
           double x1=(Math.sqrt(D)+b)/2*a;
           double x2=(Math.sqrt(D)-b)/2*a;
           System.out.println("The roots of "+a+"x^2+ "+b+"x+ "+ c +" = 0 "+"quadratic equation is");
           System.out.println("the root 1 is "+x1);
           System.out.println("the root 2 is "+x2);
       }
       else if (D==0){
           double x=-b/2*a;
           System.out.println("The quadratic equation have 1 root " + x);
       }
       else {
           System.out.println("The quadratic equation hasn't roots");
       }
   }
}
