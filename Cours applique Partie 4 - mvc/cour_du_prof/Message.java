package cour_du_prof;

public class Message {

private String user , message;

public Message(String user, String message) {
  this.user = user;
  this.message = message;
   }

public String getUser( ) {
    return user;
   }
public String getMessage( ) {
    return message;
   }
@Override
public String toString( ) {
    return user+" --> "+message;
   }
}
