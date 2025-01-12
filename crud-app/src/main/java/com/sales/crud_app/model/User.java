package com.sales.crud_app.model;

public class User {
    private Long id;
    private String email;
    private String password;

    // Constructor
    public User(Long id, String email, String password) {
        this.email = email;
        this.password = password;
        this.id = id;
    }

    // Getters and Setters
    // id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
