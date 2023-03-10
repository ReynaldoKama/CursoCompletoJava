/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionalcajero;

import java.util.Scanner;

/**
 *
 * @author FOX5
 */
public class CondicionalCajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float saldo = 1000, monto_i, monto_r;
        int opcion;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("Seleccione la accion que desea realizar:");
            System.out.println("\t1/ Ingresar dinero a la cuenta");
            System.out.println("\t2/ Retirar dinero a la cuenta");
            System.out.println("\t3/ Salir");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1: {
                    System.out.println("Ingrese el monto que desea depositar: ");
                    monto_i = entrada.nextFloat();
                    saldo += monto_i;
                    break;
                }
                case 2: {
                    System.out.println("Ingrese el monto que desea retirar: ");
                    monto_r = entrada.nextFloat();
                    if(monto_r>saldo){
                        System.out.println("El monto es mayor a su saldo");;
                        break;
                    }else{
                        saldo -= monto_r;
                        break;
                    }

                }
                case 3:{
                    break;
                }
                default: System.out.println("Opcion no valida");
            }
        }while(opcion !=3);
        
        
        
        System.out.println("Monto actual: "+saldo);
    }
    
}
