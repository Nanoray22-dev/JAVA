package Tasks;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;



public class WordsCount {
    public static void main(String[] args) throws IOException{
        FileReader reader = new FileReader("poem.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        HashMap <String, Integer> table = new HashMap<String, Integer>();
        String line  = null;
        while((line = bufferedReader.readLine()) != null){
            String[] words = line.split(" ");
            for(String word : words){
                if(table.containsKey(word)){
                    table.put(word, table.get(word) + 1 );
                } else {
                    table.put(word, 1 );
                }
            }
        }
        System.out.println(table);

        bufferedReader.close();
        reader.close();    
    } 
}
