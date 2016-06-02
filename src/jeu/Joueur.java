package jeu;

import utile.Personnage;

public class Joueur {

	// Les constantes statiques correspondant aux points du jeu
	private final static int TROUVE_ID = 10;
	private final static int COUT_ESSAI = -1;
	private final static int SCORE_INIT = 30;
	private final static int GAIN_PARTIE = 40;
	private final static int PERTE_PARTIE = 0;

	// Les attributs d'un joueur
	private String identite;
	private int score;

	//Constructeur affectant une identit� au joueur
	public Joueur() {
		super();
		setNouvelleIdentite();
		initScore();
	}

	//Accesseurs, il n'y a pas besoin de mutateur car seule Joueur manipule ses attributs.
	public int getScore() {
		return score;
	}

	public String getIdentite() {
		return identite;
	}

	//initScore
	private void initScore() {
		score = SCORE_INIT;
	}

	//setNouvelleIdentite
	private void setNouvelleIdentite() {
		identite = Personnage.donnerPerso();
	}

	/**
	 * Ajoute les points associ�s � une d�couverte de sa propre identit�
	 * et affecte une nouvelle identit� au joueur
	 */
	public void gererIdTrouvee() {
		score += TROUVE_ID;
		setNouvelleIdentite();
	}

	/**
	 * Compter une tentative r�t�e de d�couverte de sa propre identit�
	 */
	public void compterTentative() {
		score += COUT_ESSAI;
	}

	/**
	 * m�thode bool�enne mettant � jour le score apr�s une proposition du joueur et retournant si
	 * cette proposition �tait bonne ou non.
	 * @param proposition contient un nom de personnage propos� par le joueur
	 * @return si la proposition du joueur correspond � son identit�.
	 */
	public boolean isIdentiteTrouve(String proposition) {
		boolean rep=false;
		if (proposition == identite) {
			rep = true;
			compterTentative();
			gererIdTrouvee();
		} else {
			compterTentative();
		}
		return rep;
	}

	/**
	 * fonction bool�enne li�e au score
	 * @return si le joueur a gagn� ou non
	 */
	public boolean isGagnant() {
		boolean rep=false;
		if (score == GAIN_PARTIE) {
			rep = true;
		}
		return rep;
	}

	/**
	 * fonction bool�enne li�e au score
	 * @return si le joueur a perdu ou non
	 */
	public boolean isPerdant() {
		boolean rep=false;
		if (score == PERTE_PARTIE) {
			rep = true;
		}
		return rep;
	}

	@Override
	public String toString() {
		return "Joueur [identite=" + identite + ", score=" + score + "]";
	}

}
