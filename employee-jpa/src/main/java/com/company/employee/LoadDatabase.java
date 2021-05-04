package com.company.employee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    public CommandLineRunner initDatabase(EmployeeRepository repository) {
        return args -> {
            repository.save(new Employee("Sara", "Yerr"));
            repository.save(new Employee("Calvin", "Klein"));
            repository.save(new Employee("Tommy", "Hilfiger"));
            repository.save(new Employee("Dan", "Rock"));
            repository.save(new Employee("Natalie", "Spark"));
        };
    }
}
