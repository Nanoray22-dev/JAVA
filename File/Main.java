package File;

import java.io.File;

public class Main {
    
    public static void main(String[] args){
        File file = new File("art.txt");
        if(file.exists()){
            System.out.println("That file exist!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            // file.delete();
            
        }else{
            System.out.println("not exist!");
        }
    }
}
