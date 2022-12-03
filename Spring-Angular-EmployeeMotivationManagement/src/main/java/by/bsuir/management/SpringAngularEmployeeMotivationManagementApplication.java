package by.bsuir.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"by.bsuir.management.models", "by.bsuir.management.repository"})
public class SpringAngularEmployeeMotivationManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAngularEmployeeMotivationManagementApplication.class, args);
	}

}
