public class Quadraticequation {
    public static void main(String[] args){
        //ax^2 + bx + c = 0;
        double a = 1;
        double b = 7;
        double c = 10;
        double d = b * b - 4 * a * c;
        if (a==0) {
                System.out.println("a can't be zero");
            }else if (d > 0) {
                double x1 = (-b + Math.pow(d, 0.5)) / (2 * a);
                double x2 = (-b - Math.pow(d, 0.5)) / (2 * a);
                System.out.println("x1= " + x1 + " x2= " + x2);
            } else if (d == 0) {
                double x1 = -b / (2 * a);
                System.out.println("x1 " + x1);
            } else {
                System.out.println("The equation has no real roots.");
            }
    }
}
