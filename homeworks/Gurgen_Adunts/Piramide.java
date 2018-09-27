public class Piramide {
    public static void main(String args[]) {
        int length = 20;
        for (int i = 1; i <= length; i+=2) {
            for (int j = length; j > 0; j--) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}
