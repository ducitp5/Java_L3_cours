package WindowAdapter;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowAdapter implements WindowListener {
	
	public void 	windowClosing		(WindowEvent event) {} 
	
	public void 	windowActivated		(WindowEvent event) {} 
	
	public void 	windowClosed 		(WindowEvent event) {} 
	
	public void 	windowDeactivated 	(WindowEvent event) {}
	
	public void 	windowDeiconified 	(WindowEvent event) {} 
	
	public void 	windowIconified 	(WindowEvent event) {} 
	
	public void 	windowOpened 		(WindowEvent event) {}
}