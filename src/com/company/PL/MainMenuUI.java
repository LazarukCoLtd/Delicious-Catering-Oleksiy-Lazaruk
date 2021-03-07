package com.company.PL;

import BLL.domain.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainMenuUI {

    private final InputStreamReader streamReader = new InputStreamReader(System.in);
    private final BufferedReader bufferedReader = new BufferedReader(streamReader);

    public void mainMenu(Client client) {
        try {
            System.out.println("Main Menu");
            System.out.println("1. New Booking\n2. Pay Booking\n3. View Bookings");
            int choice = Integer.parseInt(bufferedReader.readLine());

            switch (choice) {
                case 1: {
                    NewBookingUI bookingUI = new NewBookingUI();
                    bookingUI.bookingUI(client);
                    break;
                }
                case 2: {
                    PayBookingUI payBookingUI = new PayBookingUI();
                    payBookingUI.payBookingUI(client);
                    break;
                }
                case 3: {
                    // find all bookings for client
                }
            }
        } catch (IOException e) {
            System.out.println("Error! Invalid input " + e);
        }
    }
}
