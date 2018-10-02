public class Find {
    int temp;
    int smoler(int a, int b, int c){
        if (a<b){
            temp = a;
        }else {
            temp = b;
        }
        if (c<temp){
            temp=c;
        }
        return temp;
    }
    int average(int a, int b, int c){
        if (a<b){
            if (a>c){
                return a;
            }else if (b<c){
                return b;
            }else {
                return c;
            }
        }else if (b>c){
            return b;
        }else if (a<c){
            return a;
        } else {
            return c;
        }
    }
}
