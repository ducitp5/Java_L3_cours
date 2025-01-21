
public class P129 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Chat chat = new Chat( );
		// création d'un écouteur des événements en provenance de ce chat
		ChatListener chatListener =
		new ChatListener( ){
		@Override
		public void messageAdded(Chat chat, Message message) {
		System.out.println("Un nouveau message pour le chat ! "+message);
		}
		};
		// ajout de cet écouteur
		chat.addChatListener(chatListener);
		// programme utilisant le chat (très rudimentaire pour cet exemple)
		chat.addMessage("toto","Hello !");

	}

}
