package com.example.hawebservicesrestfulapispringbootdemoapp.game;

public class GameRunner {
    // private MarioGame game;
    // private SuperContra game;
    private GamingConsole game;

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
