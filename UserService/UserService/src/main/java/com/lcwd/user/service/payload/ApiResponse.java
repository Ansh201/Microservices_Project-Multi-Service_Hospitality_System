package com.lcwd.user.service.payload;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ApiResponse {

    private String message;
    private boolean success;
    private String status;
}
