/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static java.lang.Thread.sleep;

/**
 *
 * @author Yohan Sanchez (yohan.sanchez34@gmail.com)
 */
public class Producteur extends Thread {

	private Buffer buf;
	private int identite;

	public Producteur(Buffer c, int n) {
		buf = c;
		this.identite = n;
	}

	@Override
	public void run() {
		String chaine = "Bonjour je suis un gros producteur, je vais t'inserer mon produit là ou je pense : dans ton placard !!";
		for (int i = 0; i < chaine.length(); i++) {
			buf.mettre(this.identite, chaine.substring(i, i + 1));
			/*try {
			 sleep((int) (Math.random() * 100));
			 } catch (InterruptedException e) {

			 }*/
		}
	}
}
