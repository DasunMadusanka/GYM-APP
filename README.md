GYM-APP - Java Swing Application

Description

GYM-APP is a desktop application developed using Java Swing for managing gym memberships. It provides features to add, update, delete, and search for gym members, along with viewing all member records in a tabular format. The application uses MySQL for data storage and supports CRUD operations through JDBC.

Features

Add new gym members with details like ID, Name, NIC, and Contact Number.

Update existing member information.

Delete members from the database.

Search for a member by gym ID.

View all registered members in a table.

Clear input fields after performing operations.

Simple and intuitive user interface with buttons and text fields.

Technologies Used

Java Swing - GUI components and layouts.

JDBC - Database connectivity.

MySQL - Data persistence.

NetBeans - IDE for development.

Getting Started

Prerequisites

Java Development Kit (JDK) 8 or higher

MySQL Server

NetBeans IDE (or any Java-supported IDE)

Installation

Clone the repository:

git clone https://github.com/DasunMadusanka/GYM-APP.git

Open the project in NetBeans.

Set up the MySQL database:

Create a database named gymapp.

Create a table named members with the following columns:

gym_id (VARCHAR)

name (VARCHAR)

nic (VARCHAR)

contact (INT)

Update the database connection details in the DBConnection.java file if necessary.

Run the application from the main class GYMAPP.java.

Usage

Enter the member details (ID, Name, NIC, Contact) and click ADD to register a new member.

To search, enter the GYM ID and click SEARCH.

To update a member's information, make changes in the fields and click UPDATE.

To delete a member, enter the GYM ID and click DELETE.

The member list is displayed in the table at the bottom.

Contributing

Contributions are welcome! Feel free to submit a pull request or open an issue to improve the application.


