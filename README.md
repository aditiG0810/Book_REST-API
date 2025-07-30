CRUD Operation using REST API for Book Management

Overview 📝

This project demonstrates a basic CRUD (Create, Read, Update, Delete) operation using Spring Boot REST API for managing books 📖. The application allows users to perform various operations such as adding, retrieving, updating, and deleting books.

Features 🌟

- Create: Add new books to the database 📈
- Read: Retrieve all books or specific books by ISBN or title 🔍
- Update: Update existing book details ✍️
- Delete: Delete books by ID 🚫

Technical Details 💻

- Backend Framework: Spring Boot 🚀
- Database: MySQL 🗄️
- API Endpoints: RESTful APIs for CRUD operations 📡
- Java Version: 17 ☕️

API Endpoints 📝

- POST /getbook: Create a new book 📈
- GET /getAllData: Retrieve all books 📚
- GET /getBookByIsbn/{isbn}: Retrieve a book by ISBN 🔍
- GET /login/{title}: Retrieve a book by title 📖
- GET /getBookbyPrice/{price}: Retrieve books by price 💸
- PUT /update/{id}: Update a book ✍️
- DELETE /deleteById/{id}: Delete a book by ID 🚫

Project Structure 📁

- Controller: BookController (handles API requests) 🤖
- Service: BookServiceI (interface) and BookServiceImpl (implementation) 💼
- Repository: BookRepository (extends CrudRepository) 🗄️
- Model: Book (entity class) 📚

Dependencies 📦

- Spring Boot Starter Data JPA 📊
- Spring Boot Starter Web 🌐
- MySQL Connector/J 🗄️
- Spring Boot DevTools 🔧

Getting Started 🚀

1. Clone the repository 📋
2. Configure the database settings in application.properties 📝
3. Build and run the application using Maven 🏗️
4. Use Postman or a similar tool to test the API endpoints 📊
