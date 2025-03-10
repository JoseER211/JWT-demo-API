package com.DEMOJWT.demo.dto;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

    private String user;
    private String pwd;
    private String token;

    public User() {
    }
    public User(String user, String pwd, String token) {
        this.user = user;
        this.pwd = pwd;
        this.token = token;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }


}
