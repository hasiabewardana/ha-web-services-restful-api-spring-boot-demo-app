package com.example.hawebservicesrestfulapispringbootdemoapp;

import com.example.hawebservicesrestfulapispringbootdemoapp.game.GameRunner;
import com.example.hawebservicesrestfulapispringbootdemoapp.game.GamingConsole;
import com.example.hawebservicesrestfulapispringbootdemoapp.game.PacmanGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HaWebServicesRestfulApiSpringBootDemoAppApplication {

	public static void main(String[] args) {
		// Application context manages all beans
		ConfigurableApplicationContext context = SpringApplication.run(HaWebServicesRestfulApiSpringBootDemoAppApplication.class, args);

		// Dependency is tightly coupled.
		// MarioGame game = new MarioGame();
		// SuperContra game = new SuperContra();
		// GamingConsole game = new PacmanGame();
		// GameRunner gameRunner = new GameRunner(game);

		// Get bean from the Application Context
		GameRunner gameRunner = context.getBean(GameRunner.class);
		gameRunner.run();
	}

}
