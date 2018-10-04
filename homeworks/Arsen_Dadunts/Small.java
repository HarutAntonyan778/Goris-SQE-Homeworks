public class Small {
    public static void main(String[] args) {
        Small min = new Small();
        System.out.println(min.poqraguyn(19, 25, 9));
    }

    int poqraguyn (int a, int b, int c) {
        if (a >= b) {
            if (b >= c){
                return c;
            }
            else{
                return b;
            }
        }
        else if (a >= c){
            return c;
        }

        else{
            return a;
        }

    }
}

