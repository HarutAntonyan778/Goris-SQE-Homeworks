import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String URL = "https://ok.ru";
        printLink(URL);

    }

    public static void printLink(String url) throws IOException{
        Document doc = Jsoup.connect(url).get();

        Elements links = doc.select("a");
        for (Element element : links) {
            String newLink = element.attr("abs:href");
            if (!newLink.isEmpty()) {
                Connection.Response response = Jsoup.connect(newLink)
                        .method(Connection.Method.GET)
                        .ignoreContentType(true)
                        .ignoreHttpErrors(true)
                        .execute();
                if (response.statusCode() >= 400) {
                    System.out.println(newLink);
                }

            }
            printLink(newLink);
        }
    }
}