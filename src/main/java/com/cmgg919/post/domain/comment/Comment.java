package com.cmgg919.post.domain.comment;

import com.cmgg919.common.domain.PositiveIntegerCounter;
import com.cmgg919.post.domain.Post;
import com.cmgg919.post.domain.content.Content;
import com.cmgg919.user.domain.User;

public class Comment {

    private final Long id;
    private final Post post;
    private final User author;
    private final Content content;
    private final PositiveIntegerCounter likeCount;



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
        this.likeCount = new PositiveIntegerCounter();
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
    public void like(User user) {
        if(this.author.equals(user)) {
            throw new IllegalArgumentException("Cannot like more than one user");
        }
        likeCount.increase();
    }

    public void unlike(User user) {
        this.likeCount.decrease();
    }

    public void updateComment(User user, String updatedContent) {
        if(!this.author.equals(user)) {
            throw new IllegalArgumentException("Cannot update comment without author");
        }
        this.content.updateContent(updatedContent);
    }
}
