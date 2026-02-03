package com.moviebooking;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        BookingService service = new BookingService();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Movie Ticket Booking System ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. Get Booking By ID");
            System.out.println("3. View All Bookings");
            System.out.println("4. Update Booking");
            System.out.println("5. Cancel Booking");
            System.out.println("6. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Movie Name: ");
                    String movie = sc.next();
                    System.out.print("Customer Name: ");
                    String customer = sc.next();
                    System.out.print("Seat Type (Normal/Premium/Recliner): ");
                    String seat = sc.next();
                    service.addBooking(movie, customer, seat);
                    System.out.println("Ticket booked successfully");
                    break;
                case 2:
                    System.out.print("Booking ID: ");
                    int id = sc.nextInt();
                    BookingDTO b = service.getBooking(id);
                    if (b != null)
                        System.out.println(b.getBookingId()+" "+b.getMovieName()+" "+b.getCustomerName()+" "+b.getSeatType()+" "+b.getTicketPrice());
                    else
                        System.out.println("Booking not found");
                    break;
                case 3:
                    service.getAllBookings().forEach(x ->
                        System.out.println(x.getBookingId()+" "+x.getMovieName()+" "+x.getCustomerName()+" "+x.getSeatType()+" "+x.getTicketPrice())
                    );
                    break;
                case 4:
                    System.out.print("Booking ID: ");
                    int uid = sc.nextInt();
                    System.out.print("Movie Name: ");
                    String m = sc.next();
                    System.out.print("Customer Name: ");
                    String c = sc.next();
                    System.out.print("Seat Type: ");
                    String s = sc.next();
                    double price = service.calculatePrice(s);
                    service.updateBooking(new BookingDTO(uid, m, c, s, price));
                    System.out.println("Booking updated successfully");
                    break;
                case 5:
                    System.out.print("Booking ID: ");
                    int did = sc.nextInt();
                    service.deleteBooking(did);
                    System.out.println("Booking cancelled");
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}
