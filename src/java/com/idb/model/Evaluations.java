/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.idb.model;

import java.sql.Date;

/**
 *
 * @author IBRAHIMA IBNU OMAR
 */
public class Evaluations {
        private String type;
	private Date  dateEvaluation;
	private double note;
	private Etudiants codeEtudiant;
	private Matieres codeMatiere;

        public Evaluations() {
        }

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the dateEvaluation
	 */
	public Date getDateEvaluation() {
		return dateEvaluation;
	}
	/**
	 * @param dateEvaluation the dateEvaluation to set
	 */
	public void setDateEvaluation(Date dateEvaluation) {
		this.dateEvaluation = dateEvaluation;
	}
	/**
	 * @return the note
	 */
	public double getNote() {
		return note;
	}
	/**
	 * @param note the note to set
	 */
	public void setNote(double note) {
		this.note = note;
	}
	/**
	 * @return the codeEtudiant
	 */
	public Etudiants getCodeEtudiant() {
		return codeEtudiant;
	}
	/**
	 * @param codeEtudiant the codeEtudiant to set
	 */
	public void setCodeEtudiant(Etudiants codeEtudiant) {
		this.codeEtudiant = codeEtudiant;
	}
	/**
	 * @return the codeMatiere
	 */
	public Matieres getCodeMatiere() {
		return codeMatiere;
	}
	/**
	 * @param codeMatiere the codeMatiere to set
	 */
	public void setCodeMatiere(Matieres codeMatiere) {
		this.codeMatiere = codeMatiere;
	}
}
