package com.example.hawebservicesrestfulapispringbootdemoapp;

import com.example.hawebservicesrestfulapispringbootdemoapp.game.GameRunner;
import com.example.hawebservicesrestfulapispringbootdemoapp.game.MarioGame;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HaWebServicesRestfulApiSpringBootDemoAppApplication {

	public static void main(String[] args) {
		// SpringApplication.run(HaWebServicesRestfulApiSpringBootDemoAppApplication.class, args);

		// Dependency is tightly coupled.
		MarioGame marioGame = new MarioGame();
		GameRunner gameRunner = new GameRunner(marioGame);
		gameRunner.run();
	}

}
