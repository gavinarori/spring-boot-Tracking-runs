package dev.gavinarori.restapi;


import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dev.gavinarori.restapi.run.Location;
import dev.gavinarori.restapi.run.Run;

@SpringBootApplication
public class RestapiApplication {

	public static final org.slf4j.Logger log = LoggerFactory.getLogger(RestapiApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(RestapiApplication.class, args);
		
	}

	@Bean
	CommandLineRunner runner(){
		return args -> {
            Run run = new Run(1,"first run", LocalDateTime.now(), LocalDateTime.now().plus(1,ChronoUnit.HOURS), 5, Location.OUTDOOR);
			log.info("Running" + run);
        };
	}

}