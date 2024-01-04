package practice;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.select.Elements;

import java.io.IOException;

public class WebScrapping {

    public static void main(String[] args) {
        try {
            String url = "https://markets.businessinsider.com/currencies"; // Replace with the URL of the website you want to scrape
            Document doc = Jsoup.connect(url).get();

            // Select and extract elements from the HTML
            Elements links = doc.select("a"); // Select all anchor elements
            for (Element link : links) {
                System.out.println("Title: " + link.text()); // Print the text (title) of each link
                System.out.println("URL: " + link.attr("href")); // Print the URL of each link
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
