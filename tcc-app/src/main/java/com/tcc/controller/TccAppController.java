package com.tcc.controller;

import com.tcc.dto.OrderResponseDTO;
import com.tcc.service.TccAppService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tcc")
public class TccAppController {

    @Autowired
    private TccAppService service;

    @GetMapping("/home")
    public String greetingMessage() {
        return service.greeting();
    }

    @GetMapping("/{orderId}")
    public OrderResponseDTO checkOrderStatus(@PathVariable String orderId) {
        return service.checkOrderStatus(orderId);
    }
    
    @GetMapping("/getById")
    public OrderResponseDTO getById(@RequestParam String orderId) {
        return service.checkOrderStatus(orderId);
    }
}
