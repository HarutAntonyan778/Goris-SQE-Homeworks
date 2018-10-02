public class Average {
    public static void main(String[] args) {
       Average miji = new Average();
        System.out.println(miji.mijin(125, 348, 254));
    }

    int mijin(int a, int b, int c) {
        if (a >= b) {
            if (b >= c){
                return b;
            } 
            else if (c >= a){
                return a;
            }
            else{ 
                return c;
            }
        }
        else if (a >= c){
            return a;
        }
        else if (b >= c){
            return c;
        }
        else{
            return b;
        }

    }

}

