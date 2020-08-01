/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegojava.main;

import javax.swing.JFrame;

public class Window extends JFrame{
    public static final int WIDTH = 800, HEIGHT = 600;
    
    public Window(){
        setTitle("Esto nunca pasó");
        setSize(WIDTH,HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Window();
    }
    
}
