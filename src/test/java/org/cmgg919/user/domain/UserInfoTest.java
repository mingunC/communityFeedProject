package org.cmgg919.user.domain;

import com.cmgg919.user.domain.UserInfo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class UserInfoTest {

    @Test
    void givenNameAndProfileImage_whenCreated_thenThrowNothing() {
        //given
        String name = "abcd";
        String profileImageUrl = "";
        //when
        UserInfo userInfo = new UserInfo(name, profileImageUrl);
        //then
        assertDoesNotThrow(() -> new UserInfo(name, profileImageUrl));

    }
}
