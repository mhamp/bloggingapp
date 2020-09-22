package com.mhamp.bloggingapp.controller;

import com.mhamp.bloggingapp.dto.*;
import com.mhamp.bloggingapp.service.*;
import lombok.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping("/api/comments")
@AllArgsConstructor
public class CommentsController {

    private final CommentService commentService;

    @PostMapping
    public ResponseEntity<Void> createComment(@RequestBody CommentsDto commentsDto) {
        commentService.createComment(commentsDto);
        return new ResponseEntity<>(CREATED);
    }

    @GetMapping("/by-user/{postId}")
    public ResponseEntity<List<CommentsDto>> getAllCommentsForPost(@RequestParam("postId") Long postId) {
        return status(OK)
                .body(commentService.getCommentByPost(postId));
    }

    @GetMapping("/by-user/{userName}")
    public ResponseEntity<List<CommentsDto>> getAllCommentsByUser(@RequestParam("userName") String userName) {
        return status(OK).body(commentService.getCommentsByUser(userName));
    }
}