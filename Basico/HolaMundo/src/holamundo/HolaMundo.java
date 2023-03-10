/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

/**
 *
 * @author FOX5
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Atajo sout+tab para generar System.out.println
        System.out.println("Hola mundo");
        //VARIABLES: espacion en memoria y el valor puede cambiar en cualquier momento
        //DATOS DE TIPO PRIMITIVO
        //Enteros
        byte a=12; //Entero de -128 a 127 tamaño 8
        short b = 200;//Entero de -32768 a 32767 tamaño 16
        int c = 45675664; //entero de tamaño 32
        long d = 345; //Entero de tamaño 64
        //Flotantes
        float e = 3.5f; //Tamaño 32 especificar con una f
        double f = 4.5; //Tamaño 64 
        //Caracteres
        char caracter = 'a';
        //Boleano
        boolean decision = true; //o false
        
        
        //DATOS DE TIPO NO PRIMITIVOS
        Integer numero = 10;//permite almacenar valores enteros y a la vez Null
        //los datos no primitivos tienen metodos
        
        //CADENAS
        String palabra = "Hola Mundo";
        System.out.println("Numero entero: "+a);
        
        //CONSTANTES: espacion en memoria su valor no puede ser cabiado
        final int num =10; 
    }    
}
