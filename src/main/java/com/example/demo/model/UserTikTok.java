package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class UserTikTok {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String nickname;
    private String description;
    private int numberOfFollowers;
    private int numberOfViewers;
    private int numberOfLikes;

    public UserTikTok() {
    }

    public UserTikTok(String name, String nickname, String description, int numberOfFollowers, int numberOfViewers, int numberOfLikes) {
        this.name = name;
        this.nickname = nickname;
        this.description = description;
        this.numberOfFollowers = numberOfFollowers;
        this.numberOfViewers = numberOfViewers;
        this.numberOfLikes = numberOfLikes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfFollowers() {
        return numberOfFollowers;
    }

    public void setNumberOfFollowers(int numberOfFollowers) {
        this.numberOfFollowers = numberOfFollowers;
    }

    public int getNumberOfViewers() {
        return numberOfViewers;
    }

    public void setNumberOfViewers(int numberOfViewers) {
        this.numberOfViewers = numberOfViewers;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public void setNumberOfLikes(int numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }
}
