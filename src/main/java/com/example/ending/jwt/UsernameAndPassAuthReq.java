package com.example.ending.jwt;

public class UsernameAndPassAuthReq {

    private String username;
    private String password;

    public UsernameAndPassAuthReq() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
