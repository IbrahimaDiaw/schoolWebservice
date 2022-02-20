package com.idb.model;

public class Etudiants {

    private String CodeEtudiant;
    private String prenom;
    private String nom;
    private java.sql.Date dateNaissance;
    private String codeClasse;

    public Etudiants() {
    }
    
    
    public String getCodeEtudiant() {
        return CodeEtudiant;
    }

    public void setCodeEtudiant(String CodeEtudiant) {
        this.CodeEtudiant = CodeEtudiant;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public java.sql.Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(java.sql.Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getCodeClasse() {
        return codeClasse;
    }

    public void setCodeClasse(String codeClasse) {
        this.codeClasse = codeClasse;
    }
    
    

    
}
