package Les_Pages;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.TextEvent;
import java.awt.event.WindowEvent;
import java.util.EventListener;


public class P18 {

	interface ActionListener extends EventListener{
	
		public void actionPerformed(ActionEvent e);
	}
	
	interface KeyListener extends EventListener{
	
		public void 	keyPressed		(KeyEvent e);
		public void 	keyReleased		(KeyEvent e);
		public void 	keyTyped		(KeyEvent e);
	}
	
	interface FocusListener extends EventListener {
	
		public void 	focusGained		(FocusEvent e);
		public void 	focusLost		(FocusEvent e);
	}
	
	interface WindowListener extends EventListener{
	
		public void 	windowActivated		(WindowEvent e);
		public void 	windowClosed 		(WindowEvent e);
		public void 	windowClosing 		(WindowEvent e);
		public void 	windowDeactivated 	(WindowEvent e);
		public void 	windowDeiconified 	(WindowEvent e);
		public void 	windowIconified 	(WindowEvent e);
		public void 	windowOpened 		(WindowEvent e);
	}
	
	interface MouseListener extends EventListener{

		public void 	mouseClicked	(MouseEvent e);
		public void 	mouseEntered	(MouseEvent e);
		public void 	mouseExited		(MouseEvent e);
		public void 	mousePressed	(MouseEvent e);
		public void 	mouseReleased	(MouseEvent e);
	}
	
	interface MouseMotionListener extends EventListener {
	
		public void 	mouseDragged	(MouseEvent e);
		public void 	mouseMoved		(MouseEvent e);
	}

	interface ItemListener extends EventListener {

		public void 	itemStateChanged	(ItemEvent e);
	}
	
	interface TextListener extends EventListener {
	
		public void	 	textValueChanged	(TextEvent e);
	}
}
