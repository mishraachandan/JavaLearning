//package practice;
//
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//import org.apache.poi.ss.usermodel.*;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//public class WebScraperToExcel {
//
//    public static void main(String[] args) {
//        // URL of the website to scrape
//        String url = "https://www.scrapethissite.com/pages/simple/";  // Replace with the actual URL
//
//        // Folder where the file will be stored
//        String folderPath = "D:\\ScrappedData";
//
//        // Ensure the folder exists
//        File folder = new File(folderPath);
//        if (!folder.exists()) {
//            folder.mkdir();
//        }
//
//        // File path for storing the Excel file
//        String filePath = folderPath + "\\country_data.xlsx";
//
//        try {
//            // Connect to the website and fetch the HTML
//            Document document = Jsoup.connect(url).get();
//
//            // Select all elements with class "country-name"
//            Elements countryNameElements = document.select(".country-name");
//
//            // Create a new workbook and sheet
//            Workbook workbook = new XSSFWorkbook();
//            Sheet sheet = workbook.createSheet("Country Data");
//
//            // Create a header row
//            Row headerRow = sheet.createRow(0);
//            Cell headerCell = headerRow.createCell(0);
//            headerCell.setCellValue("Country");
//
//            // Iterate over the selected elements and add country names to the sheet
//            for (int i = 0; i < countryNameElements.size(); i++) {
//                Element countryNameElement = countryNameElements.get(i);
//
//                // Extract the text content of the element and convert to uppercase
//                String countryName = countryNameElement.text().trim().toUpperCase();
//
//                // Create a new row and cell
//                Row row = sheet.createRow(i + 1);
//                Cell cell = row.createCell(0);
//
//                // Set the country name in the cell
//                cell.setCellValue(countryName);
//            }
//
//            // Write the workbook to a file
//            try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
//                workbook.write(fileOut);
//            }
//
//            System.out.println("Scraping and storing country data in Excel successful. File saved at: " + filePath);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
