package org.example.generator.user.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Slf4j
class UserResourceTest {

    private final String baseUrl = "http://localhost:8080";

    private final RestTemplate restTemplate = new RestTemplate();

    @Test
    void testFindAllUsers() {
        String url = baseUrl + "/users";
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());

        log.debug("Response body: " + responseEntity.getBody());
    }

    @Test
    void testFindUserById() {
        String userId = "123";
        String url = baseUrl + "/users/{id}";

        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class, userId);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());

        log.debug("Response body: " + responseEntity.getBody());
    }
}
