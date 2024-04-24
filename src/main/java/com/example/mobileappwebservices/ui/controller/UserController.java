package com.example.mobileappwebservices.ui.controller;

import com.example.mobileappwebservices.ui.model.request.UserDetailsRequestModel;
import com.example.mobileappwebservices.ui.model.response.UserRest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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

    @GetMapping(path = "/{userId}",
            produces = {
                    MediaType.APPLICATION_XML_VALUE,
                    MediaType.APPLICATION_JSON_VALUE
            })
    public ResponseEntity<UserRest> getUser(@PathVariable String userId) {

        UserRest returnValue = new UserRest();
        returnValue.setEmail("test@example.com");
        returnValue.setFirstName("Jeff");
        returnValue.setLastName("Chang");

        return new ResponseEntity<UserRest>(returnValue, HttpStatus.OK);

    }

    @PostMapping(
            consumes = {
                    MediaType.APPLICATION_XML_VALUE,
                    MediaType.APPLICATION_JSON_VALUE,
            },
            produces = {
                    MediaType.APPLICATION_XML_VALUE,
                    MediaType.APPLICATION_JSON_VALUE,
            }
    )
    public ResponseEntity<UserRest> createUser(@RequestBody UserDetailsRequestModel userDetails) {

        UserRest returnValue = new UserRest();
        returnValue.setEmail(userDetails.getEmail());
        returnValue.setFirstName(userDetails.getFirstName());
        returnValue.setLastName(userDetails.getLastName());

        return new ResponseEntity<UserRest>(returnValue, HttpStatus.OK);

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
