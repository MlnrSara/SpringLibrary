# SpringLibrary

## Overview

The **SpringLibrary** project is a Java-based web application designed to manage a collection of books. Built using the Spring framework, it offers a robust and scalable solution for library management. The application provides functionalities such as adding, removing, and searching for books, along with user authentication and role-based access control.

## Technologies Used

- **Java**: The primary programming language used for the application's backend logic.
- **Spring Framework**: Utilized for building the application, providing features like dependency injection, security, and MVC architecture.
- **Gradle**: Employed as the build automation tool, managing dependencies and project configurations.
- **HTML/CSS**: Used for structuring and styling the web application's frontend interface.

## Features

### General Features

- **Add Books**: Input details such as title, author, genre, and publication year to add new books to the library's collection.
- **Remove Books**: Delete books from the library's inventory.

### Authentication and Authorization

The application includes a secure authentication system with role-based access control:

1. **Admin**:
   - Manage users (add, edit, or remove users).
   - View detailed system logs.

2. **User**:
   - Access information about each book.

## Use Cases

1. **Library Administrator**:
   - **Manage Users**: Admins can add new users, edit existing user information, and remove users as necessary.
   - **System Monitoring**: Access system logs to monitor activities within the application.
   - **Catalog Management**: Add new books to the collection, update existing book information, and remove outdated or damaged books.

2. **Librarian (User Role)**:
   - **View Book Details**: Access detailed information about each book, including availability status.
