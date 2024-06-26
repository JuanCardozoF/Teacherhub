package com.example.teacherhub.models;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("id")
    private String id;
    @SerializedName("nickname")
    private String username;
    @SerializedName("email")
    private String email;
    private String password;
    @SerializedName("active")
    private boolean is_active;
    @SerializedName("idRole")
    private String id_role;
    private static User Instance;

    public User(String id, String username, String email, String password, boolean is_active, String id_role) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.is_active = is_active;
        this.id_role = id_role;
        Instance = User.this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public String getId_role() {
        return id_role;
    }

    public void setId_role(String id_role) {
        this.id_role = id_role;
    }

    public static User getInstance() {
        return Instance;
    }
}

