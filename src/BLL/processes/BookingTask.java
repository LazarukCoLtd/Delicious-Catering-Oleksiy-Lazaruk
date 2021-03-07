package BLL.processes;

import BLL.domain.Booking;
import BLL.domain.Event;
import BLL.domain.Statuses;
import BLL.util.BusinessRuleViolationException;
import DAL.dao.BookingDao;
import DAL.impl.BookingDaoImpl;

public class BookingTask {

    private final BookingDao bookingDao = new BookingDaoImpl();

    public Booking createNewBooking(Booking booking) {
        EventTask eventTask = new EventTask();
        Event event = booking.getEvent();
        event.setEventStatus(Statuses.UNCONFIRMED);
        Event newEvent = eventTask.createNewEvent(event);
        if (newEvent != null) {
            booking.setDiscount(calcDiscountAmount(booking, calcDiscountPercentage(newEvent)));
            booking.setDiscountedPrice(applyDiscount(booking.getBookingPrice(), booking.getDiscount()));
            booking.setBookingStatus(Statuses.UNCONFIRMED);
            booking.setBookingReference(newBookingReference(booking));
            bookingDao.insert(booking);
            return booking;
        } else {
            throw new BusinessRuleViolationException("Oops... Something went Wrong! Please try again.");
        }
    }

    private Integer calcDiscountPercentage(Event event) {
        if (event.getPaxAdults() + event.getPaxChildren() > 40) {
            return 15;
        } else {
            return 0;
        }
    }

    private double calcDiscountAmount(Booking booking, Integer discountPercentage) {
        return booking.getBookingPrice() * (discountPercentage * 100);
    }

    private double applyDiscount(Double fullPrice, Double discountedPrice) {
        return fullPrice - discountedPrice;
    }

    private String newBookingReference(Booking booking) {
        return booking.getClient().getLastName() + booking.getBookingTime().toString();
    }

    public Booking findBookingByReference(String bookingReference) {
        assert (!bookingReference.isEmpty());
        return bookingDao.findByBookingReference(bookingReference);
    }

    public Booking payBooking(Booking booking, Integer paymentAmount) {
        booking.setAmountPaid(booking.getDiscountedPrice() * (paymentAmount / 100));
        booking.setBookingStatus(Statuses.CONFIRMED);
        booking.getEvent().setEventStatus(Statuses.CONFIRMED);

        return bookingDao.save(booking);
    }
}
