package com.example.mobileappwebservices.ui.controller;

import com.example.mobileappwebservices.ui.model.response.UserRest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping
    public String getUsers(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "limit", defaultValue = "20") int limit,
            @RequestParam(value = "sort", required = false) String sort
    ) {
        return "get user was called with page " + page + " and limit " + limit + " and sort " + sort;
    }

    @GetMapping(path = "/{userId}")
    public UserRest getUser(@PathVariable String userId) {

        UserRest returnValue = new UserRest();
        returnValue.setEmail("test@example.com");
        returnValue.setFirstName("Jeff");
        returnValue.setLastName("Chang");

        return returnValue;

    }

    @PostMapping
    public String createUser() {
        return "create user was called";
    }

    @PutMapping
    public String updateUser() {
        return "update user was called";
    }

    @DeleteMapping
    public String deleteUser() {
        return "delete user was called";
    }

}
