package com.youtube.youtube.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Video extends DateEntity{

    @Id @GeneratedValue
    private Long Id;

    @OneToMany(mappedBy = "video")
    private List<CategoryVideo> categoryVideos = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name= "channel_id")
    private Channel channel;

    @OneToMany(mappedBy = "video")
    private List<VideoLike> videoLikes = new ArrayList<>();

    @OneToMany(mappedBy = "video")
    private List<VideoComment> videoComments = new ArrayList<>();

    private String title;

    private String thumbnailImage;

    private String videoFile;

}
