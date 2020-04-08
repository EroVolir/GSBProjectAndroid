package com.example.gsbproject;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Visiteurs implements Serializable{
    @SerializedName("visiteurs")
    private List<Visiteur> visiteurs;

    public Visiteurs(List<Visiteur> visiteurs) {this.visiteurs = visiteurs; }

    public List<Visiteur> getVisiteurs() { return visiteurs; }

    public void setVisiteurs(List<Visiteur> visiteurs) { this.visiteurs = visiteurs; }
}
