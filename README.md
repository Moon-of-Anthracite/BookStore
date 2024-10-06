# book-store-project
A sample project developed while learning the basics of Spring Framework &amp; Thymeleaf Template Engine.

## Introduction
- This project was developed in the course of learning how to implement Spring Framework in Java.
- I used IntelliJ Idea from JetBrains as the Integrated Development Environment (IDE) for this project.
- It is built upon Java Development Kit version 22.0.2 using MySQL as Database Management System.
- It utilizes Spring Framework for the backend along with Thymeleaf Template Engine for the frontend.

## Project Details

### Views

#### Home
- The Home view serves as a welcome page. It features an image and a greeting.
- Image Link: https://cdn.fodors.com/wp-content/uploads/2017/10/BestBookstores-02-Daunt.jpg
![Home Page](https://github.com/user-attachments/assets/4c6e84f6-2883-4cc4-b849-c30b6bb38314)

#### Catalogue
- The Catalogue view serves as an index of all the books that have been added to the database.
![Book List Page](https://github.com/user-attachments/assets/4093cf9c-b770-434d-8b89-1a87f8bbc87b)

#### Add Books & Edit Books
- The Add Books view is used to add books to the database one at a time. It redirects to Catalogue.
- Along with being used for adding new books to database, the same layout is also used to edit books.
![Add Books Page](https://github.com/user-attachments/assets/9a281d99-6284-40d0-b0f7-13a4c99ea783)

#### Favourites
- The Favourites view displays all the books that have been added to favourite from Catalogue view.
- It was done by defining a boolean property in the entity class and running a query to filter the same.
![Favourite Books Page](https://github.com/user-attachments/assets/8286f581-e69f-45da-a320-4196d26d3c81)

### Skills Highlighted
- Implementing Bootstrap CSS & JavaScript through CDN Links.
- Implementing Thymeleaf Template Engine in HTML Templates.
