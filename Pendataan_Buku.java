/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pendataan_buku;

import view.data_buku;

/**
 *
 * @author MAKAYASA
 */
public class Pendataan_Buku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
            new data_buku().setVisible(true);
        }
        });
        // TODO code application logic here
    }
    
}
