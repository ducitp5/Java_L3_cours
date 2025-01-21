package cour_du_prof;

public interface ChatListener {

    /** une nouveau message a été ajouté dans le chat */
    void messageAdded(Chat chat,Message message);
    
}
