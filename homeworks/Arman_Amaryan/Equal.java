// Not working yet

public class Equal {

    public static void main(String args[]) {
        String str = "Hello World";
        String str1 = "Hello Harut";
        char[] result = str.toCharArray();
        char[] result1 = str1.toCharArray();
        for (int i = 0; i < result.length; ++i) {
            for (int j = 0; j < result1.length; ++j) {
                char ch1 = str.charAt(i);
                char ch2 = str1.charAt(j);
                if (ch1 == ch2) {
                    System.out.println(ch1 + "+" + ch2);
                }
                else {
                    System.out.println(ch1 + "-" + ch2);
                }
            }
        }
    }
}


