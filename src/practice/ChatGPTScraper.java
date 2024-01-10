package practice;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ChatGPTScraper {

    public static void main(String[] args) {
        try {
            // Set the URL of the ChatGPT website
            String chatGPTUrl = "https://www.perplexity.ai/";

            // Set user input
            String userInput = "Hello, ChatGPT!";

            // Make a POST request with user input
            Connection.Response response = Jsoup.connect(chatGPTUrl)
                    .data("userInput", userInput)
                    .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36")
                    .method(Connection.Method.POST)
                    .execute();

            // Get the HTML document from the response
            Document document = response.parse();

            // Extract the answer from the document
            String answer = document.select("prose dark:prose-invert inline leading-normal break-words min-w-0 [word-break:break-word]").text();

            // Print the answer
            System.out.println("ChatGPT's Answer: " + answer);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
