public class Replacer {

    public static void main(String[] args) {
        replacel("kataryal ", "a", "b");
    }

    public static void replacel (String text, String oldw, String neww) {
        for (int i = 0; i < text.length(); ++i) {
            int temp = 0;
            if (text.charAt(i) == oldw.charAt(0)) {
                for (int j = 1; j < oldw.length(); ++j) {
                    if (text.charAt(i + j) == oldw.charAt(j)) {
                        temp++;
                    }
                }
            }
            if (temp == (oldw.length() - 1))
                text = text.substring(0, i) + neww + text.substring(i + oldw.length());
        }

        System.out.println(text);
    }
}
