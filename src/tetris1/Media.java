package Tetris1;
import java.io.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Media extends Tetris1 {

    static void PlaySound (File Sound){
        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();
            clip.loop(10);

        }catch(Exception e)
        {
    
        }
}
}