package com.example.hawebservicesrestfulapispringbootdemoapp;

import com.example.hawebservicesrestfulapispringbootdemoapp.game.GameRunner;
import com.example.hawebservicesrestfulapispringbootdemoapp.game.PacmanGame;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HaWebServicesRestfulApiSpringBootDemoAppApplication {

	public static void main(String[] args) {
		// SpringApplication.run(HaWebServicesRestfulApiSpringBootDemoAppApplication.class, args);

		// Dependency is tightly coupled.
		// MarioGame game = new MarioGame();
		// SuperContra game = new SuperContra();
		PacmanGame game = new PacmanGame();
		GameRunner gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
