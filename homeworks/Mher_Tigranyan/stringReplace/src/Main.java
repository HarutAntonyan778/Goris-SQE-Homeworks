//not working yet
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        String originalString = "This car is my car";
        String replacedString = replaceMethod(originalString, "car", "bike");
        System.out.println(replacedString);
    }
    static int leng;
    static String replaceMethod(String str, String from, String to)
    {
        for (int i = 0; i<str.length(); i++){
            for (int j = 0; j<from.length(); j++){
                if (str.charAt(i) == from.charAt(j)){
                    i++;
                    j++;
                }
                if (j >= from.length()){
                    leng= i-from.length()+to.length()+str.length()-i;
                    str = changeMethod(str, i-from.length(), i);
                }
            }
        }
        return str;
    }
    static String changeMethod(String rString, int p1, int p2){

        char[] ch = new char[leng];
        for (int i=0; i< leng; i++){
            if (i<=p1) {
                ch[i] = rString.charAt(i);
            } else if (i>p1 && i<p2){
                for (int k = 0; k<p2-p1; k++){
                    ch[i] =  
                }
            }
        }
        return rString;
    }

}