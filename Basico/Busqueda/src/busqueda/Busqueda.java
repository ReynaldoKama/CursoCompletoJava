/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package busqueda;

/**
 *
 * @author FOX5
 */
public class Busqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arreglo[] = {4,1,5,2,3};
        int dato = 6;
        boolean band = false;
        //BUSQUEDA SECUENCIAL
        int i = 0;
        while(i<5 && band==false){
            if(arreglo[i]==dato){
                band=true;
            }
            i++;
        }
        if(band==false){
            System.out.println("Valor no fue encontrado");
        }else{
            System.out.println("El valor fue encontrado en la posicion: "+(i-1));
        }
    }
    
}
