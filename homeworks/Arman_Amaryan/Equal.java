
public class Equal {
    public static void main(String[] args) {
        boolean ardyunq = hello("Hello Harut", "Hello Harut");
        System.out.println(ardyunq);
    }

    static boolean hello(String str, String str1) {
        char[] result = str.toCharArray();
        char[] result1 = str1.toCharArray();
        boolean havasare = true;
        if (str.length() != str1.length()) {
            havasare = false;
                    return false;
        }
        for (int i = 0; i < result.length; ++i) {
            if (result[i] != result1[i]) {
                havasare = false;
                return havasare;
            }
        }
        return havasare;

    }

}
