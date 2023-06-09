package com.gmail.harashchenia.dzmitry.pet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class BudgetPlannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BudgetPlannerApplication.class, args);
	}

}
