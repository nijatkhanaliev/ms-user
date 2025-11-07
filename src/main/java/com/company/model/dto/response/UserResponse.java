package com.company.model.dto.response;

import com.company.model.enums.UserRole;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class UserResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private UserRole userRole;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate birthDate;
    private AccountResponse accountResponse;
    private List<OrderResponse> orderResponseList;
}
