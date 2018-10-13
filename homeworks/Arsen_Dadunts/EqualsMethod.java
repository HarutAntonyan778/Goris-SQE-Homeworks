public class EqualsMethod{
public static void main(String[] args) {
            boolean ardyunq = Equals("JavaS is best programing language", "Java is best programing language");
            System.out.println(ardyunq);
        }

        static boolean Equals(String text1, String text2) {
            char[] ardyunq1 = text1.toCharArray();
            char[] ardyunq2 = text2.toCharArray();
            boolean result = true;
            if (text1.length() != text2.length()) {
                result= false;
                return false;
            }
            for (int i = 0; i < ardyunq1.length; ++i) {
                if (ardyunq1[i] != ardyunq2[i]) {
                    result = false;
                    return result;
                }
            }
            return result;
        }
}
