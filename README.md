Movie Ticket Booking System

The Movie Ticket Booking System is a console-based Java application developed using Java, JDBC, and MySQL.
It is designed to manage movie ticket bookings in a theatre and perform complete CRUD operations on a database.

📌 Project Overview

This project automates the process of booking, viewing, updating, and cancelling movie tickets in a theatre environment.
It follows a layered architecture (DTO, DAO, Service, Main) to ensure clean code structure, separation of concerns, and easy maintainability.

🛠 Technologies Used

Java

JDBC

MySQL

Eclipse IDE

MySQL Workbench

✨ Features

Book a new movie ticket

View booking details by Booking ID

View all ticket bookings

Update booking information

Cancel ticket booking

Automatic ticket price calculation based on seat type

🏗 Architecture Used

DTO (Data Transfer Object) – Transfers booking data between layers

DAO (Data Access Object) – Handles database operations using JDBC

Service Layer – Contains business logic & ticket price calculation

Main Class – User interface (menu-driven console)

🗄 Database Design

Database Name: movie_booking
Table Name: booking

Columns:

booking_id (Primary Key, Auto Increment)

movie_name

customer_name

seat_type

ticket_price

booking_time

▶ How to Run the Project

Open MySQL Workbench

Create database and table using the provided SQL script

Open the project in Eclipse

Add MySQL Connector JAR to the project

Run Main.java

Use the menu options to perform booking operations

📸 Sample Output

The project displays a menu-driven console output where users can:

Book movie tickets

View stored booking records

Update or cancel bookings

(Outputs are displayed directly on the console)

🎯 Learning Outcomes

Hands-on experience with JDBC

Understanding DAO–DTO–Service layered architecture

Database connectivity using Java

Implementation of real-world CRUD applications

👤 Author

Midhun Krishna M
B.E – Computer Science Engineering
