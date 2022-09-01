package com.example.userservice.security;

public interface JwtProperties {
    String SECRET = "user_token";
    Long EXPIRATION_TIME = 86400000L;     // 24hours
}
