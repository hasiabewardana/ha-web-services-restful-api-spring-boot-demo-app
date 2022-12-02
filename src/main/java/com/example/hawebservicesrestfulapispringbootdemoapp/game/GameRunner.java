package com.example.hawebservicesrestfulapispringbootdemoapp.game;

public class GameRunner {
    private MarioGame marioGame;

    public GameRunner(MarioGame marioGame) {
        this.marioGame = marioGame;
    }

    public void run() {
        marioGame.up();
        marioGame.down();
        marioGame.left();
        marioGame.right();
    }
}
