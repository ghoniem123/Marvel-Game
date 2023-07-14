package engine;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import views.*;
import javax.sound.sampled.*;

public class Controller  {
	
	Clip clip;
	
	public Controller() {
		
		File file=new File("Avengers_Theme_Extended_(getmp3.pro).wav");
		
		try {
			AudioInputStream audio=AudioSystem.getAudioInputStream(file);
			 this.clip=AudioSystem.getClip();
			this.clip.open(audio);
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
			e.printStackTrace();
		}
		
		    this.clip.loop(Clip.LOOP_CONTINUOUSLY);
			this.clip.start();
		
		
	new starter_frame();	
	
	}
	
	
	public static void main(String[] args) {
		new Controller();

	}
	
}
