package Tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AverageGrades {
    public static void main(String[] args){
        // Promp the user for the filename
        // String filename = System.console().readLine("Enter the filename");

        try (FileReader reader = new FileReader("grades.txt")){
            int data = reader.read();
            while( data != -1 ){
                System.out.print((char)data);
                data = reader.read();
            }
            // Open the file and create a buffered reader ro read it
            FileReader fileReader = new FileReader("grades.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            // Initialize variables for calculating the sum and count of grades
            double sum = 0;
            int count = 0;
             
            // Read each line of the file and add the grade to the sum
            String line;
            while((line = bufferedReader.readLine()) !=null){
                double grade = Double.parseDouble(line);
                sum += grade;
                count++;
            }

            // calculate the average grade
            double average = sum / count;

            //Display the result to the user
            System.out.println();
            System.out.println(" the average grade is %" + average);

            // close 

            bufferedReader.close();
            fileReader.close(); 
        } catch (IOException e) {
            // Handle error
            System.out.println(" Error" + e.getMessage());
        } catch (NumberFormatException e) {
            // Handle error
            System.out.println("Error: Invalid grade average");
        } 
    }
}
