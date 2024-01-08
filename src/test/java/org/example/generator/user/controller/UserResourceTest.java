package org.example.generator.user.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

class UserResourceTest {

    private final String baseUrl = "http://localhost:8080";

    private final RestTemplate restTemplate = new RestTemplate();

    @Test
    void testFindAllUsers() {
        String url = baseUrl + "/users";
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);

        // HTTP 응답 상태가 200 OK 여부 확인
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());

        // 실제로는 JSON 응답 바디를 파싱하여 테스트하게 될 것입니다.
        // 여기서는 간단히 응답 문자열을 출력해 봅니다.
        System.out.println("Response body: " + responseEntity.getBody());
    }

    @Test
    void testFindUserById() {
        String userId = "123";
        String url = baseUrl + "/users/{id}";

        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class, userId);

        // HTTP 응답 상태가 200 OK 여부 확인
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());

        // 실제로는 JSON 응답 바디를 파싱하여 테스트하게 될 것입니다.
        // 여기서는 간단히 응답 문자열을 출력해 봅니다.
        System.out.println("Response body: " + responseEntity.getBody());
    }
}
