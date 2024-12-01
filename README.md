# BookStore
A simple java web app developed while learning the basics of Spring Framework & Thymeleaf Template Engine.

## Introduction
- BookStore is a Personalized Book Store with a Favourite Books List.
- It features a catalogue of books with the option to add, edit, favourite & remove books.

## Project Details

### Pages
This web app consists of 5 pages viz. Home, Catalogue, Add Books, Edit Books & Favourites.

#### Home
- The Home page serves as a welcome page. It features an image and a short greeting.
- Image Link: https://cdn.fodors.com/wp-content/uploads/2017/10/BestBookstores-02-Daunt.jpg
![Home Page](https://github.com/user-attachments/assets/4c6e84f6-2883-4cc4-b849-c30b6bb38314)

#### Catalogue
- The Catalogue page serves as an index of all the books in the database.
- It features options to favourite, edit or delete books from the database.
- The Edit button redirects to Edit Books page with the Book details.
- While the Delete button reloads the page after database update.
- Lastly, the Add to Favourites button redirects to Favourites page.
![Book List Page](https://github.com/user-attachments/assets/4093cf9c-b770-434d-8b89-1a87f8bbc87b)

#### Add Books & Edit Books
- The Add Books page is used to add a book to the database. On Submit, it redirects to Catalogue.
- Along with being used for adding new books to the database, the same layout is also used to edit books.
- For editing, the book details are fetched by id. And, it redirects back to Catalogue page after database update.
![Add Books Page](https://github.com/user-attachments/assets/9a281d99-6284-40d0-b0f7-13a4c99ea783)

#### Favourites
- The Favourites page displays all the books that have been added to favourites from the Catalogue page.
- It has an option to remove books from favourites which reloads the Favourites page after database update.
- This was achieved by defining a boolean property in the entity class and running a query to filter the same.
![Favourite Books Page](https://github.com/user-attachments/assets/8286f581-e69f-45da-a320-4196d26d3c81)

### Skills Highlighted
- HTML
- CSS
- JavaScript
- Java
- Hibernate
- Spring
- Bootstrap
- Thymeleaf

## Additional Info
| Build Tool | Database | IDE | JDK |
| --- | --- | --- | --- |
| Apache Maven | MySQL Database | JetBrains IntelliJ Idea | Vesion 22.0.2 |
