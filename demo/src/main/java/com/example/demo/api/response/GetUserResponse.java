package com.example.demo.api.response;


import com.example.demo.api.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class GetUserResponse {
    private Long id;
    private String email;
    private String name;

    public GetUserResponse(User user) {
        this.id = user.getId();
        this.email = user.getEmail();
        this.name = user.getName();
    }
}
