package com.rick;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDruidMultiDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDruidMultiDbApplication.class, args);
	}
}
