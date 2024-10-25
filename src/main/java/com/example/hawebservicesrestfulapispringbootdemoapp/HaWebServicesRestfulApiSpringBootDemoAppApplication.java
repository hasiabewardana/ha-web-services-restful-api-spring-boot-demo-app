package com.example.hawebservicesrestfulapispringbootdemoapp;


import com.example.hawebservicesrestfulapispringbootdemoapp.enterprise.example.web.WebController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HaWebServicesRestfulApiSpringBootDemoAppApplication {
    public static void main(String[] args) {
/*//        Dependency is tightly coupled.
//        MarioGame game = new MarioGame();
        SuperContraGame game = new SuperContraGame();
//        PacmanGame pacman = new PacmanGame();

        GameRunner gameRunner = new GameRunner(game);
        gameRunner.run();*/

/*//        Dependency is loosely coupled with interfaces.
//        GamingConsole game = new MarioGame();
        GamingConsole game = new SuperContraGame();
//        GamingConsole pacman = new PacmanGame();

        GameRunner gameRunner = new GameRunner(game);
        gameRunner.run();*/

        //Application context manages all beans
        ConfigurableApplicationContext context = SpringApplication.run(HaWebServicesRestfulApiSpringBootDemoAppApplication.class, args);

        /*//Get bean from the Application Context
        GameRunner gameRunner = context.getBean(GameRunner.class);
        gameRunner.run();*/

        /*//Web controller
        WebController bean = context.getBean(WebController.class);
        System.out.println(bean.returnSum());*/
    }
}