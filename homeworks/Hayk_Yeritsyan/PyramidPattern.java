public class PyramidPattern {
    public static void main(String[] args) {
        int qanak = 7;
        for (int i = 0; i < qanak; ++i) {
            for (int j = 0; j < (qanak - i); ++j)
                System.out.print(" ");
            for (int k = 0; k < 2 * i + 1; k++)
                System.out.print("*");
            System.out.println("");
            {
            }
        }
    }
}
