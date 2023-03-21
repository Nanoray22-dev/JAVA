package Java;

public class Array {

    public static void main(String[] args){
    //     String[] cars = new String[3];

    // cars[0] = "chevrolet";
    // cars[1] = "Corvettes";
    // cars[2] = "tesla";

    // for(int i = 0; i < cars.length; i++){
    //     System.out.println(cars[i]);
    // }
    
      String[][] cars = {
        {"camaro","chevrolet","Corvette"},
        {"Tesla","Nissan","Hyundai"},
        {"Mercedez","toyota","Volvo"}
      };

      for(int i = 0; i < cars.length; i++){
        System.out.println();
        for(int j = 0; j < cars[i].length; j++){
            System.out.println(cars[i][j] + " ");
        }
      }
    }
    
}
