public class CuadraticEquations {
    public static void main(String []args) {
        double a=15;
        double b=7;
        double c=3;
        double D;
        double x1;
        double x2;
        D=b*b-4*c ;
        if (D>0) {
            x1=(-b-Math.sqrt(D))/(2*a);
            x2=(-b+Math.sqrt(D))/(2*a);

            System.out.println("root equations: x1="+x1+",x2="+x2);
        }
        else if (D==0) {
            double x;
            x = -b/(2*a);
            System.out.println(" equations have a root: x"+x);
        }
        else {
            System.out.println("equations have not a root!");

        }
    }
}
