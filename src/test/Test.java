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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Personne[] liste = new Personne[3];
        Etudiant etu = new Etudiant("terminale", " HR le boss Pimenté ");
        Professeur prf = new Professeur("Java", " Le Boss ");
        Personne Per = new Personne("DUCON");
        liste[0] = etu;
        liste[1] = prf;
        liste[2] = Per;
        for (int i = 0; i < liste.length; i++) {
            liste[i].sePresenter();
        }
    }

}
