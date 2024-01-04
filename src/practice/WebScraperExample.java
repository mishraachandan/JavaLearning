package practice;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WebScraperExample {

    public static void main(String[] args) {
        // URL of the website to scrape
        String url = "https://www.scrapethissite.com/pages/simple/";

        // Folder where the file will be stored
        String folderPath = "D:\\ScrappedData";

        // Ensure the folder exists
        File folder = new File(folderPath);
        if (!folder.exists()) {
            folder.mkdir();
        }

        // File path for storing the scraped data
        String filePath = folderPath + "\\scraped_data.txt";

        try {
            // Connect to the website and fetch the HTML
            Document document = Jsoup.connect(url).get();

            // Select the elements you want to scrape
            Elements elementsToScrape = document.select("p"); // Change this selector as per your needs

            // Create a FileWriter to write to the file
//            try (FileWriter writer = new FileWriter(filePath)) {
//                // Iterate over the selected elements and write to the file
//                for (Element element : elementsToScrape) {
//                    writer.write(element.text() + "\n");
//                }
//            }

            // Select all elements with class "country-name"
            Elements countryNameElements = document.select(".country-name");

            // Create a FileWriter to write to the file
            try (FileWriter writer = new FileWriter(filePath)) {
                // Iterate over the selected elements and write country names to the file
                for (Element countryNameElement : countryNameElements) {
                    // Extract the text content of the element and convert to uppercase
                    String countryName = countryNameElement.text().trim().toUpperCase();
                    System.out.println("CountryNameElement:: " + countryNameElement);
                    // Write the country name to the file
                    writer.write(countryName + "\n");
                }
            }


            System.out.println("Scraping and storing data successful. File saved at: " + filePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
