package partie4.mvc.defaultt;

public class P129 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Chat chat = new Chat( );
		// cr�ation d'un �couteur des �v�nements en provenance de ce chat
		ChatListener chatListener =
		new ChatListener( ){
		@Override
		public void messageAdded(Chat chat, Message message) {
		System.out.println("Un nouveau message pour le chat ! "+message);
		}
		};
		// ajout de cet �couteur
		chat.addChatListener(chatListener);
		// programme utilisant le chat (tr�s rudimentaire pour cet exemple)
		chat.addMessage("toto","Hello !");

	}

}
