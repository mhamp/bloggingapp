package com.mhamp.bloggingapp.controller;

import com.mhamp.bloggingapp.dto.*;
import com.mhamp.bloggingapp.service.*;
import lombok.*;
import lombok.extern.slf4j.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("api/subreddit")
@AllArgsConstructor
@Slf4j
public class SubredditController {

    private final SubredditService subredditService;

    @PostMapping
    public ResponseEntity<SubredditDto> createSubreddit(@RequestBody  SubredditDto subredditDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(subredditService.save(subredditDto));
    }

    @GetMapping
    public ResponseEntity<List<SubredditDto>> getAllSubreddits(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(subredditService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SubredditDto> getPost(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(subredditService.getSubreddit(id));
    }

}
