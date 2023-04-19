package Tasks;
/*
Create a Java application that generates a list of random numbers 
and sorts them using the bubble sort algorithm.
 */

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args){
        int[] randomList = generateRandomList(10);

        System.out.println("Unsorted list:");
        printList(randomList);

        bubbleSort(randomList);

        System.out.println("\nSorted list:");
        printList(randomList);

    }
        public static int[] generateRandomList(int length) {
        int[] list = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            list[i] = random.nextInt(100);
        }
        return list;
    }

    private static void printList(int[] list) {
        for(int i = 0; i < list.length; i++){
            System.out.println(list[i] + " ");
        }
        System.out.println();

    }

    public static void bubbleSort(int[] list){
        int n = list.length;
        for (int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i; j++){
                if(list[j] > list[j + 1]){
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }
}
