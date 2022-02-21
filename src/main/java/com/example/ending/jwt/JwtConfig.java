package com.example.ending.jwt;

import com.google.common.net.HttpHeaders;
import io.jsonwebtoken.security.Keys;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import javax.crypto.SecretKey;

@ConfigurationProperties(prefix = "application.jwt")
public class JwtConfig {

    private String secretKey;
    private String tokenPrefix;
    private Integer tokenExpirationAfterdays;

    public JwtConfig() {
    }

    public JwtConfig(String secretKey, String tokenPrefix, Integer tokenExpirationAfterdays) {
        this.secretKey = secretKey;
        this.tokenPrefix = tokenPrefix;
        this.tokenExpirationAfterdays = tokenExpirationAfterdays;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getTokenPrefix() {
        return tokenPrefix;
    }

    public void setTokenPrefix(String tokenPrefix) {
        this.tokenPrefix = tokenPrefix;
    }

    public Integer getTokenExpirationAfterdays() {
        return tokenExpirationAfterdays;
    }

    public void setTokenExpirationAfterdays(Integer tokenExpirationAfterdays) {
        this.tokenExpirationAfterdays = tokenExpirationAfterdays;
    }



    public String getAuthorizationHeader(){
        return HttpHeaders.AUTHORIZATION;
    }
}
