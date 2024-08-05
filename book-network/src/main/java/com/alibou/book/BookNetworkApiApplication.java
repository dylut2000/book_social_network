package com.alibou.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BookNetworkApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(BookNetworkApiApplication.class, args);

		System.out.println("########## Hello from the APP ##########");
	}

}
