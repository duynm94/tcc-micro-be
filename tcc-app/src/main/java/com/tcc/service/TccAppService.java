package com.tcc.service;

import com.tcc.client.HrmsServiceClient;
import com.tcc.dto.OrderResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TccAppService {

    @Autowired
    private HrmsServiceClient hrmsServiceClient;

    public String greeting() {
        return "Welcome to TCC App Service";
    }

    public OrderResponseDTO checkOrderStatus(String orderId) {
        return hrmsServiceClient.fetchOrderStatus(orderId);
    }
}
