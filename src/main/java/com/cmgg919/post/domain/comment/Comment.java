package com.cmgg919.post.domain.comment;

import com.cmgg919.post.domain.Post;
import com.cmgg919.post.domain.content.Content;
import com.cmgg919.user.domain.User;

public class Comment {

    private final Long id;
    private final Post post;
    private final User author;
    private final Content content;

    public Comment(Long id, Post post, User author, Content content) {
        if(author == null) {
            throw new IllegalArgumentException("Author cannot be null");
        }
        if(content == null) {
            throw new IllegalArgumentException("Content cannot be null");
        }
        if(post == null) {
            throw new IllegalArgumentException("Post cannot be null");
        }


        this.id = id;
        this.post = post;
        this.author = author;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public Post getPost() {
        return post;
    }

    public User getAuthor() {
        return author;
    }

    public Content getContent() {
        return content;
    }
}
