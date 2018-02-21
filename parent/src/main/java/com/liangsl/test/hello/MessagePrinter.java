package com.liangsl.test.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter{
    @Autowired
    private MessageService service;

    public MessagePrinter(MessageService service) {
        this.service = service;
    }

    public MessagePrinter(){}

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}