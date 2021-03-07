package BLL.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

public class Client {

    private Integer primaryId;

    private String firstName;
    private String lastName;
    private String IDNumber;
    private LocalDate dateOfBirth;
    private LocalDateTime memberSince;
    private List<Contact> contacts;
    private String username;
    private String password;

    public Client(Integer primaryId, String firstName, String lastName, String IDNumber, LocalDate dateOfBirth,
                  LocalDateTime memberSince, List<Contact> contacts, String username, String password) {
        this.primaryId = primaryId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.IDNumber = IDNumber;
        this.dateOfBirth = dateOfBirth;
        this.memberSince = memberSince;
        this.contacts = contacts;
        this.username = username;
        this.password = password;
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
        int year = Integer.parseInt(this.getIDNumber().substring(0, 2));
        int month = Integer.parseInt(this.getIDNumber().substring(2, 4));
        int date = Integer.parseInt(this.getIDNumber().substring(4, 6));
        if (year <= 99 && year > 20) {
            year = year + 1900;
        } else {
            year = year + 2000;
        }
        this.dateOfBirth = LocalDate.of(year, Month.of(month), date);
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
