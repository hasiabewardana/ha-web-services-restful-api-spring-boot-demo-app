package com.example.hawebservicesrestfulapispringbootdemoapp;

import com.example.hawebservicesrestfulapispringbootdemoapp.game.looslycoupledwithinterface.GameRunner;
import com.example.hawebservicesrestfulapispringbootdemoapp.game.looslycoupledwithinterface.PacmanGame;
import com.example.hawebservicesrestfulapispringbootdemoapp.game.looslycoupledwithinterface.SuperContraGame;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HaWebServicesRestfulApiSpringBootDemoAppApplication {

    public static void main(String[] args) {
        //Dependency is tightly coupled.
        //MarioGame game = new MarioGame();
        //SuperContraGame game = new SuperContraGame();
        PacmanGame game = new PacmanGame();

        GameRunner gameRunner = new GameRunner(game);
        gameRunner.run();

        // Application context manages all beans
        //ConfigurableApplicationContext context = SpringApplication.run(HaWebServicesRestfulApiSpringBootDemoAppApplication.class, args);

        // Get bean from the Application Context
        //GameRunner gameRunner = context.getBean(GameRunner.class);
        //gameRunner.run();
    }

}
