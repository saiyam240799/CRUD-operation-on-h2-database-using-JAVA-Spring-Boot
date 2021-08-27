package com.example.demo;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = Demo4Application.class)
public class SpringIntegrationTest {
	
static HttpResponse<String> response = null;
	
	@Test
	void contextLoads() {
	}

	// Implemetation of GET Request
	 void executeGet(String url) throws Exception {
	      
		 HttpClient client = HttpClient.newHttpClient();
		 
		 HttpRequest request = HttpRequest.newBuilder()
		          .uri(URI.create(url))
		          .build();
		 
		 response =
		          client.send(request, BodyHandlers.ofString());
		 
		 System.out.println(response.body());
		 
	    }
	
}
