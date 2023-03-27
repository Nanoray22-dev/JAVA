package GUI;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Myframe extends JFrame {
    Myframe(){
        
        this.setTitle("New App");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setSize(420,420); // sets the x= dimesion and y- dimesion of frame
        this.setVisible(true); // make a frame visible
        ImageIcon image = new ImageIcon("logo.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(0,0,0));
    }
}
