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
        System.out.println(table); // Table frecuence of words

        StringBuilder sb = new StringBuilder();
        sb.append("Raysell puede");
        sb.append(" ");
        sb.append("Hacerlo");
        String result = sb.toString();
        System.out.println(result); // Using Cocantenation of words

        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Eloise", 0);
        ages.put("Nelson", 1);
        ages.put(result, 23);

       if(ages.containsKey("Eloise")){
            System.out.println("Raysell's age is " + ages.get("Eloise"));
       }

    }
}
