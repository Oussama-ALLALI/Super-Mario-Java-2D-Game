package com.TETOSOFT.tilegame;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class SoundManager {

	Clip clip;
	public SoundManager() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
    	File file = new File("C:\\Users\\USER\\Desktop\\Super-Mario-Java-2D-Game-master\\audio\\background.wav");
    	AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
    	clip = AudioSystem.getClip();
    	clip.open(audioStream);
    	clip.start();
    }
	public void stop() {
        clip.stop();
    }

	public void SoundGameOver() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
    	File file = new File("C:\\Users\\USER\\Desktop\\Super-Mario-Java-2D-Game-master\\audio\\Game_Over.wav");
    	AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
    	clip = AudioSystem.getClip();
    	clip.open(audioStream);
    	clip.start();
    }
    
}
