package partie4.thread;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class P225 {

	public static void main(String[] args) {
		
		System.out.println("main threadId - " +Thread.currentThread().getId());
		
		JButton 			button 	= new JButton("OK");
		
		final ThreadBlink 	thread 	= new ThreadBlink(button);
		System.out.println("ThreadBlink.getId -- " +thread.getId());

		Thread 				tb 		= new ThreadAfficheLettre('b', 3);
		Thread 				tc 		= new ThreadAfficheLettre('c', 5);

		System.out.println("main threadId 2 - " +Thread.currentThread().getId());

		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {	
			
				System.out.println("thread.getId -- " +thread.getId());
				System.out.println("status - " +thread.getState());
				System.out.println("Thread.currentThread - " +Thread.currentThread().getId());

				thread.start(); 	
				
				System.out.println("status 2 - " +thread.getState());
				System.out.println("thread.getId 2 - " +thread.getId());

			}
		});
		
		System.out.println("main threadId 3 - " +Thread.currentThread().getId());

		tb.start();
		tc.start();
		// création de la JFrame avec le bouton au centre

		JFrame frame = new JFrame();
		
		frame.getContentPane().add(button, BorderLayout.CENTER);
		
		frame.pack();
		frame.setVisible(true);
	}

}
