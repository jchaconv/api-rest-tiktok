package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UserTikTok {

    @Id
    @GeneratedValue
    private Long id;

    private boolean hasPhoto;
    private String name;
    private String lastName;
    private String nickname;
    private String description;
    private int numberOfFollowers;
    private int numberOfViewers;
    private int numberOfLikes;
    private boolean moderator;
    private String comment;
    private String creationdate;
    private String updatedon;
    private String status;

    public UserTikTok() {
    }

    public UserTikTok(boolean hasPhoto, String name, String lastName, String nickname, String description, int numberOfFollowers, int numberOfViewers, int numberOfLikes, boolean moderator, String comment, String creationdate, String updatedon, String status) {

        this.hasPhoto = hasPhoto;
        this.name = name;
        this.lastName = lastName;
        this.nickname = nickname;
        this.description = description;
        this.numberOfFollowers = numberOfFollowers;
        this.numberOfViewers = numberOfViewers;
        this.numberOfLikes = numberOfLikes;
        this.moderator = moderator;
        this.comment = comment;
        this.creationdate = creationdate;
        this.updatedon = updatedon;
        this.status = status;

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isModerator() {
        return moderator;
    }

    public void setModerator(boolean moderator) {
        this.moderator = moderator;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(String creationdate) {
        this.creationdate = creationdate;
    }

    public String getUpdatedon() {
        return updatedon;
    }

    public void setUpdatedon(String updatedon) {
        this.updatedon = updatedon;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public boolean isHasPhoto() {
        return hasPhoto;
    }

    public void setHasPhoto(boolean hasPhoto) {
        this.hasPhoto = hasPhoto;
    }

    public int getNumberOfFollowers() {
        return numberOfFollowers;
    }

    public void setNumberOfFollowers(int numberOfFollowers) {
        this.numberOfFollowers = numberOfFollowers;
    }
}
