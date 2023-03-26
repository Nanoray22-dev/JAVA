package Java.OOP;

public class Car {
   private String make;
   private String model;
   private String color;
   private int year;
   
   Car(String make, String model, String color, int year){
    this.setMake(make);
    this.setModel(model);
    this.setColor(color);
    this.setYear(year);
   }

   public String getMake(){
    return make;
   }
   public String getModel(){
    return model;
   }
   public String getColor(){
    return color;
   }
   public int getYear(){
    return year;
   }
   public void setMake(String make){
      this.make = make;
   }
   public void setModel(String model){
    this.model = model;
 }
 public void setColor(String color){
  this.color = color;
}
public void setYear(int year){
  this.year = year;
}
}
