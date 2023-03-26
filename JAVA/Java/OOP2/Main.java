package Java.OOP2;
import java.util.ArrayList;
public class Main {
    /**
     * @param args
     */
    public static void main(String[] args){
       

        // food.add("Pizza");
        // food.add("Hamburger");
        // food.add("hotdog");
        // food.add("Pica Pollo");
        // food.add("Burrito");
        
        // food.set(0, "Tacos");
        // food.remove(2);
        // food.clear();

        // for( int i = 0; i < food.size(); i++){
        //     System.out.println(food.get(i));
        // }

        // 2D ArrayList 

        ArrayList<ArrayList<String>> groceList = new ArrayList<>();

         ArrayList<String> bakeryList = new ArrayList<String>();

         bakeryList.add("pasta");
         bakeryList.add("Pizza");
         bakeryList.add("donuts");
         bakeryList.add("garlic bread");

         ArrayList<String> bakerList = new ArrayList<String>();

         bakerList.add("pasta");
         bakerList.add("Pizza");
         bakerList.add("donuts");

         ArrayList<String> drinksList = new ArrayList<String>();

         drinksList.add("soda");
         drinksList.add("water");
         drinksList.add("wine");
         

         groceList.add(bakeryList);
         groceList.add(bakerList);
         groceList.add(drinksList);

         System.out.println(groceList.get(0).get(1));

    }

    
}
