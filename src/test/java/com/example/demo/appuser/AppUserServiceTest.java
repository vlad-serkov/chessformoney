package com.example.demo.appuser;

import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AppUserServiceTest {

    private final AppUserService appUserService;
    @Autowired
    public AppUserServiceTest(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @Test
    void loadUserByUsername() {
        appUserService.loadUserByUsername("lordr7638@gmail.com");
    }
}