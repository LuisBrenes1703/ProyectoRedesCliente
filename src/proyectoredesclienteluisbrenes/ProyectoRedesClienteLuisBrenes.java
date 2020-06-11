/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoredesclienteluisbrenes;

import GUI.VentanaPrincipal;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class ProyectoRedesClienteLuisBrenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       String ipServidor = "";
       
        
        ipServidor = JOptionPane.showInputDialog("Digite la ip del servidor");
        
        if (ipServidor != "") {
            JFrame jFrame = new JFrame("Proyecto redes");
            jFrame.add(new VentanaPrincipal(ipServidor));
//            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            jFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
//            jFrame.setDefaultCloseOperation(0);
            jFrame.pack();
            jFrame.setLocationRelativeTo(null);
            jFrame.setResizable(false);
            jFrame.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Es necesario una ip");
            
        }
    }
    
}
