package com.teste.teste.Services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class TesteService {

    private final String apiUrl = "https://jsonplaceholder.typicode.com/posts";

    public String pegaOsPosts() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(apiUrl, String.class);
    }

    public String criaPosts(Map<String, Object> request) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject(apiUrl, request, String.class);
    }
}
