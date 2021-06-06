package com.example.demo.controller;

import com.example.demo.exception.UserTikTokNotFoundException;
import com.example.demo.model.UserTikTok;
import com.example.demo.repositories.UserTikTokRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserTikTokController {
    //ver mr.robot en cuevana

    private UserTikTokRepository repository;

    public UserTikTokController(UserTikTokRepository repository) {
        this.repository = repository;
    }

    //Es triste amar sin ser amado u.u
    //Pero más triste es cerrar word sin haber guardado ToT

    @GetMapping(path="/all")
    public @ResponseBody Iterable<UserTikTok> getAllUsers() {
        // This returns a JSON or XML with the users
        return repository.findAll();
    }
    /*
    @GetMapping("/users")
    List<UserTikTok> all() {
        return repository.findAll();
    }*/
    /*
    @GetMapping("/users/{id}")
    UserTikTok one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new UserTikTokNotFoundException(id));
    }*/

    /*
    @PostMapping("/users")
    UserTikTok newUser(@RequestBody UserTikTok newUserTikTok) {
        return repository.save(newUserTikTok);
    }*/
    /*
    @PutMapping("/users/{id}")
    UserTikTok replaceEmployee(@RequestBody UserTikTok newUserTikTok, @PathVariable Long id) {

        return repository.findById(id)
                .map(userOfTikTok -> {

                    userOfTikTok.setName(newUserTikTok.getName());
                    userOfTikTok.setNickname(newUserTikTok.getNickname());
                    userOfTikTok.setDescription(newUserTikTok.getDescription());
                    userOfTikTok.setNumberOfFollowers(newUserTikTok.getNumberOfFollowers());
                    userOfTikTok.setNumberOfViewers(newUserTikTok.getNumberOfViewers());
                    userOfTikTok.setNumberOfLikes(newUserTikTok.getNumberOfLikes());
                    return repository.save(userOfTikTok);
                })
                .orElseGet(() -> {
                    newUserTikTok.setId(id);
                    return repository.save(newUserTikTok);
                });
    }*/



    /*List<UserTikTok> saveAll(@RequestBody List<UserTikTok> newUserTikTok){
        return repository.save(newUserTikTok);
    }*/


}
