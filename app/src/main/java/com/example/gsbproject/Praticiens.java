package com.example.gsbproject;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Praticiens implements Serializable {
    @SerializedName("praticiens")
    private List<Praticien> praticiens;

    public Praticiens(List<Praticien> praticiens) {this.praticiens = praticiens; }

    public List<Praticien> getPraticiens() { return praticiens; }

    public void setPraticiens(List<Praticien> praticiens) { this.praticiens = praticiens; }
}
