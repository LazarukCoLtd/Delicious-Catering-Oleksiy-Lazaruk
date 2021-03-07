package com.company.PL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    private static final InputStreamReader streamReader = new InputStreamReader(System.in);
    private static final BufferedReader bufferedReader = new BufferedReader(streamReader);

    public static void main(String[] args) {
        try {
            System.out.println("Welcome to Delicious Catering");
            System.out.println("1. Login\n2. Register");
            String choice = bufferedReader.readLine();
            switch (Integer.parseInt(choice)) {
                case 1: {
                    LoginUI loginUI = new LoginUI();
                    loginUI.login();
                    break;
                }
                case 2: {
                    RegisterUI registerUI = new RegisterUI();
                    registerUI.registerClient();
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error! Invalid input. " + e);
        }
    }
}
