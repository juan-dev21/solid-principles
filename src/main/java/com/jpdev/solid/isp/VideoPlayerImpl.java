package com.jpdev.solid.isp;

public class VideoPlayerImpl implements VideoPlayer {
    @Override
    public void playVideo() {
        System.out.println("Redproduciendo audio de video ...");
    }

    @Override
    public void playAudio() {
        System.out.println("Reproduciendo video");
    }
}
