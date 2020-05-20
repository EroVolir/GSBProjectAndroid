package com.example.gsbproject;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Users implements Serializable{
    @SerializedName("users")
    private List<User> users;

    public Users(List<User> users) {this.users = users; }

    public List<User> getUsers() { return users; }

    public void setUsers(List<User> users) { this.users = users; }
}