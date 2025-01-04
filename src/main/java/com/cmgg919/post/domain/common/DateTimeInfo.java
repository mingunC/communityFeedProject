package com.cmgg919.post.domain.common;

import java.time.LocalDateTime;

public class DateTimeInfo {

    private final boolean isEdited;
    private final LocalDateTime dateTime;

    public DateTimeInfo() {
        this(false, LocalDateTime.now());
    }

    private DateTimeInfo(boolean isEdited, LocalDateTime dateTime) {
        this.isEdited = isEdited;
        this.dateTime = dateTime;
    }

    public DateTimeInfo updateEditedDateTime() {
        return new DateTimeInfo(true, LocalDateTime.now());
    }

    public boolean isEdited() {
        return isEdited;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}

