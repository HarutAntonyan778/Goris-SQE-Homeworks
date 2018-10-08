import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        String originalString = "This car is my car";
        String replacedString = replaceMethod(originalString, "car", "bike");
        System.out.println(replacedString);
    }

    static String replaceMethod(String str, String from, String to)
    {
        for (int i = 0; i<str.length(); i++){
            for (int j = 0; j<from.length(); j++){
                if (str.charAt(i) == from.charAt(j)){
                    i++;
                    j++;
                    
                }
            }
        }
        return str;
    }

}

