package com.company.album;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"controller, service, dao, model"}) 
public class AlbumRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlbumRestApplication.class, args);
	}

}
