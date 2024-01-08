package org.example.generator.user.controller;

import java.util.List;
import java.util.UUID;

import lombok.RequiredArgsConstructor;
import org.example.generator.user.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("users")
public class UserResource {

    @GetMapping
    public List<User> findAll() {
        return List.of(User.sample());
    }

    @GetMapping("{id}")
    public User find(
        @PathVariable String id
    ) {
        return new User(id, UUID.randomUUID().toString());
    }
}
