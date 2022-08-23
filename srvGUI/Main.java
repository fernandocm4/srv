/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package srvGUI;
import java.awt.*;


/**
 *
 * @author Fernando Candido
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainFrame janela = new MainFrame();

        
        janela.setLayout(null);
       //janela.setLayout(new GridBagLayout());
        janela.setExtendedState(MainFrame.MAXIMIZED_BOTH);
        janela.setVisible(true);
    }
    
}
