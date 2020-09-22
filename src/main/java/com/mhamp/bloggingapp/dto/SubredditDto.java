package com.mhamp.bloggingapp.dto;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubredditDto {

    private Long id;
    private String name;
    private String description;
    private Integer numberOfPosts;

}
