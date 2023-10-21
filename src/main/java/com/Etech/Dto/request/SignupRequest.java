package com.Etech.Dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SignupRequest {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String role;
}
