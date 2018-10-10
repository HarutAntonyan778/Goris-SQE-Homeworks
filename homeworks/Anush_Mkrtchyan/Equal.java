import java.lang.Math;

import static java.lang.Math.abs;

public class Main {

    public static void main(String[] args) {
        String a = "goris";
//	char b = 'Z';
//	int number = (int)b;


//        System.out.println(number);
        System.out.println(equal("Goris", "goris"));

    }
    public static char[] tochararr (String str){
        char a[] = new char[ str.length() ];
        for (int i=0; i < str.length(); i++){
            a[i]=str.charAt(i);
        }
        return a;
    }

    public static boolean equal(String str1, String str2) {
        int k = str1.length();
        int temp = 0;
        int k2 = str2.length();
        if (k != k2) {
            return false;
        }
        char a[]=tochararr(str1);
        char b[]=tochararr(str2);
        for (int i = 0; i < k; ++i) {
            if (((int) a[i] > 90 && (int) a[i] < 97) || ((int) b[i] > 90 && (int) b[i] < 97)) {
                if (a[i] == b[i])
                    temp++;
            } else {
                if (a[i] == b[i] || abs(a[i] - b[i]) == 32) {
                    temp++;
                }
            }
        }
        if (temp == k) {

            return true;
        }
        else return false;

    }
}
