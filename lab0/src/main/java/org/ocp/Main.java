package org.ocp;

public class Main {
    public static void main(String[] args) {
        SoundProcessor spMp3 = new SoundProcessor(new Mp3Player());
        SoundProcessor spWav = new SoundProcessor(new WavPlayer());

        spWav.play();
        spMp3.play();
    }
}
