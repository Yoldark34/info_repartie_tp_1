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
public class Consommateur extends Thread {

	private Buffer buf;
	private int identite;

	public Consommateur(Buffer buf, int identite) {
		this.buf = buf;
		this.identite = identite;
	}

	@Override
	public void run() {
		String val = "";
		for (int i = 0; i < 100; i++) {
			val = buf.prendre(this.identite);
			try {
				sleep((int) (Math.random() * 200));
			} catch (InterruptedException e) {
			}
		}
	}
}
