package com.example.hawebservicesrestfulapispringbootdemoapp.game.looselycoupledwithspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private final GamingConsole game;

    @Autowired
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
