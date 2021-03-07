package com.company.PL;

import BLL.domain.Client;
import BLL.processes.ClientTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoginUI {

    private final InputStreamReader streamReader = new InputStreamReader(System.in);
    private final BufferedReader bufferedReader = new BufferedReader(streamReader);

    public void login() {
        try {
            System.out.println("LOGIN");
            System.out.println("Provide username");
            String username = bufferedReader.readLine();
            System.out.println("Provide password");
            String password = bufferedReader.readLine();
            ClientTask clientTask = new ClientTask();
            Client client = clientTask.login(username, password);
            if (client != null) {
                MainMenuUI menu = new MainMenuUI();
                menu.mainMenu(client);
            } else {
                System.out.println("Login failed. username and password are incorrect");
                System.out.println("1. Register\n2. Login");
                int authenticationOption = Integer.parseInt(bufferedReader.readLine());

                switch (authenticationOption) {
                    case 1: {
                        RegisterUI registerUI = new RegisterUI();
                        registerUI.registerClient();
                        break;
                    }
                    case 2: {
                        login();
                        break;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error! Invalid input. " + e);
        }
    }
}
