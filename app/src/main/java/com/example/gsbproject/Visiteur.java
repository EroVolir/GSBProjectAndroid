package com.example.gsbproject;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Visiteur implements  Serializable {

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
    @SerializedName("dateEmbauche")
    private String dateEmbauche;
    @SerializedName("user_id")
    private Integer user_id;
    @SerializedName("User")
    private User user;

    public Visiteur (Integer id, String matricule, String nom, String prenom, String tel, String mail, String dateEmbauche, Integer userId, User user ) {
        this.id = id;
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.mail = mail;
        this.dateEmbauche = dateEmbauche;
        this.user_id = userId;
        this.user = user;
    }

    public String toString(){
        return "Visiteur{" +
                "id=" + id + '\'' +
                "matricule=" + matricule + '\'' +
                "nom=" + nom + '\'' +
                "prenom=" + prenom + '\'' +
                "tel=" + tel + '\'' +
                "mail=" + mail + '\'' +
                "dateEmbauche=" + dateEmbauche + '\'' +
                "userId=" + user_id + '\'' +
                "user=" + user.toString() + '\'' +
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

    public String getDateEmbauche(){
        return dateEmbauche;
    }

    public void setDateEmbauche(String dateEmbauche){
        this.dateEmbauche = dateEmbauche;
    }

    public Integer getUserId(){
        return user_id;
    }

    public void setUserId(Integer userid){
        this.user_id = userid;
    }

    public User getUser() { return user; }

    public void setUser( User user) { this.user = user; }


}
