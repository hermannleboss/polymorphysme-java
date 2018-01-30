/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author HR le Boss Pimenté
 */
public class Professeur extends Personne {

    public String matiere;

    public Professeur(String matiere, String nom) {
        super(nom);
        this.matiere = matiere;
    }

    public String getMatiere() {
        return this.matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public void sePresenter() {
        System.out.println("je suis un professeur je me nomme " + super.getNom() + " j'enseigne " + this.getMatiere());
    }

}
