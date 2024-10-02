# book-store-project
A sample project developed while learning the basics of Spring Framework &amp; Thymeleaf Template Engine.

## Introduction
- This project was developed in the course of learning how to implement Spring Framework in Java.
- I used IntelliJ Idea from JetBrains as the Integrated Development Environment for this project.
- It is built upon Java Development Kit version 22.0.2 using MySQL as Database Management System.
- It utilizes Spring Framework for the backend along with Thymeleaf Template Engine for the frontend.

## Project Details
Another sample project I worked on in order to further my understanding of Spring Boot/Framework.

### Views
Unlike the employee-management-system project, this one has more views & more complex views.
All the views have a Navigation Bar that directs you to primary views viz. Books List, Add Books & Favourites.

#### Home
- This is basically a welcome page. It features a greeting and an image sourced from the web.
- Image Link: https://cdn.fodors.com/wp-content/uploads/2017/10/BestBookstores-02-Daunt.jpg
![Home Page](https://github.com/user-attachments/assets/4c6e84f6-2883-4cc4-b849-c30b6bb38314)

#### Catalogue
This page serves as an index of all the books that have been added to the catalogue.
It allows you to perform the following 3 actions - Add to Favourite, Edit & Delete.
![Book List Page](https://github.com/user-attachments/assets/4093cf9c-b770-434d-8b89-1a87f8bbc87b)

#### Add Books & Edit Books
This is nothing special. Just a Add Books page. The same format also doubles as the Edit Books page.
![Add Books Page](https://github.com/user-attachments/assets/9a281d99-6284-40d0-b0f7-13a4c99ea783)

#### Favourites
This is a list of favourite books. Ever book added to favourite from the catalogue appears over here.
This was also the page I had the most trouble in rendering. I will discuss these problems in 'Issues'.
![Favourite Books Page](https://github.com/user-attachments/assets/8286f581-e69f-45da-a320-4196d26d3c81)

### Issues
Since this project was similar to employee-management-system, there was no problem with database integration.
The only major complications I faced were while managing the favourite books. The following are those issues:
- At first I tried to make 2 tables, one for all books and one for favourite books, and one-to one map them.
- But, after thinking a bit I realized that it is unnecessary to create another table just for a favourites.
- So, I made a single table with boolean values for the favourites column that is set to false by default.
- I defined a Query to filter the database by favourite status and implemented that into the repository.
- Now that the Books List and Favourites views were resolved, I encountered a different problem with it.
- In the controller class, I had difficulty in running the code for changing favourite status.
- The link of code 'bookService.getBookById(id).setFavourite(true/false);' failed to work.
- Neither the true value nor the false value were applied to the entities in the database.
- Following a lot of trial and error, I found a method to implement the above action.
- As such I was able to finally run the program as I had originally intended.

## Conclusion
In conclusion, working on this project only solidified my belief that my current understanding of Java web apps is insufficient.
Next, I'm thinking of studying Vaadin to not just increase my understanding of Java web apps but also to practice it some more.
