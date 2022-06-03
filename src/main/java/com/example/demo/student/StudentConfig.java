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
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
         Student Thoa =  new Student("Thoa",  LocalDate.of(2000, Month.JANUARY, 5),
          						"thoanguyen@gmail.com");
         Student Truc =  new Student("Truc",  LocalDate.of(1997, Month.JANUARY, 5),
      					"trucguyen@gmail.com");
         repository.saveAll(
                 List.of(Thoa, Truc)
         );
           }  	;
    }
}
