import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader;
        Pattern pattern = Pattern.compile("(?s)/\\*(.)*?\\*/");
        try {
            reader = new BufferedReader(new FileReader(
                    "/home/mher/Downloads/armat.sh"));
            String line = reader.readLine();
            while (line != null) {


                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    System.out.println(matcher.group());
                }

                // read next line
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}