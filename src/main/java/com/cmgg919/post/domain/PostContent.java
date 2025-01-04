package com.cmgg919.post.domain;

import javax.swing.text.AbstractDocument;

public class PostContent {

    private final String content;

    public PostContent(String content) {
        if(content == null || content.length() < 5 || content.length() > 500) {
            throw new IllegalArgumentException("Content length must be between 5 and 500 characters");
        }
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
