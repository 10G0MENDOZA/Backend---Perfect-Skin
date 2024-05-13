package com.app.demo.persistence.entity;

public class Admin {
    private String username;
    private String password;
    // Constructor por defecto
    public Admin() {}

    // Constructor con parámetros
    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters y setters
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
