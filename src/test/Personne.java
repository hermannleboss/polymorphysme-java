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
public class Personne {

    private String nom;
    private Personne Directeur;

    public Personne() {
        this.nom = null;
        this.Directeur = null;
    }

    public Personne(String Nom) {
        this.nom = Nom;
        this.Directeur = new Personne();
    }

    public Personne(String Nom, Personne Directeur) {
        this.nom = Nom;
        this.Directeur = Directeur;
    }

    public void setNom(String Nom) {
        this.nom = Nom;
    }

    public void setDirecteur(Personne direc) {
        this.Directeur = direc;
    }

    public String getNom() {
        return this.nom;
    }

    public Personne getDirecteur() {
        return this.Directeur;
    }

    public void sePresenter() {
        System.out.println("je suis un persnonne je me nomme " + this.nom);
    }

}
