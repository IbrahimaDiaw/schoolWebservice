/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.idb.model;

/**
 *
 * @author IBRAHIMA IBNU OMAR
 */
public class Matieres {
    
    private String codeMatiere;
    private String libelle;
    private String description;

    public Matieres() {
        super();

    }

    /**
     * @return the codeMatiere
     */
    public String getCodeMatiere() {
        return codeMatiere;
    }

    /**
     * @param codeMatiere the codeMatiere to set
     */
    public void setCodeMatiere(String codeMatiere) {
        this.codeMatiere = codeMatiere;
    }

    /**
     * @return the libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * @param libelle the libelle to set
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
   
}
