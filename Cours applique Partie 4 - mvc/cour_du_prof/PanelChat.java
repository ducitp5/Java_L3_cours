package cour_du_prof;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PanelChat extends JPanel {

	private JTextArea zoneDesMessagesRecus=new JTextArea(30,30);
	private JTextField messageAEnvoyer=new JTextField(20);

	public PanelChat(Chat chat){
		super(new BorderLayout());
		this.zoneDesMessagesRecus.setEditable(false);
		this.add(new JScrollPane(this.zoneDesMessagesRecus),BorderLayout.CENTER);

		JPanel panelEnvoi=new JPanel(new BorderLayout( ));
		panelEnvoi.add(this.messageAEnvoyer,BorderLayout.CENTER);
		JButton buttonEnvoi=new JButton("Envoi"); 

		ActionListener listener =new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				fireMessageAEnvoyer( );
			}};

		buttonEnvoi.addActionListener(listener);
		
		this.messageAEnvoyer.addActionListener(listener);
		panelEnvoi.add(buttonEnvoi,BorderLayout.EAST);
		this.add(panelEnvoi,BorderLayout.SOUTH);
		
		// on se met à l'écoute des modifications du chat
		chat.addChatListener(new ChatListener(){
			@Override
			public void messageAdded(Chat chat, Message message) {
				setChat(chat);
			}
		});   
		setChat(chat);
	}

	private void setChat(Chat chat){
		this.zoneDesMessagesRecus.setText(chat.toString());
	}
	private List<PanelChatListener> panelListeners=
			new ArrayList<PanelChatListener>( );

	public void addPanelChatListener(PanelChatListener listener){
		this.panelListeners.add(listener);
	}


	private void fireMessageAEnvoyer( ) {
		for (PanelChatListener listener : this.panelListeners)
			listener.messageAEnvoyer(this.messageAEnvoyer.getText( ));
		this.messageAEnvoyer.setText("");
	}

}