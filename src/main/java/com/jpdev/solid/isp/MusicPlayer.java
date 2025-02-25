package com.jpdev.solid.isp;

public class MusicPlayer implements AudioPlayer{
    @Override
    public void playAudio() {
        System.out.println("Reprodciendo audio ...");
    }
}
