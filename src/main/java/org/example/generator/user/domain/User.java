package org.example.generator.user.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class User {

    private String id;

    private String name;

    public static User sample() {
        return new User(
            "hong",
            "홍길동"
        );
    }
}
