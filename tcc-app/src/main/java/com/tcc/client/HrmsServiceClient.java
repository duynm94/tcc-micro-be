package com.tcc.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.tcc.dto.OrderResponseDTO;

@Component
public class HrmsServiceClient {
    @Autowired
    private RestTemplate template;

    public OrderResponseDTO fetchOrderStatus(String orderId) {
        String rs = template.getForObject("http://HRMS-SERVICE/hrms/gs", String.class);
        OrderResponseDTO rsDTO = new OrderResponseDTO();
        rsDTO.setName(rs);
        return rsDTO;
    }
}
