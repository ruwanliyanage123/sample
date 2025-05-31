package com.microservices.root.orderservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/order")
public class OrderController {
    @Value("${order.url}")
    private String orderUrl;
    @GetMapping()
    public ResponseEntity<String> createOrder() {
        for (int i = 0; i < 10; i++){
            System.out.println("========="+ orderUrl +"============");
        }
        String message = "--------started---------";
        System.out.println(message);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
