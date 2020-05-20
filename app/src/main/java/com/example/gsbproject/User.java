package com.example.gsbproject;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class User implements  Serializable {

    @SerializedName("id")
    private Integer id;
    @SerializedName("username")
    private String username;
    @SerializedName("role")
    private String role;
    @SerializedName("api_key")
    private String api_key;
    @SerializedName("api_key_plain")
    private String api_key_plain;

    public User (Integer id, String username, String role, String apiKey, String apiKeyPlain) {
        this.id = id;
        this.username = username;
        this.role = role;
        this.api_key = apiKey;
        this.api_key_plain = apiKeyPlain;
    }

    public String toString(){
        return "Visiteur{" +
                "id=" + id + '\'' +
                "username=" + username + '\'' +
                "role=" + role + '\'' +
                "api Key=" + api_key + '\'' +
                "api Key Plain=" + api_key_plain + '\'' +
                '}';
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }
    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getRole(){
        return role;
    }

    public void setRole(String role){
        this.role = role;
    }

    public String getApi_key(){
        return api_key;
    }

    public void setApi_key(String api_key){
        this.api_key = api_key;
    }

    public String getApi_key_plain(){
        return api_key_plain;
    }

    public void setApi_key_plain(String api_key_plain){
        this.api_key_plain = api_key_plain;
    }



}
