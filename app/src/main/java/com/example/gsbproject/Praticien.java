package com.example.gsbproject;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Praticien implements Serializable {

    @SerializedName("id")
    private Integer id;
    @SerializedName("matricule")
    private String matricule;
    @SerializedName("nom")
    private String nom;
    @SerializedName("prenom")
    private String prenom;
    @SerializedName("tel")
    private String tel;
    @SerializedName("mail")
    private String mail;
    @SerializedName("adresse")
    private String adresse;
    @SerializedName("codepostal")
    private String codepostal;
    @SerializedName("ville")
    private String ville;
    @SerializedName("specialite_id")
    private Integer specialite_id;
    @SerializedName("type_id")
    private Integer type_id;
    @SerializedName("visiteur_id")
    private Integer visiteur_id;
    @SerializedName("visiteur")
    private Visiteur visiteur;

    public Praticien (Integer id, String matricule, String nom, String prenom, String tel, String mail, String adresse , String codePostal , String ville , Integer specialiteId , Integer typeId , Integer visiteurId, Visiteur visiteur) {
        this.id = id;
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.mail = mail;
        this.adresse = adresse;
        this.codepostal= codePostal;
        this.ville = ville;
        this.specialite_id = specialiteId;
        this.type_id = typeId;
        this.visiteur_id = visiteurId;
        this.visiteur = visiteur;
    }

    public String toString(){
        return "Visiteur{" +
                "ID=" + id + '\'' +
                "matricule=" + matricule + '\'' +
                "nom=" + nom + '\'' +
                "prenom=" + prenom + '\'' +
                "tel=" + tel + '\'' +
                "mail=" + mail + '\'' +
                "adresse=" + adresse + '\'' +
                "code postal=" + codepostal + '\'' +
                "ville=" + ville + '\'' +
                "Specialite ID=" + specialite_id + '\'' +
                "Type ID=" + type_id + '\'' +
                "Visiteur ID=" + visiteur_id + '\'' +
                "Visiteur=" + visiteur.toString() + '\'' +
                '}';
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getMatricule(){
        return matricule;
    }

    public void setMatricule(String matricule){
        this.matricule = matricule;
    }

    public String getNom(){
        return nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String getPrenom(){
        return prenom;
    }

    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public String getTel(){
        return tel;
    }

    public void setTel(String tel){
        this.tel = tel;
    }

    public String getMail(){
        return prenom;
    }

    public void setMail(String mail){
        this.mail = mail;
    }

    public String getAdresse(){
        return adresse;
    }

    public void setAdresse(String adresse){
        this.adresse = adresse;
    }

    public String getCodepostal(){
        return codepostal;
    }

    public void setCodepostal(String codepostal){
        this.codepostal = codepostal;
    }

    public String getVille(){
        return ville;
    }

    public void setVille(String ville){
        this.ville = ville;
    }

    public int getVisiteurId() {return visiteur_id; }

    public void setVisiteurId(int visiteur) { this.visiteur_id = visiteur; }

    public Visiteur getVisiteur() {return visiteur; }

    public void setVisiteur(Visiteur visiteur) { this.visiteur = visiteur; }

}
