import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String URL = "https://stackoverflow.com/";
        printLink(URL);

    }

    public static void printLink(String url) throws IOException {
        Document doc = Jsoup.connect(url).get();

        Elements links = doc.select("a");
        for (Element element : links) {
            String newLink = element.attr("abs:href");
            if (!newLink.isEmpty()) {
                Connection.Response response = Jsoup.connect(newLink)
                        .followRedirects(true)
                        .method(Connection.Method.GET)
                        .ignoreContentType(true)
                        .ignoreHttpErrors(true)
                        .execute();
//                System.out.println(newLink);
                if (response.statusCode() >= 400) {
                    System.out.println(response.url());
                }
            }
        }
        for (Element subLink : links) {
            String absLink = subLink.attr("abs:href");
            if (!absLink.isEmpty()) {
                printLink(absLink);
            }
        }
    }
}