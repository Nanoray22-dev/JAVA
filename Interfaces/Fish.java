package Interfaces;

public class Fish implements Predator, Prey {

    @Override
    public void flee() {
        System.out.println("The fish is fleeing smaller fish");
    }

    @Override
    public void hunt() {
        System.out.println("This fish is  hunting a bigger fish");
    }
    
}
