package com.jpdev.solid.isp;

public class IspMain {

    public static void main(String[] args) {
        AudioPlayer musicPlayer = new MusicPlayer();
        VideoPlayer videoPlayer = new VideoPlayerImpl();
        GameConsole gameConsole = new GameConsoleImpl();

        musicPlayer.playAudio();

        videoPlayer.playVideo();
        videoPlayer.playAudio();

        gameConsole.playGame();
        gameConsole.playAudio();
        gameConsole.playVideo();
    }
}
