package org.ocp;

public class SoundProcessor {

    private final Extension file;

    public SoundProcessor(Extension file) {
        this.file = file;
    }

    public void play(){
        file.play();
    }
}