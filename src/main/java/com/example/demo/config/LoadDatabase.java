package com.example.demo.config;

import com.example.demo.model.UserTikTok;
import com.example.demo.repositories.UserTikTokRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    /*
    @Bean
    CommandLineRunner initDatabase(UserTikTokRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save
                    (new UserTikTok(true, "Angie", "angiepacg",
                            "Sera que llegue a los 2K? Tiktok bonus D1379247",
                            1900, 410, 3400)));
            log.info("Preloading " + repository.save
                    (new UserTikTok(true, "Cristina", "a.cristina.e",
                            "holiiii u.u",
                            853, 1300, 2500)));
        };

    }*/


}
