package practice;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RestClient {

    public static void main(String[] args) {
        String apiUrl = "https://data.cms.gov/provider-data/api/1/search?page=1&page-size=20&theme=Supplier%20directory&keyword=Facilities";

        try {
            String result = sendGetRequest(apiUrl);
            System.out.println("API Response: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String sendGetRequest(String apiUrl) throws Exception {
        // Create an HTTP client
        HttpClient client = HttpClient.newHttpClient();

        // Build the request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .GET()
                .build();

        // Send the request and get the response
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Check if the request was successful (status code 200)
        if (response.statusCode() == 200) {
            return response.body();
        } else {
            throw new RuntimeException("Failed to fetch data. HTTP status code: " + response.statusCode());
        }
    }
}
