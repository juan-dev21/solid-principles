package com.jpdev.solid.isp;

public class GameConsoleImpl implements GameConsole{
    @Override
    public void playGame() {
        System.out.println("Reproduciendo audio de juego");
    }

    @Override
    public void playVideo() {
        System.out.println("Reproduciendo video de juego");
    }

    @Override
    public void playAudio() {
        System.out.println("Reproduciendo juego");
    }
}
