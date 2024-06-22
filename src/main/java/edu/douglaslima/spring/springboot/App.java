package edu.douglaslima.spring.springboot;

// imports do Spring Boot
import org.springframework.boot.autoconfigure.SpringBootApplication; // @SpringBootApplication
import org.springframework.boot.SpringApplication; // SpringApplication.run()
import org.springframework.boot.CommandLineRunner;

// anotações do Spring
import org.springframework.context.annotation.Bean; // @Bean
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order; // Order

// LOGGER
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class App {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	
	@Autowired
	private edu.douglaslima.spring.springboot.configuration.SpringApplication springAppProperties;
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
	@Bean
	@Order(1)
	public CommandLineRunner exibirPropriedades() throws Exception {
		return arg -> {
			System.out.println();
			LOGGER.info("Propriedades da aplicação: ");
			LOGGER.info(String.format("spring.application.name: \"%s\"", springAppProperties.getName()));
			LOGGER.info(String.format("autor: \"%s\"", springAppProperties.getAutor()));
			LOGGER.info(String.format("ambiente: \"%s\"", springAppProperties.getAmbiente()));
		};
	}

}