package com.youtube.youtube.repository;

import com.youtube.youtube.entity.User;
import jakarta.transaction.Transactional;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {

    @Autowired UserRepository userRepository;

    @Test
    @Transactional
    @Rollback(false)
    public void testUser() throws Exception{

        User user = new User();
        user.setNickName("userA");

        Long savedId = userRepository.save(user);
        User findUser = userRepository.find(savedId);

        Assertions.assertThat(findUser.getId()).isEqualTo(user.getId());
    }
}