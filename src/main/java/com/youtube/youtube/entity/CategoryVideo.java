package com.youtube.youtube.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class CategoryVideo {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name="video_id")
    private Video video;

}
