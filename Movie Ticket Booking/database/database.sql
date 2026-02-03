CREATE TABLE booking (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    movie_name VARCHAR(50),
    customer_name VARCHAR(50),
    seat_type VARCHAR(20),
    ticket_price DOUBLE,
    booking_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
