package BLL.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Client {

    private Integer primaryId;

    private String firstName;
    private String lastName;
    private String IDNumber;
    private LocalDate dateOfBirth;
    private LocalDateTime memberSince;
    private List<Contact> contacts;

    public Client(Integer primaryId, String firstName, String lastName, String IDNumber, LocalDate dateOfBirth,
                  LocalDateTime memberSince, List<Contact> contacts) {
        this.primaryId = primaryId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.IDNumber = IDNumber;
        this.dateOfBirth = dateOfBirth;
        this.memberSince = memberSince;
        this.contacts = contacts;
    }

    public Client() {
    }

    public Integer getPrimaryId() {
        return primaryId;
    }

    public void setPrimaryId(Integer primaryId) {
        this.primaryId = primaryId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDateTime getMemberSince() {
        return memberSince;
    }

    public void setMemberSince(LocalDateTime memberSince) {
        this.memberSince = memberSince;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
