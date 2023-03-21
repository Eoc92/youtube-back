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
public class Channel extends DateEntity{

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "channel")
    private List<Video> videos = new ArrayList<>();

    @OneToMany(mappedBy = "channel")
    private List<Subscribe> subscribes = new ArrayList<>();
}
