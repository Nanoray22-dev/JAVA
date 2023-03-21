package Java;

import java.util.ArrayList;

public class forEach {
    public static void main(String[] args){
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("Dog");
        animals.add("rat");
        animals.add("bird");

        for(String i : animals){
            System.out.println(i);
        }
    }
}
