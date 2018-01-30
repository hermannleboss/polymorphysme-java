/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcompte;

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


}
