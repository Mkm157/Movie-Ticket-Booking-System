package com.moviebooking;
import java.sql.*;
import java.util.*;
public class BookingDAOImpl implements BookingDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/movie_booking_db";
    private static final String USER = "root";
    private static final String PASS = "root"; // change if needed
    @Override
    public void addBooking(BookingDTO b) {
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            String sql = "INSERT INTO booking(movie_name, customer_name, seat_type, ticket_price) VALUES (?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, b.getMovieName());
            pst.setString(2, b.getCustomerName());
            pst.setString(3, b.getSeatType());
            pst.setDouble(4, b.getTicketPrice());
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public BookingDTO getBookingById(int id) {
        BookingDTO b = null;
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            String sql = "SELECT * FROM booking WHERE booking_id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                b = new BookingDTO(
                        rs.getInt("booking_id"),
                        rs.getString("movie_name"),
                        rs.getString("customer_name"),
                        rs.getString("seat_type"),
                        rs.getDouble("ticket_price")
                );
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }
    @Override
    public List<BookingDTO> getAllBookings() {
        List<BookingDTO> list = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            String sql = "SELECT * FROM booking";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                list.add(new BookingDTO(
                        rs.getInt("booking_id"),
                        rs.getString("movie_name"),
                        rs.getString("customer_name"),
                        rs.getString("seat_type"),
                        rs.getDouble("ticket_price")
                ));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    @Override
    public void updateBooking(BookingDTO b) {
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            String sql = "UPDATE booking SET movie_name=?, customer_name=?, seat_type=?, ticket_price=? WHERE booking_id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, b.getMovieName());
            pst.setString(2, b.getCustomerName());
            pst.setString(3, b.getSeatType());
            pst.setDouble(4, b.getTicketPrice());
            pst.setInt(5, b.getBookingId());
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteBooking(int id) {
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            String sql = "DELETE FROM booking WHERE booking_id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
B