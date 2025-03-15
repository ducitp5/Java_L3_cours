package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
 
public class MapEx2 {
 
    public static void main(String[] args) {
    	
        Map<String, String> phonebook = new HashMap<String, String>();
 
        phonebook.put("01000005", "Tom");
        phonebook.put("01000002", "Jerry");
        phonebook.put("01000003", "Tom");
        phonebook.put("01000004", "Donald");
        
        Set<Map.Entry<String,String>> contacts = phonebook.entrySet();
 
        for (Map.Entry<String,String> contact: contacts) {
        	
            String phoneNumber 	= contact.getKey();
            String name 		= contact.getValue();
            
            System.out.println("Phone Number: " + phoneNumber + " ==> Name: " + name);
        }
        
        System.out.println("--- END ---");

    }
}