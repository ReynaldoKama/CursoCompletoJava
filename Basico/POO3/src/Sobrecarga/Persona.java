/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sobrecarga;

/**
 *
 * @author FOX5
 */
public class Persona {
    String nombre;
    int edad;
    String dni;
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String dni) {
        this.dni = dni;
    }
    
    public void correr(){
        System.out.println("yo "+nombre+" Estoy corriendo una maraton");
    }
    public void correr(int km){
        System.out.println("Corri "+km+" kilometros");
    }
    
}
