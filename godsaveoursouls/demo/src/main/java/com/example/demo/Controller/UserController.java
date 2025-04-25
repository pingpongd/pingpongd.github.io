package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Optional;

import com.example.demo.Model.MyAppUser;
import com.example.demo.Model.MyAppUserRepository;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private MyAppUserRepository myAppUserRepository;

    @GetMapping("/profile")
    public ResponseEntity<Optional<MyAppUser>> getProfile(Principal principal) {
        String username = principal.getName(); // current logged-in user
        Optional<MyAppUser> user = myAppUserRepository.findByUsername(username);
        return ResponseEntity.ok(user);
    }
}
