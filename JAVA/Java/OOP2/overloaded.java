package Java.OOP2;

public class overloaded {
    public static void main(String[] args){

        Double x = add(1.0,2.0,3.0,4.0);
        System.out.println(x);
          
    } 
     static int add(int a, int b){
        System.out.println("This is overloaded method #1");
                return a + b;
            }
            static int add(int a, int b, int c){
             System.out.println("This is overloaded method #2");
                return a + b + c;
            }
            static int add(int a, int b, int c, int d){
                System.out.println("This is overloaded method #3");
                return a + b + c + d;
            }
            static Double add(Double a, int b){
                System.out.println("This is overloaded method #4");
                        return a + b;
                    }
                    static Double add(Double a, Double b, Double c){
                     System.out.println("This is overloaded method #5");
                        return a + b + c;
                    }
                    static Double add(Double a, Double b, Double c, Double d){
                        System.out.println("This is overloaded method #6");
                        return a + b + c + d;
                    }
        
}
