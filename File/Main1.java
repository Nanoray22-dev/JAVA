package File;

import java.io.FileWriter;
import java.io.IOException;

public class Main1 {
    public static void main(String[] args){
        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Rose are red \nViolets are blue \nBooty' booty booty booty \nRocky' evrywhere!");
            writer.append("\n(A poem by Raysel)");
            writer.close();
        } catch (IOException e) {
            
            e.printStackTrace();
        }


    }
}
