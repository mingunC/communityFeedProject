package com.cmgg919.post.domain;

import com.cmgg919.common.domain.PositiveIntegerCounter;
import com.cmgg919.post.domain.content.PostContent;
import com.cmgg919.post.domain.content.PostPublicationState;
import com.cmgg919.user.domain.User;

public class Post {

    private final Long id;
    private final User author;
    private final PostContent content;
    private final PositiveIntegerCounter likeCount;
    private PostPublicationState state;


    public Post(Long id, User author, PostContent content) {
        if(author == null) {
            throw new IllegalArgumentException("Author cannot be null");
        }
        this.id = id;
        this.author = author;
        this.content = content;
        this.likeCount = new PositiveIntegerCounter();
        this.state = PostPublicationState.PUBLIC;
    }

    public void like(User user) {
        if(this.author.equals(user)) {
            throw new IllegalArgumentException("Cannot like more than one user");
        }
        likeCount.increase();
    }

    public void unlike() {
        this.likeCount.decrease();
    }
    public void updatePost(User user, String updatedContent, PostPublicationState state) {
        if(!this.author.equals(user)) {
            throw new IllegalArgumentException("Cannot update post");
        }
        this.state = state;
        this.content.updateContent(updatedContent);
    }
}
