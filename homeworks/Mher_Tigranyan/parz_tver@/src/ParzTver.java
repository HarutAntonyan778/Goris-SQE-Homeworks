public class ParzTver {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            boolean parz = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    parz = false;
                }
            }
            if (parz == true) {
                System.out.print(i + ", ");
            }
        }
    }
}
