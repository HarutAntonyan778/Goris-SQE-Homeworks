public class burg {
    public static void main(String[] args){
        int b = 20;
        for (int i=0; i<b; i++){
            for (int j=0; j<=b; j++){
                if (j<b-i){
                    System.out.print(" ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
