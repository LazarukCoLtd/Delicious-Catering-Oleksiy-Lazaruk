package BLL.domain;

import java.time.LocalDateTime;

public class Booking {

    private Integer id;

    private String bookingReference;

    private Client client;

    private Double bookingPrice;

    private Double discount;

    private Double discountedPrice;

    private Statuses bookingStatus;

    private Event event;

    private LocalDateTime bookingTime;

    public Booking(Integer id, String bookingReference, Client client, double bookingPrice, double discount,
                   Statuses bookingStatus, Event event, LocalDateTime bookingTime) {
        this.id = id;
        this.bookingReference = bookingReference;
        this.client = client;
        this.bookingPrice = bookingPrice;
        this.discount = discount;
        this.bookingStatus = bookingStatus;
        this.event = event;
        this.bookingTime = bookingTime;
    }

    public Booking() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookingReference() {
        return bookingReference;
    }

    public void setBookingReference(String bookingReference) {
        this.bookingReference = bookingReference;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Double getBookingPrice() {
        return bookingPrice;
    }

    public void setBookingPrice(Double bookingPrice) {
        this.bookingPrice = bookingPrice;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(Double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public Statuses getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(Statuses bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public LocalDateTime getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(LocalDateTime bookingTime) {
        this.bookingTime = bookingTime;
    }
}
