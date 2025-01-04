package com.cmgg919.post.domain.content;

public abstract class Content {

    private final String contentText;

    protected Content(String contentText) {
        checkText(contentText);
        this.contentText = contentText;
    }

    protected abstract void checkText(String contentText);

    public String getContentText() {
        return contentText;
    }


}
