package BLL.processes;

import BLL.domain.Client;
import BLL.domain.Contact;
import BLL.domain.ContactType;

import java.util.Collection;
import java.util.stream.Collectors;

public class NotificationTask {

    public void notifyClient(Client client,ContactType  contactType){
        for (Contact contact : client.getContacts()) {
            if(contact.getContactType().equals(contactType)){
//                TODO send notification
            }
        }
    }

    public void notifyRaheal(String contact){
//        TODO send notification
    }
}
