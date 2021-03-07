package com.company.PL;

import BLL.domain.Booking;
import BLL.domain.Client;
import BLL.domain.Decoration;
import BLL.domain.Event;
import BLL.domain.FoodSelections;
import BLL.processes.BookingTask;
import BLL.processes.EventTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class NewBookingUI {

    private final InputStreamReader streamReader = new InputStreamReader(System.in);
    private final BufferedReader bufferedReader = new BufferedReader(streamReader);

    public void bookingUI(Client client) {
        Booking booking = new Booking();
        Event event = new Event();
        BookingTask bookingTask = new BookingTask();
        EventTask eventTask = new EventTask();

        try {
            System.out.println("New Booking:");
            System.out.println("Event Theme");
            event.setTheme(bufferedReader.readLine());
            System.out.println("Amount of Adults attending");
            event.setPaxAdults(Integer.parseInt(bufferedReader.readLine()));
            System.out.println("Amount of Children attending");
            event.setPaxChildren(Integer.parseInt(bufferedReader.readLine()));
            System.out.println("Would you like venue to be decorated? Y/N");
            event.setDecorateVenue(bufferedReader.readLine().equals("Y"));
            List<Decoration> decorations = new ArrayList<>();
            boolean newDecorations;
            do {
                decorations.add(getDecorations(event.isDecorateVenue()));
                System.out.println("Would you like more decorations? Y/N");
                newDecorations = bufferedReader.readLine().equals("Y");
            } while (newDecorations);

            event.setDecorations(decorations);

            List<FoodSelections> foodSelections = new ArrayList<>();

            boolean newFoodSelection;
            do {
                foodSelections.add(getFoodSelection());
                System.out.println("Would you like more food selections? Y/N");
                newFoodSelection = bufferedReader.readLine().equals("Y");
            } while (newFoodSelection);

            event.setFoodSelections(foodSelections);

            System.out.println("Date of the Event: Please use YYYY/MM/DD format");
            event.setEventDate(LocalDate.parse(bufferedReader.readLine(), DateTimeFormatter.BASIC_ISO_DATE));
            System.out.println("Time the event will start");
            event.setEventTimeStart(LocalTime.parse(bufferedReader.readLine()));
            System.out.println("Time the event will end");
            event.setEventTimeEnd(LocalTime.parse(bufferedReader.readLine()));
            System.out.println("The address of the event");
            event.setEventAddress(bufferedReader.readLine());
        } catch (IOException e) {
            System.out.println("Error! invalid input. " + e);
        }
        Event savedEvent = eventTask.createNewEvent(event);

        booking.setClient(client);
        booking.setEvent(savedEvent);
        booking.setBookingTime(LocalDateTime.now());

        bookingTask.createNewBooking(booking);
    }

    private Decoration getDecorations(boolean decorate) {
        assert (decorate);
        Decoration decoration = new Decoration();
        try {
            System.out.println("What decorations would you like?");
            decoration.setDescription(bufferedReader.readLine());
            System.out.println("What colour must the decorations be?");
            decoration.setColour(bufferedReader.readLine());
        } catch (IOException e) {
            System.out.println("Error! Invalid input. " + e);
        }
        return decoration;

    }

    private FoodSelections getFoodSelection() {
        String choice = "";
        try {
            System.out.println("Choose the Cuisine that you prefer:");
            System.out.println("AM. Adult Meals\nKM. Kids Meals\nDR. Drinks\nDE. Dessert");
            choice = bufferedReader.readLine();
        } catch (IOException e) {
            System.out.println("Error! Invalid input. " + e);
        }
        switch (choice) {
            case "KM": {
                return FoodSelections.KIDMEALS;
            }
            case "DR": {
                return FoodSelections.DRINKS;
            }
            case "DE": {
                return FoodSelections.DESSERT;
            }
            default: {
                return FoodSelections.ADULTMEALS;
            }
        }

    }
}
