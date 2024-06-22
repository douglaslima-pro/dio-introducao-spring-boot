package edu.douglaslima.spring.springboot.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import com.google.gson.Gson;

import java.util.Scanner;

@Configuration
public class BeansFactory {
	
	@Bean
	public Gson gson() {
		return new Gson();
	}
	
	@Bean
	public Scanner scanner() {
		return new Scanner(System.in);
	}

}
