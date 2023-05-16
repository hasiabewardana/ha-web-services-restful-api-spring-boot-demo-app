package com.example.hawebservicesrestfulapispringbootdemoapp;

import com.example.hawebservicesrestfulapispringbootdemoapp.game.looslycoupledwithinterface.GameRunner;
import com.example.hawebservicesrestfulapispringbootdemoapp.game.looslycoupledwithinterface.GamingConsole;
import com.example.hawebservicesrestfulapispringbootdemoapp.game.looslycoupledwithinterface.MarioGame;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HaWebServicesRestfulApiSpringBootDemoAppApplication {

    public static void main(String[] args) {
        //Dependency is tightly coupled.
        GamingConsole game = new MarioGame();

        GameRunner gameRunner = new GameRunner(game);
        gameRunner.run();

        // Application context manages all beans
        //ConfigurableApplicationContext context = SpringApplication.run(HaWebServicesRestfulApiSpringBootDemoAppApplication.class, args);

        // Get bean from the Application Context
        //GameRunner gameRunner = context.getBean(GameRunner.class);
        //gameRunner.run();
    }

}
