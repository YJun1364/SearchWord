package com.jade.swp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SwpApplication {

	public static void main(String[] args) {//스프링 앱을 실행하는 부분 내장 톰캣을 가동시킴
		SpringApplication.run(SwpApplication.class, args);
	}

}
