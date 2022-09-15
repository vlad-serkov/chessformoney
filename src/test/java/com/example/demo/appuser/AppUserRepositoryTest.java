package com.example.demo.appuser;

import lombok.AllArgsConstructor;
import lombok.Setter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AppUserRepositoryTest {

    @Autowired
    public AppUserRepositoryTest(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    private final AppUserRepository appUserRepository;

    @Test
    void findByEmail() {


        final Optional<AppUser> appUser = appUserRepository.findByEmail("lordr7638@gmail.com");
        System.out.println(appUser);
    }

    @Test
    void enableAppUser() {
    }
}