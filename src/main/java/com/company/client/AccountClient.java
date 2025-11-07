package com.company.client;

import com.company.model.dto.response.AccountResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "account-service", url = "${application.client.account}")
public interface AccountClient {

    @GetMapping("v1/accounts/{userId}")
    AccountResponse getAccountByUserId(@PathVariable Long userId);

}
