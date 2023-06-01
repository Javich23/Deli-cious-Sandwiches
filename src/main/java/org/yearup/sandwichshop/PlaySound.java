package org.yearup.sandwichshop;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.SourceDataLine;
import java.io.File;
import java.io.IOException;

public class PlaySound {
    private File file;
    private AudioInputStream audio;
    private byte[] buffer;
    private SourceDataLine line;

        public PlaySound(String fileName) {
            try {
                // Load WAV file into byte array
                file = new File("./Sound/bell-ringing-04.wav");
                audio = AudioSystem.getAudioInputStream(file);
                buffer = new byte[(int) audio.getFrameLength() * audio.getFormat().getFrameSize()];
                audio.read(buffer);

                // Create SourceDataLine object for playing the sound
                line = AudioSystem.getSourceDataLine(audio.getFormat());
                line.open();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void playSound() {
            try {
                // Start playing the sound
                line.start();
                line.write(buffer, 0, buffer.length);

                // Wait for the sound to finish playing
                line.drain();
                // Close the line
                line.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

