import java.util.HashMap;

public class CountWords {
    public static void main(String[] main){
        String str = "Raysell can get the job";
        HashMap <Character, Integer> table = new HashMap<Character, Integer>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(table.containsKey(ch)){
                table.put(ch,table.get(ch) + 1 );
            } else {
                table.put(ch, 1);
            }
        }
        System.out.println(table);
    }
}
