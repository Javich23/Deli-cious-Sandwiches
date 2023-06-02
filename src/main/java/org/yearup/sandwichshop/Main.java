package org.yearup.sandwichshop;

public class Main {
    public static void main(String[] args) {
        PlaySound playSound = new PlaySound("./Sound/bell-ringing-04.wav");
        playSound.playSound();
        String header =
                "  __        __   _                            \n" +
                        "  \\ \\      / /__| | ___ ___  _ __ ___   ___    \n" +
                        "   \\ \\ /\\ / / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\  \n" +
                        "    \\ V  V /  __/ | (_| (_) | | | | | |  __/    \n" +
                        "     \\_/\\_/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \n";

        System.out.println(header);
        System.out.println("\u001B[36m" + "\nWelcome in!");
        HomeScreen hs = new HomeScreen();
        hs.display();


    }
}
