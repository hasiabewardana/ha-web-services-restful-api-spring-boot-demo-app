package com.example.hawebservicesrestfulapispringbootdemoapp.game.looselycoupledwithspring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("MarioGame up");
    }

    @Override
    public void down() {
        System.out.println("MarioGame down");
    }

    @Override
    public void left() {
        System.out.println("MarioGame left");
    }

    @Override
    public void right() {
        System.out.println("MarioGame right");
    }
}
