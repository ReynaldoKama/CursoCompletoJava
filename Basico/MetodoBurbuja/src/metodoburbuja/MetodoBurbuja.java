/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodoburbuja;

import java.util.Scanner;

/**
 *
 * @author FOX5
 */
public class MetodoBurbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = {2,3,4,1,8,9,5,6,9,10};
        int aux;
        //METODO BURBUJA
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(arreglo[j]>arreglo[j+1]){
                    aux = arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                }
            }
        }
        
        System.out.println("Arreglo ordenado creciente");
        for(int i:arreglo){
            System.out.println(i);
        }
        
    }
    
}
