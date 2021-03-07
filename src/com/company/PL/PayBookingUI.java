package com.company.PL;

import BLL.domain.Booking;
import BLL.domain.Client;
import BLL.processes.BookingTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayBookingUI {
    private final BookingTask bookingTask = new BookingTask();

    private final InputStreamReader streamReader = new InputStreamReader(System.in);
    private final BufferedReader bufferedReader = new BufferedReader(streamReader);

    public void payBookingUI(Client client) {
        assert (client != null);
        try {
            System.out.println("Provide the booking reference that you would like to pay");
            String bookingReference = bufferedReader.readLine();
            Booking bookingByReference = bookingTask.findBookingByReference(bookingReference);
            Booking booking = bookingByReference;
            if (bookingByReference != null) {
                System.out.printf("The total amount for the booking including discount is %s"
                        , bookingByReference.getDiscountedPrice());
                System.out.println("1. Pay full amount\n2. Pay 50%");
                String amountPaymentOption = bufferedReader.readLine();
                switch (Integer.parseInt(amountPaymentOption)) {
                    case 1: {
                        booking = bookingTask.payBooking(bookingByReference, 100);

                        break;
                    }
                    case 2: {
                        booking = bookingTask.payBooking(bookingByReference, 50);
                        break;
                    }

                }
                System.out.println("Payment is successful!");
                System.out.printf("Your Balance is now %s"
                        , booking.getDiscountedPrice() - booking.getAmountPaid());
            } else {
                System.out.printf("Unfortunately no bookings with %s were found%n", bookingReference);
            }
        } catch (IOException e) {
            System.out.println("Error! Invalid input. " + e);
        }
    }
}
