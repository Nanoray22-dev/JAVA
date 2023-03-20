package Java;
import javax.swing.JOptionPane;
public class GUI {
    // this is how can u show of message in second screen
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age " ));
        JOptionPane.showMessageDialog(null, "you are " + age +  " year olds");

        Double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your age " ));
        JOptionPane.showMessageDialog(null, " you are " + height + " cm tall");
    }
}
