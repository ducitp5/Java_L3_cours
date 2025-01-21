import java.util.ArrayList;
import java.util.List;

public class Chat {

	private List<Message> listMessages = new ArrayList<Message>();

	public Chat() {
	}

/*	public void addMessage(String user, String text) {

		Message message = new Message(user, text);

		listMessages.add(message);
	}
*/
	@Override
	public String toString() {

		StringBuffer sb = new StringBuffer();

		for (Message message : listMessages)
			sb.append(message + "\n");

		return sb.toString();
	}

	/** la liste des �couteurs */
	private List<ChatListener> listeners = new ArrayList<ChatListener>();

	/** ajout d'un �couteur */
	public void addChatListener(ChatListener listener) {
		this.listeners.add(listener);
	}

	/** avertie tous les �couteurs qu'un nouveau message a �t� ajout� au chat */
	private void fireMessageAdded(Message message) {
		
		for (ChatListener listener : this.listeners)		listener.messageAdded(this, message);
	}
	
	
	public void addMessage(String user,String text){
		Message message=new Message(user,text);
		listMessages.add(message);
		fireMessageAdded(message);
		}
}
