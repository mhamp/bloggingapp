package com.mhamp.bloggingapp.repository;

import com.mhamp.bloggingapp.model.Comment;
import com.mhamp.bloggingapp.model.Post;
import com.mhamp.bloggingapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);
    List<Comment> findAllByUser(User user);
}
