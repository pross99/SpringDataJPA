package com.example.springdatajpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }


    private void insertEmployees(EmployeeRepository repository) {
        repository.save(new Employee("Peter", "Ross"));
        repository.save(new Employee("Mads", "Nissen"));
        repository.save(new Employee("Patrick", "Lindahl"));
        repository.save(new Employee("Jacob", "Kamst rub"));
    }
        @Bean
                public CommandLineRunner run(EmployeeRepository repository) {
            return (args) -> {
                insertEmployees(repository);
                System.out.println(repository.findAll());
                System.out.println(repository.findEmployeeByFristNameContaining(" "));
        };

    }

}
