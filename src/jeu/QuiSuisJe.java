package jeu;

import controleur.Controleur;

public class QuiSuisJe {

	public static void main(String[] args) {
		
		/*Joueur valentin = new Joueur();
		System.out.println(valentin);*/
		
		Controleur c = new Controleur();		
		c.jouer();
		
		// notre usage simplifi� de fen�tres de dialogues n�cessite de forcer l'arr�t complet du programme,
		// m�me une fois que la m�thode main est "termin�e".
		System.exit(0);
		
	}

}