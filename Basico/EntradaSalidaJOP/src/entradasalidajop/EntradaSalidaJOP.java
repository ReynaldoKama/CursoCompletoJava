/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entradasalidajop;

import javax.swing.JOptionPane;
/**
 *
 * @author FOX5
 */
public class EntradaSalidaJOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        float decimal;
        
        cadena = JOptionPane.showInputDialog("Digite una cadena: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
        letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        decimal = Float.parseFloat(JOptionPane.showInputDialog("Digite un decimal: "));
        
        JOptionPane.showMessageDialog(null, "La cadena es: "+cadena);
    }
    
}
