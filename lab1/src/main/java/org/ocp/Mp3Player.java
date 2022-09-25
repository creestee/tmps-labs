package org.ocp;

public class Mp3Player implements Extension{
    @Override
    public void play() {
        System.out.println("Play MP3 file...");
    }
}