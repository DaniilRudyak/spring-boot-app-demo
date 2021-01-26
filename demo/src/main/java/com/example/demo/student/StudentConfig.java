package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student john = new Student(
                    "John",
                    "john_wick@mail.ru",
                    LocalDate.of(2000, Month.APRIL, 14));

            Student mag = new Student(
                    "maggy",
                    "maggy_rose@mail.ru",
                    LocalDate.of(2002, Month.APRIL, 11));

            repository.saveAll(
                    List.of(john, mag)
            );
        };
    }
}
