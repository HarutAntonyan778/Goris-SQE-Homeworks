import java.util.ArrayList;
import java.util.Collections;

public  class BigIntegerClass {
    public static String adder(String a, String b) {
        Integer carry = 0;
        ArrayList<String> res = new ArrayList<String>();
        String str="";
        int i = a.length() - 1;
        int j = b.length() - 1;
        int max = i;
        if (j > i) max = j;
        while (true) {
            int i1 = 0;
            if (i >= 0) {
                i1 = Integer.parseInt(Character.toString(a.charAt(i)));
            }
            int i2 = 0;
            if (j >= 0) {
                i2 = Integer.parseInt(Character.toString(b.charAt(j)));
            }
            Integer i3 = i1 + i2 + carry;
            if (i3 > 9) {
                carry = 1;
                i3 = i3 - 10;
            } else carry = 0;
            res.add(i3.toString());
            i--;
            j--;
            max--;
            if (max < 0) {
                res.add(carry.toString());
                break;
            }
        }
        Collections.reverse(res);
        res.remove(0);
        str.join("",res);
        for (int k = 0; k < res.size(); k++) {
            System.out.print(res.get(k));
        }

        return str;
    }

//    public static void multiply(String a, String b) {
//        ArrayList<String> result = new ArrayList<String>();
//        String sumater="0";
//        String multiplyer= "0";
//        int i = a.length() - 1;
//        int j = b.length() - 1;
//        ArrayList<Integer> mult = new ArrayList<Integer>();
//        for (int k = i; k >= 0; k--) {
//            int i1 = Integer.parseInt(Character.toString(a.charAt(i)));
//            mult.add( i1 );
//        }
//        for( int k=0; k < mult.size(); k++){
//            int temp= mult.get(k)*(int)Math.pow(10,k);
//
//                for( int p=1; p<=temp ; p++){
//                    String string=adder(sumater,b);
//                    sumater=string;
//
//                    System.out.println(sumater);
//            }
//           multiplyer=adder(multiplyer, sumater);
//        }
////        System.out.println(multiplyer);
//
//    }
}
