package com.bengisu.springProje.service;

import com.bengisu.springProje.model.MessagePrinter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService
{
    @Autowired
    private MessagePrinter messagePrinter;

    public String getMessage()
    {
        return messagePrinter.printMessage();
    }
}
