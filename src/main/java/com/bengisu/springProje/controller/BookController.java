package com.bengisu.springProje.controller;

import com.bengisu.springProje.model.Book;
import com.bengisu.springProje.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController
{
    private final BookService bookService;

    @PostMapping(path = "/save")
    public Book saveBook(@RequestBody Book book)
    {
        return bookService.saveBook(book);
    }

    @GetMapping(path = "/list")
    public List<Book> getAllBooks()
    {
        return bookService.getAllBooks();
    }
}
