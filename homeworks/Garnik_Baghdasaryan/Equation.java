public class Equation {
    public static void main (String[]args){

        double a = 1;
        double b = 4;
        double c = 4;
        double x1;
        double x2;

        if (a<0){
            c=-c;
        }
        double d = b*b - 4*a*c;
        if (d<0){
            System.out.println("Does not make sense");
        }else if (d==0){
            x1 = -b / (2*a);
            System.out.println("your value is: " + x1);
        }else if (d>0) {

            x1 = (-b + Math.sqrt(d)) / 2 * a;
            x2 = (-b - Math.sqrt(d)) / 2 * a;

        System.out.println("X1 equals to: " + x1);
        System.out.println("X2 equals to: " + x2);
   }

}
    
}

