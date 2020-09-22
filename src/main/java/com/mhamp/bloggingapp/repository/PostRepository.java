package com.mhamp.bloggingapp.repository;

import com.mhamp.bloggingapp.model.Post;
import com.mhamp.bloggingapp.model.Subreddit;
import com.mhamp.bloggingapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
