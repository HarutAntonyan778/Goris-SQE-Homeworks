import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static final String GOOGLE_SEARCH_URL = "https://www.google.com/search";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the search term.");
        String searchTerm = scanner.nextLine();

        scanner.close();

        String searchURL = GOOGLE_SEARCH_URL + "?q="+searchTerm;

        Document document = Jsoup.connect(searchURL).get();
        System.out.println(document.title());
//        Elements elements = document.select("h3.LC20lb");
        Elements elements = document.select("div.rc");
        for (Element element : elements) {
            System.out.println("");
            System.out.println(element.text());
        }
    }
}
