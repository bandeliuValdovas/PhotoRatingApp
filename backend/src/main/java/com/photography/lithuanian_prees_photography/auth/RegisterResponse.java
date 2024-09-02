package com.photography.lithuanian_prees_photography.auth;

import com.photography.lithuanian_prees_photography.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterResponse {
    private User user;
}
