package partie4.thread;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

public class ThreadBlink extends Thread {
	private boolean continuer = true;
	private JButton jbutton;

	public ThreadBlink(JButton jbutton) {
		System.out.println("ThreadBlink() - " +Thread.currentThread().getId());

		this.jbutton = jbutton;
	}

	public void run() {
		
		while (continuer) {

			sleep(500);

			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					jbutton.setBackground(
						jbutton.getBackground().equals(Color.RED) ? Color.GREEN : Color.RED);

					System.out.println("run Thread.currentThread - " +Thread.currentThread().getId());
					System.out.println("run Thread.state - " +Thread.currentThread().getState());

				}
			});
		}
	}

	public void arreter() {
		this.continuer = false;
	}

	public void sleep(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}