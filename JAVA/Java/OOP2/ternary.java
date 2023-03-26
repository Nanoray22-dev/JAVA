package Java.OOP2;
import java.util.Arrays;

public class ternary {
    public static void main(String[] args){
          //un operador ternario en numeros
        int a = 10;
        int y = (a > 5) ? 20 : 30;
        System.out.println(y);

        // una manera de convertir un operador ternario en String
        int x = 10;
        boolean isGreaterThanNumber = (x > 20)? true :false;
        String resultNumber = Boolean.toString(isGreaterThanNumber);
        System.out.println(resultNumber);

        // un operador ternario en array
        boolean[] booArray = { true, false, true, true, false};
        String[] stringArray = new String[booArray.length];
        for(int i = 0; i < booArray.length; i++){
            stringArray[i] = booArray[i] ? "true" : "false";
        }

        System.out.println(Arrays.toString(stringArray));


  
}
}