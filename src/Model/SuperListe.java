/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.List;
import java.util.LinkedList;

/**
 *
 * @author Yohan Sanchez (yohan.sanchez34@gmail.com)
 */
public class SuperListe extends List {

	private java.util.List<String> valeur = new LinkedList();
	private int taille = 4;
	private int libre = this.taille;

	public boolean getDispo() {
		if (valeur.size() > 0) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (valeur.size() == this.taille) {
			return true;
		}
		return false;
	}
	public String getValeur() {
		String result = this.valeur.get(0);
		this.valeur.remove(0);
		this.libre++;
		return result;
	}

	public void setValeur(String valeur) {
		this.valeur.add(valeur);
		this.libre--;
	}

}
