package com.company.model.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class OrderResponse {
    private Long id;
    private String status;
    private BigDecimal totalAmount;
    private String createdAt;
    private List<OrderItemResponse> orderItemResponses;
}
