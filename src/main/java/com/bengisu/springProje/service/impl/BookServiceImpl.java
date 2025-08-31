package com.bengisu.springProje.service.impl;

import com.bengisu.springProje.model.Book;
import com.bengisu.springProje.repository.BookRepository;
import com.bengisu.springProje.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService
{
    private final BookRepository bookRepository;

    @Override
    public Book saveBook(Book book)
    {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBooks()
    {
        return bookRepository.findAll();
    }
}
