public class EqualsMethod {
    public static void main(String[] args) {
        boolean result = equalsMethod("Hello","Hello");
        System.out.println(result);

    }
    static boolean equalsMethod(String str1, String str2){
        boolean result = true;
        if (str1.length() != str2.length()){
            return false;
        }
        for (int i = 0; i < str1.length(); i++){
            if (str1.charAt(i) != str2.charAt(i)){
                result = false;
            }
        }
        return result;
    }
}
