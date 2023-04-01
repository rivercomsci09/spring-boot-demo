package com.example.springbootdemo.services;

import com.example.springbootdemo.model.UserDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserController {
    @GetMapping("/users")
    public List<UserDto> getUser() {
        UserDto user = new UserDto();
        user.setId(1L);
        user.setUserName("River");
        UserDto user2 = new UserDto();
        user2.setId(2L);
        user2.setUserName("Pig");
        return Arrays.asList(user, user2);
    }

    @PostMapping("/users/{id}")
    public void updateUser(
            @PathVariable Long id,
            @RequestBody (required = false) Map<String, Object> params) {
        System.out.println(params);
    }
}
