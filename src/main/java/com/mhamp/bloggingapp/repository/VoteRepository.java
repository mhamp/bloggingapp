package com.mhamp.bloggingapp.repository;

import com.mhamp.bloggingapp.model.Post;
import com.mhamp.bloggingapp.model.User;
import com.mhamp.bloggingapp.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
