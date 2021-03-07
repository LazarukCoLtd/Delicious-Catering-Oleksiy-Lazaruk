package com.company.PL;

import BLL.domain.Client;
import BLL.domain.Contact;
import BLL.domain.ContactType;
import BLL.processes.ClientTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class RegisterUI {

    private final InputStreamReader streamReader = new InputStreamReader(System.in);
    private final BufferedReader bufferedReader = new BufferedReader(streamReader);

    public void registerClient() {
        Client newClient = new Client();
        System.out.println("Register new client");
        try {
            System.out.println("First Name:");
            newClient.setFirstName(bufferedReader.readLine());
            System.out.println("Last Name:");
            newClient.setLastName(bufferedReader.readLine());
            System.out.println("Identity Number:");
            newClient.setIDNumber(bufferedReader.readLine());
            System.out.println("Username:");
            newClient.setUsername(bufferedReader.readLine());
            System.out.println("Password:");
            newClient.setPassword(bufferedReader.readLine());

//        get all contacts
            newClient.setPassword(bufferedReader.readLine());
            boolean newContact;
            List<Contact> contactList = new ArrayList<>();
            do {
                contactList.add(getUserContact());
                System.out.println("Add New Contact? Y/N");
                String contactAnswer = bufferedReader.readLine();
                newContact = contactAnswer.equals("Y");
            } while (newContact);

            newClient.setContacts(contactList);

            ClientTask clientTask = new ClientTask();
            Client client = clientTask.createNewClient(newClient);

            if (client != null) {
                MainMenuUI mainMenuUI = new MainMenuUI();
                mainMenuUI.mainMenu(client);
            } else {
                System.out.println("Registration failed, Please try again.");
                this.registerClient();
            }
        } catch (IOException e) {
            System.out.println("Error! Invalid input. " + e);
        }

    }

    public Contact getUserContact() {
        Contact contact = new Contact();
        try {
            System.out.println("New Contact");

            System.out.println("Contact type:\nE. Email\nM. Mobile");
            String contactType = bufferedReader.readLine();

            System.out.println("Contact:");
            contact.setContact(bufferedReader.readLine());

            switch (contactType) {
                case "E": {
                    contact.setContactType(ContactType.EMAIL);
                }
                case "M": {
                    contact.setContactType(ContactType.MOBILE);
                }
            }
        } catch (IOException e) {
            System.out.println("Error! Invalid input. " + e);
        }
        return contact;
    }
}
