package Interfaces;

     interface vehicle{

        void changeGear(int a);
        void speedUp(int a);
        void applyBreak(int a);
        void printState();

     };

     class Bicycle implements vehicle{
        int speed;
        int gear; 

        public void changeGear(int newGear){
        gear = newGear;
     }
     @Override
     public void speedUp(int increment){
        speed = speed + increment;
     }
     @Override
     public void applyBreak(int decrement){
        speed = speed - decrement;
     }
     @Override
     public void printState(){
        System.out.println("speed" + speed + " gear" + gear);

     }
}
     class Bike implements vehicle{
        int speed;
        int gear;

        @Override
        public void changeGear(int newGear){
            gear = newGear;
        }
        @Override
        public void speedUp(int increment){
            speed = speed + increment;
        }
        @Override
        public void applyBreak(int decrement){
            speed = speed - decrement;
        }
        public void printState(){
            System.out.println("speed" + speed + "gea" + gear);
        }
        

     }
        class GFG{
            public static void main(String[] args){
                Bicycle bicycle = new Bicycle();
                bicycle.changeGear(3);
                bicycle.speedUp(4);
                bicycle.applyBreak(2);
                
                System.out.println("Bicycle print state:");
                bicycle.printState();

                Bike bike = new Bike();
                bike.changeGear(3);
                bike.speedUp(4);
                bike.applyBreak(1);

                System.out.println("Bike print State");
                bike.printState();
            }
                    
                }



     

