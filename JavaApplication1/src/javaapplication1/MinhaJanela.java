
package javaapplication1;

import java.awt.HeadlessException;
import javax.swing.JFrame;


public class MinhaJanela extends JFrame{
    
    public MinhaJanela() throws HeadlessException{
        setTitle("Minha Janela");
        setSize(600,400);
        setDefautCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
