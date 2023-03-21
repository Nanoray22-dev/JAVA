package Java.OOP;

public class Main2 {
    public static void main(String[] args){
        Pizza pizza = new Pizza("thicc crust",
                                "tomato", 
                                "mozarrella", 
                                "pepperoni");
        System.out.println("Here are the ingredients of your pizza");
        System.out.println(pizza.bread);
        System.out.println(pizza.cheese);
        System.out.println(pizza.sauce);
        System.out.println(pizza.topping);

    }
}
