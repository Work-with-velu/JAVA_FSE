package java_http.src;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class GitHubApiExample {
    public static void main(String[] args) {
    try {
    
    HttpClient client = HttpClient.newHttpClient();
            
            HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://api.github.com/users/octocat"))
            .GET()
            .build();


    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

    
    System.out.println("Status Code: " + response.statusCode());
    System.out.println("Raw Response:\n" + response.body());


    JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();
    System.out.println("\nParsed Result:");
    System.out.println("Name: " + json.get("name").getAsString());
    System.out.println("Public Repos: " + json.get("public_repos").getAsInt());
    System.out.println("Followers: " + json.get("followers").getAsInt());

} catch (Exception e) {
    System.err.println("Error: " + e.getMessage());
    e.printStackTrace();
}
}
}
}
