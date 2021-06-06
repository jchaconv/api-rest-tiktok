package com.example.demo.exception;

public class UserTikTokNotFoundException extends RuntimeException{

    public UserTikTokNotFoundException(Long id) {
        super("No se pudo encontrar el usuerio de" +
                "tik tok con el id: " + id);
    }

}
