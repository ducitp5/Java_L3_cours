package partie4.mvc.defaultt;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Controleur {
	private final Chat chat = new Chat();
	private final String userPrefixe = "toto";

	public Controleur() {
		JFrame frame = new JFrame();
		frame.add(createPanel(userPrefixe));
		frame.pack();
		frame.setVisible(true);
	}

	private JPanel createPanel(final String userName) {
		PanelChat panel = new PanelChat(chat);
		// abonnement du controleur aux événements de l'interface graphique
		panel.addPanelChatListener(new PanelChatListener() {
			@Override
			public void messageAEnvoyer(String text) {
				// dans un cas réel, on ferait appel ici au serveur de chat …
				// on se contente pour le moment de modifier notre modèle
				chat.addMessage(userName, text);
			}
		});
		return panel;
	}
	
	
	
}