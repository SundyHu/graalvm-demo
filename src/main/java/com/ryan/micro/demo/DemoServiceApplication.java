package com.ryan.micro.demo;

import com.ryan.micro.demo.entity.User;
import com.ryan.micro.demo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoServiceApplication {

    public static void main(String[] args) {
        System.setProperty("hibernate.bytecode.provider", "none");
        SpringApplication.run(DemoServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                User user = new User();
                user.setUserId("james");
                user.setRealityName("James.K.John");
                System.out.println(">>>>> " + userRepository.save(user));
                //System.exit(0);
            }
        };
    }
}
