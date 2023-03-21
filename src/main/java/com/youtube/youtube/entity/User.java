package com.youtube.youtube.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class User extends DateEntity{

    @Id
    @GeneratedValue
    private Long id;

    private String email;

    private String password;

    private String nickName;

    private String status;

    private String profileImage;

    @OneToMany(mappedBy = "user")
    private List<VideoLike> videoLikes = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<VideoComment> videoComments = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Subscribe> subscribes = new ArrayList<>();
}
