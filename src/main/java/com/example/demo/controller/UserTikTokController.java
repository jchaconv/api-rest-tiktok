package com.example.demo.controller;

import com.example.demo.exception.UserTikTokNotFoundException;
import com.example.demo.model.UserTikTok;
import com.example.demo.repositories.UserTikTokRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/api/v1")
public class UserTikTokController {
    //ver mr.robot en cuevana

    private UserTikTokRepository repository;

    public UserTikTokController(UserTikTokRepository repository) {
        this.repository = repository;
    }

    //Es triste amar sin ser amado u.u
    //Pero más triste es cerrar word sin
    // haber guardado ToT

    @GetMapping(path="/users")
    public @ResponseBody Iterable<UserTikTok> getAllUsers() {
        // This returns a JSON or XML with the users
        return repository.findAll();
    }

    @PostMapping(path="/add")
    public ResponseEntity<UserTikTok> create(@RequestBody UserTikTok userTikTok) {
        UserTikTok created = repository.save(userTikTok);

        return new ResponseEntity<UserTikTok>(HttpStatus.CREATED);
    }



}
