package com.BookStore.repository;

import com.BookStore.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BooksRepository extends JpaRepository<Books, Integer> {
    @Query(value = "select b from Books b where b.favourite = true")
    List<Books> getFavouriteBooks(boolean favourite);
}
