//not working yet
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        originalString = "This car is my car";
        replacedString = replaceMethod(originalString, "car", "bike");
        System.out.println(replacedString);
    }
    static int leng;
    static String originalString;
    static String replacedString;
    static int pivot1;
    static int pivot2;
    static String from;
    static String to;
    static String replaceMethod(String str, String from, String to) {
        for (int i = 0; i<str.length(); i++){
            for (int j = 0; j<from.length(); j++){
                if (str.charAt(i) == from.charAt(j)){
                    i++;
                    j++;
                }
                if (j >= from.length()){
                    leng= i-from.length()+to.length()+str.length()-i;
                    pivot1=i-from.length();
                    pivot2=i;
                    str = changeMethod();
                }
            }
        }
        return str;
    }
    static String changeMethod(){

        char[] ch = new char[leng];
        for (int i=0; i< leng; i++){
            if (i<=pivot1) {
                ch[i] = originalString.charAt(i);
            } else if (i>pivot1 && i<pivot2){
                for (int k = 0; k<to.length(); k++) {
                    ch[i] = to.charAt(k);
                    i++;
                }
              i=i-to.length()+from.length();
            }  else {
                ch[i] = originalString.charAt(i-to.length()-from.length());
            }
        }
        replacedString = ch.toString();
        return replacedString;
    }

}