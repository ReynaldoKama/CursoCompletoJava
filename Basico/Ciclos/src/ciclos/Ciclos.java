/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclos;

/**
 *
 * @author FOX5
 */
public class Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CICLO WHILE
        int c = 1;
        System.out.println("Ciclo while");
        while(c<=10){
            System.out.print(c+" ");
            c++;
        }
        //CICLO DO WHILE
        System.out.println("\nCiclo do while");
        int count=0;
        do{
            System.out.print(count+" ");
            count++;
        }while(count<10);
        //CICLO FOR
        System.out.println("\nCiclo for");
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
    }
    
}
