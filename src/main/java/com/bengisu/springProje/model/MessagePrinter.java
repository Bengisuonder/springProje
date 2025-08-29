package com.bengisu.springProje.model;

import org.springframework.stereotype.Component;

@Component
public class MessagePrinter
{
    public String printMessage()
    {
        return "springboot öğreniyorum!";
    }
}
