package com.moviebooking;
import java.util.List;
public interface BookingDAO {
    void addBooking(BookingDTO booking);
    BookingDTO getBookingById(int id);
    List<BookingDTO> getAllBookings();
    void updateBooking(BookingDTO booking);
    void deleteBooking(int id);
}
