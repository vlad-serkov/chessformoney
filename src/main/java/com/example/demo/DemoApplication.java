package com.example.demo;

import com.example.demo.appuser.AppUserRepository;
import com.example.demo.registration.RegistrationRequest;
import com.example.demo.registration.RegistrationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
@Slf4j
public class DemoApplication {

    private final AppUserRepository appUserService;

    private final RegistrationService registrationService;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {
            log.info("-------lol--------");
            registrationService.register(new RegistrationRequest(
                    "Lord",
                    "Serkov",
                    "lordr7638@gmail.co",
                    "password"
            ));

            appUserService.enableAppUser("lordr7638@gmail.co");
        };
    }

}
