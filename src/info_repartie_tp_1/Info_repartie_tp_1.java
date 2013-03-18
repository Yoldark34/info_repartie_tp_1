/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package info_repartie_tp_1;

import Model.Buffer;
import Model.Consommateur;
import Model.Producteur;

/**
 *
 * @author Yohan Sanchez (yohan.sanchez34@gmail.com)
 */
public class Info_repartie_tp_1 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Buffer c = new Buffer();
		Producteur p1 = new Producteur(c, 1);
		Producteur p2 = new Producteur(c, 2);

		Consommateur c1 = new Consommateur(c, 1);
		Consommateur c2 = new Consommateur(c, 2);
		Consommateur c3 = new Consommateur(c, 3);
		p1.start();
		//p2.start();
		c1.start();
		c2.start();
		//c3.start();
	}
}
