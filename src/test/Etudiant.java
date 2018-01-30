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
public class Etudiant extends Personne {

    public String classe;

    public Etudiant(String classe, String nom) {
        super(nom);
        this.classe = classe;
    }

    public String getClasse() {
        return this.classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void sePresenter() {
        System.out.println("je suis un etudiant je me nomme " + super.getNom() + "je suis en " + this.classe);
    }
}
