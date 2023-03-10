/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesYObjetos;

import java.util.Scanner;

/**
 *
 * @author FOX5
 */
public class Operacion {
    //Atributos
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    
    //Metodos
        
    public void sumar(int num1, int num2){
        suma = num1+num2;
    }
    public void restar(int num1, int num2){
        resta = num1-num2;
    }
    public void multiplicar(int num1, int num2){
        multiplicacion = num1*num2;
    }
    public void dividir(int num1, int num2){
        division = num1/num2;
    }
    public void mostrar(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }
    
}
