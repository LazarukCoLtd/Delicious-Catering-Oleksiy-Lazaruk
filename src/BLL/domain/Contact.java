package BLL.domain;

public class Contact {

    private Integer id;
    private String contact;
    private ContactType contactType;

    public Contact(Integer id, String contact, ContactType contactType) {
        this.id = id;
        this.contact = contact;
        this.contactType = contactType;
    }

    public Contact() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public ContactType getContactType() {
        return contactType;
    }

    public void setContactType(ContactType contactType) {
        this.contactType = contactType;
    }
}
