import java.io.BufferedReader;
import java.io.FileReader;

public class memory {
    public static void main (String[] args){
        String fileName = "poem.txt";
        int count = 0;

        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while((line = bufferedReader.readLine()) != null){
                count += line.split(" ").length;
            }
            reader.close();
            System.out.println("la carta contiene la cantidad de " + count + " palabras " );
        } catch (Exception e) {
          e.printStackTrace();
        }
    }
}
