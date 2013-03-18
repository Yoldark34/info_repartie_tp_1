/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Yohan Sanchez (yohan.sanchez34@gmail.com)
 */
public class Buffer {

	private SuperListe superListe = new SuperListe();
	


	public synchronized String prendre(int identite) {
		while (!this.superListe.getDispo()) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		String result = this.superListe.getValeur();
		System.out.println("Consommateur #" + identite + " prend: " + result);
		notifyAll();
		return result;
	}



	public synchronized void mettre(int identite, String val) {
		while (this.superListe.isFull()) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		this.superListe.setValeur(val);
		System.out.println("Producteur #" + identite
				+ " met : " + val);
		notifyAll();
	}
}
