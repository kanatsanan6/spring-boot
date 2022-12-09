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
            Student toon = new Student(
                    "Toon",
                    "toon@test.com",
                    LocalDate.of(1998, Month.NOVEMBER, 6)
            );

            Student ben = new Student(
                    "Ben",
                    "ben@test.com",
                    LocalDate.of(1998, Month.SEPTEMBER, 10)
            );

            repository.saveAll(
                    List.of(toon, ben)
            );
        };
    }
}
