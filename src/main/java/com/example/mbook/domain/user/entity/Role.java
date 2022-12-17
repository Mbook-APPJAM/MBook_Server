package com.example.mbook.domain.user.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Role {
    ROLE_USER("USER", "유저"),
    ROLE_ADMIN("ADMIN", "어드민");

    private final String key;
    private final String title;
}
