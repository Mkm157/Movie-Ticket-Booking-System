package com.moviebooking;
import java.util.List;
public class BookingService {
    private BookingDAO dao = new BookingDAOImpl();
    public double calculatePrice(String seatType) {
        switch (seatType.toLowerCase()) {
            case "normal": return 150;
            case "premium": return 250;
            case "recliner": return 400;
            default: return 0;
        }
    }
    public void addBooking(String movie, String customer, String seatType) {
        double price = calculatePrice(seatType);
        BookingDTO b = new BookingDTO(0, movie, customer, seatType, price);
        dao.addBooking(b);
    }
    public BookingDTO getBooking(int id) {
        return dao.getBookingById(id);
    }

    public List<BookingDTO> getAllBookings() {
        return dao.getAllBookings();
    }

    public void updateBooking(BookingDTO b) {
        dao.updateBooking(b);
    }
    public void deleteBooking(int id) {
        dao.deleteBooking(id);
    }
}

