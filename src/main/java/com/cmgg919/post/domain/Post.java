package com.cmgg919.post.domain;

import com.cmgg919.user.domain.User;

public class Post {

    private final User author;
    private final String content;

    public Post(User author, String content) {
        if(author == null) {
            throw new IllegalArgumentException("Author cannot be null");
        }

        if(content == null || content.length() < 5 || content.length() > 500) {
            throw new IllegalArgumentException("Content length must be between 5 and 500 characters");
        }

        this.author = author;
        this.content = content;
    }
}
