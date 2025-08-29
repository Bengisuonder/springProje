package com.bengisu.springProje.controller;

import com.bengisu.springProje.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController
{
    @Autowired
    private MessageService messageService;

    @GetMapping("/message")
    public String message()
    {
        return messageService.getMessage();
    }
}
