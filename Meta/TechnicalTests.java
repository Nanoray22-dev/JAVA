import java.io.BufferedReader;
import java.io.FileReader;

public class TechnicalTests {
    
    public static void main(String[] args){
        String fileName = "poem.txt";
        int words = 0;

        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);
            
            String line;
            while((line = bufferedReader.readLine())!= null){
                words += line.split(" ").length;

            }
            reader.close();
            System.out.println("The file " + fileName + " have " + words + " words");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
