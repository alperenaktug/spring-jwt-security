package com.alperenaktug.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan(basePackages = {"com.alperenaktug"})
@EntityScan(basePackages = {"com.alperenaktug"})
@EnableJpaRepositories(basePackages = {"com.alperenaktug"})
@SpringBootApplication
public class SpringJwtSecurityStarter {

    public static void main(String[] args) {
        SpringApplication.run(SpringJwtSecurityStarter.class, args);
    }

}
