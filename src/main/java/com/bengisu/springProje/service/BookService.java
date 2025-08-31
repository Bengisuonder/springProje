package com.bengisu.springProje.service;

import com.bengisu.springProje.model.Book;
import java.util.List;

public interface BookService
{
    Book saveBook(Book book);
    List<Book> getAllBooks();
}
