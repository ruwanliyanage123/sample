package com.microservices.root.orderservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/order")
public class OrderController {
    @GetMapping()
    public ResponseEntity<String> createOrder() {
        String message = "--------started---------";
        System.out.println(message);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
