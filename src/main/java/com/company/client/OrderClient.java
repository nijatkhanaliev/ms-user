package com.company.client;

import com.company.model.dto.response.OrderResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "order-service", url = "${application.client.order}")
public interface OrderClient {

    @GetMapping("v1/orders/userId/{userId}")
    List<OrderResponse> getAllOrderByUserId(@PathVariable Long userId);

}
