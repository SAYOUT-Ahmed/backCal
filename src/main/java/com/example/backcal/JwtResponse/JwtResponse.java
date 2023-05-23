package com.example.backcal.JwtResponse;

import java.util.List;

public class JwtResponse {

    private Long id;
    private String token;

    private String type = "Bearer";


    private String email;
    private String username;

    private List<String> roles;

    public JwtResponse(Long id, String token, String type, String email, String username, List<String> roles) {
        this.id = id;
        this.token = token;
        this.type = type;
        this.email = email;
        this.username = username;
        this.roles = roles;
    }

    public JwtResponse(String jsonWebToken, Long id, String username, String email, List<String> roles) {
        this.token = jsonWebToken;
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccessToken() {
        return token;
    }

    public void setAccessToken(String token) {
        this.token = token;
    }

    public String getTokenType() {
        return type;
    }

    public void setTokenType(String type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
