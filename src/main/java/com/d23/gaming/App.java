package com.d23.gaming;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class App implements CommandLineRunner {
	
	private static Logger logger = LoggerFactory.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	  logger.info("hihihihihih i like tomatoes");
        SpringApplication app = new SpringApplication(App.class);
        app.run(args);
      

    }

	@SuppressWarnings("resource")
	public void run(String... args) throws Exception {
		logger.info("initializing game");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/application-context.xml");
		logger.info("game assets loaded");
		Engine engine = applicationContext.getBean("startEngine", Engine.class);
		logger.info("game engine loaded");
		Scanner scanner = new Scanner(System.in);
		logger.info("starting game");
		while(engine.gameStatus==Engine.GameStatus.RUNNNING) {
			engine.execute(scanner.nextLine());
		}
	}
}
