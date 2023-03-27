package File;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;


public class Audio {
    public static void main(String[] args)throws IOException, UnsupportedAudioFileException,LineUnavailableException{
        Scanner scanner = new Scanner(System.in);
    File file = new File("introUp.Wav");
    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);

    String response = "";

    while(!response.equals("Q")){
        System.out.println("P = Play , S = Stop, R = Reset, Q = quit");
        System.out.print("Type yout choice");

        response = scanner.next();
        response = response.toUpperCase();

        switch(response){
            case ("P"):  clip.start();
            break;
            case ("Q"): clip.close();
            break;
            case ("S"): clip.stop();
            break;
            case ("R"): clip.setMicrosecondPosition(0);
            break;
           default: System.out.println("Not a valid response");
        }
        System.out.println("thank u for u trainer");
    }

  


    }
    
}
