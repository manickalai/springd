package com.manic.springd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.manic.springd.DBService;

@SpringBootApplication
public class SpringdApplication  implements CommandLineRunner {

	@Autowired
	DBService dbService;

	public static void main(String[] args) {
		SpringApplication.run(SpringdApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(dbService.getData());
	}

}
