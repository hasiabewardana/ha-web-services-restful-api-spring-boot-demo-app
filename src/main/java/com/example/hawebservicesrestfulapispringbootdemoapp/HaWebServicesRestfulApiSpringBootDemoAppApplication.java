package com.example.hawebservicesrestfulapispringbootdemoapp;

import com.example.hawebservicesrestfulapispringbootdemoapp.game.GameRunner;
import com.example.hawebservicesrestfulapispringbootdemoapp.game.MarioGame;
import com.example.hawebservicesrestfulapispringbootdemoapp.game.SuperContra;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HaWebServicesRestfulApiSpringBootDemoAppApplication {

	public static void main(String[] args) {
		// SpringApplication.run(HaWebServicesRestfulApiSpringBootDemoAppApplication.class, args);

		// Dependency is tightly coupled.
		// MarioGame game = new MarioGame();
		SuperContra game = new SuperContra();
		GameRunner gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
