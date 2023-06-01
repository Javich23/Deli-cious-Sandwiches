package org.yearup.sandwichshop;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class Main {
    public static void main(String[] args) {
        PlaySound playSound = new PlaySound("./Sound/bell-ringing-04.wav");
        playSound.playSound();
        System.out.println("\u001B[36m" + "\nWelcome in!");
        HomeScreen hs = new HomeScreen();
        hs.display();


    }
}