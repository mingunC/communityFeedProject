package com.cmgg919.user.domain;

import java.util.Objects;

public class User {

    private final Long id;
    private final UserInfo info;
    private final UserRelationCounter followingCount;
    private final UserRelationCounter followerCounter;


    public User(Long id, UserInfo userInfo) {
        this.id = id;
        this.info = userInfo;
        this.followingCount = new UserRelationCounter();
        this.followerCounter = new UserRelationCounter();
    }

    public void follow(User targetUser) {
        if(this.equals(targetUser)) {
            throw new IllegalArgumentException("Can't unfollow self");
        }

        followerCounter.increase();
        targetUser.increaseFollowerCount();
    }


    public void unfollow(User targetUser) {
        if(this.equals(targetUser)) {
            throw new IllegalArgumentException("Can't unfollow self");
        }
        followingCount.decrease();
        targetUser.decreaseFollowerCount();
    }

    private void increaseFollowerCount() {
        followerCounter.increase();
    }
    private void decreaseFollowerCount() {
        followerCounter.decrease();
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
