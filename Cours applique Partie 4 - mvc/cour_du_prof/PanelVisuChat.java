package cour_du_prof;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PanelVisuChat extends JPanel {

    private JTextArea zoneDesMessagesRecus=new JTextArea(30,30);
         
    public PanelVisuChat(Chat chat){
    	super(new BorderLayout( ));
    	this.zoneDesMessagesRecus.setEditable(false);
    
   	this.add(new JScrollPane(this.zoneDesMessagesRecus),BorderLayout.CENTER);
         
    	setChat(chat);
       // on se met à l'écoute des modifications du chat
    	chat.addChatListener(new ChatListener(){
		@Override
		public void messageAdded(Chat chat, Message message) {
			setChat(chat);
			}
		});   
    }

    private void setChat(Chat chat){
         this.zoneDesMessagesRecus.setText(chat.toString());
    }
    
}
