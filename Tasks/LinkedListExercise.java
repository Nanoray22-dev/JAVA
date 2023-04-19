package Tasks;
import java.util.LinkedList;

public class LinkedListExercise {
   public static void main(String[] args) {
      LinkedList<String> list = new LinkedList<String>();

      // Add some elements to the list
      list.add("apple");
      list.add("banana");
      list.add("cherry");
      list.add("orange");
      System.out.println("Original list: " + list);

      // Remove the first and last elements of the list
      String first = list.removeFirst();
      String last = list.removeLast();
      System.out.println("First element removed: " + first);
      System.out.println("Last element removed: " + last);
      System.out.println("New list: " + list);
   }
}
