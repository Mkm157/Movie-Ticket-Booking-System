package com.moviebooking;

public class BookingDTO {

    private int bookingId;
    private String movieName;
    private String customerName;
    private String seatType;
    private double ticketPrice;

    public BookingDTO() {}

    public BookingDTO(int bookingId, String movieName,
                      String customerName, String seatType,
                      double ticketPrice) {
        this.bookingId = bookingId;
        this.movieName = movieName;
        this.customerName = customerName;
        this.seatType = seatType;
        this.ticketPrice = ticketPrice;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
