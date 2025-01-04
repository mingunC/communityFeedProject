package com.cmgg919.post.domain.content;

import com.cmgg919.post.domain.common.DateTimeInfo;

public abstract class Content {

    private String contentText;
    final DateTimeInfo dateTimeInfo;

    protected Content(String contentText) {
        checkText(contentText);
        this.contentText = contentText;
        this.dateTimeInfo = new DateTimeInfo();

    }

    public void updateContent(String updateContent) {
        checkText(updateContent);
        this.contentText = updateContent; // Update the content text
        this.dateTimeInfo.updateEditedDateTime();

    }
    protected abstract void checkText(String contentText);

    public String getContentText() {
        return contentText;
    }
}
