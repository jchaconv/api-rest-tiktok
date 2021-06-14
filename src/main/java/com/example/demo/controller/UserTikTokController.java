package com.example.demo.controller;

import com.example.demo.model.UserTikTok;
import com.example.demo.repositories.UserTikTokRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/api/v1")
public class UserTikTokController {

    private UserTikTokRepository repository;

    public UserTikTokController(UserTikTokRepository repository) {
        this.repository = repository;
    }

    @GetMapping(path="/users")
    public @ResponseBody Iterable<UserTikTok> getAllUsers() {
        // This returns a JSON or XML with the users
        return repository.findAll();
    }

    @GetMapping(path="/users/{id}")
    public Optional<UserTikTok> getUserById(@PathVariable Long id){
        return repository.findById(id);
    }

    @PostMapping(path="/add")
    public ResponseEntity<UserTikTok> create(@RequestBody UserTikTok userTikTok) {
        UserTikTok created = repository.save(userTikTok);

        return new ResponseEntity<UserTikTok>(HttpStatus.CREATED);
    }

    @PutMapping(path= "/users/{id}")
    public UserTikTok replaceUserTikTok(@RequestBody UserTikTok newUserTikTok,
                                        @PathVariable Long id){

        return repository.findById(id)
                .map(userTikTok -> {
                    userTikTok.setName(newUserTikTok.getName());
                    userTikTok.setNickname(newUserTikTok.getNickname());
                    userTikTok.setDescription(newUserTikTok.getDescription());
                    userTikTok.setNumberOfFollowers(newUserTikTok.getNumberOfFollowers());
                    userTikTok.setNumberOfViewers(newUserTikTok.getNumberOfViewers());
                    userTikTok.setNumberOfLikes(newUserTikTok.getNumberOfLikes());
                    return repository.save(userTikTok);
                })
                .orElseGet(() -> {
                    newUserTikTok.setId(id);
                    return repository.save(newUserTikTok);
                });
    }

    //METODO QUE ELIMINA USUARIOS
    @DeleteMapping(path= "/users/{id}")
    public void deleteUserTikTok(@PathVariable Long id){
        repository.deleteById(id);
    }


}
