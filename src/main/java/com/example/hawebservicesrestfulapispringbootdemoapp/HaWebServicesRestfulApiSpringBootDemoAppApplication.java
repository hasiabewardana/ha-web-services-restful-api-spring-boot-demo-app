package com.example.hawebservicesrestfulapispringbootdemoapp;

import com.example.hawebservicesrestfulapispringbootdemoapp.game.looselycoupledwithspring.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HaWebServicesRestfulApiSpringBootDemoAppApplication {

    public static void main(String[] args) {
        //Dependency is tightly coupled.
        //GamingConsole game = new MarioGame();
        //GameRunner gameRunner = new GameRunner(game);
        //gameRunner.run();

        //Application context manages all beans
        ConfigurableApplicationContext context = SpringApplication.run(HaWebServicesRestfulApiSpringBootDemoAppApplication.class, args);

        //Get bean from the Application Context
        GameRunner gameRunner = context.getBean(GameRunner.class);
        gameRunner.run();
    }

}
