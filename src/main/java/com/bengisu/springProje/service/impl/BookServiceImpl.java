package com.bengisu.springProje.service.impl;

import com.bengisu.springProje.model.Book;
import com.bengisu.springProje.repository.BookRepository;
import com.bengisu.springProje.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService
{
    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book saveBook(Book book)
    {
        return bookRepository.save(book);
    }
}
