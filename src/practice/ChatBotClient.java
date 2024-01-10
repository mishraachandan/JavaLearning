package practice;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class ChatBotClient {

    public static void main(String[] args) throws Exception {
        // Set the URL of the chat bot
        String chatBotUrl = "https://data.cms.gov/provider-data/api/1/search?page=1&page-size=20&theme=Supplier%20directory&keyword=Facilities";

        // Set the user input
//        String userInput = "Hello, ChatBot!";

        // Prepare form data
//        Map<Object, Object> data = new HashMap<>();
//        data.put("userInput", userInput);

        // Build the request
        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create(chatBotUrl))
                .header("Content-Type", "application/json")
                .GET()
                .build();

        // Create an HTTP client
        HttpClient client = HttpClient.newHttpClient();

        try {
            // Send the request and get the response
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 403){
                throw new Exception("It did not worked.");
            }
            // Print the response
            System.out.println("ChatBot's Response: " + response.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Helper method to build form data from a Map
    private static HttpRequest.BodyPublisher buildFormDataFromMap(Map<Object, Object> data) {
        var builder = new StringBuilder();
        for (Map.Entry<Object, Object> entry : data.entrySet()) {
            if (!builder.isEmpty()) {
                builder.append("&");
            }
            builder.append(URLEncoder.encode(entry.getKey().toString(), StandardCharsets.UTF_8));
            builder.append("=");
            builder.append(URLEncoder.encode(entry.getValue().toString(), StandardCharsets.UTF_8));
        }
        return HttpRequest.BodyPublishers.ofString(builder.toString());
    }
}
