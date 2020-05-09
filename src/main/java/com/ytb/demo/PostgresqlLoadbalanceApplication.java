package com.ytb.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;

@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
public class PostgresqlLoadbalanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostgresqlLoadbalanceApplication.class, args);
	}

}
