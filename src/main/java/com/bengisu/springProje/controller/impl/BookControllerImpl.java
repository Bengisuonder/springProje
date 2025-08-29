package com.bengisu.springProje.controller.impl;

import com.bengisu.springProje.controller.BookController;
import com.bengisu.springProje.model.Book;
import com.bengisu.springProje.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookControllerImpl implements BookController
{
    @Autowired
    private BookService bookService;

    @PostMapping(path = "/save")
    @Override
    public Book saveBook(@RequestBody Book book)
    {
        return bookService.saveBook(book);
    }
}
