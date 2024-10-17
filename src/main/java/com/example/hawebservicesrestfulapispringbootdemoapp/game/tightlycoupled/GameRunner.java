package com.example.hawebservicesrestfulapispringbootdemoapp.game.tightlycoupled;

public class GameRunner {
//    private final MarioGame game;
    private SuperContraGame game;
//    private PacmanGame game;

    public GameRunner(SuperContraGame game) {
        this.game = game;
    }

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
