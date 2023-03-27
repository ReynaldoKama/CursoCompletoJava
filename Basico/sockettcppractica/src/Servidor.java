
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FOX5
 */
public class Servidor {
    public static void main(String[] args){
        ServerSocket servidor = null; //socket del servidor
        Socket sc = null; //socket del cliente
        final int PUERTO = 5001;
        DataInputStream in;
        DataOutputStream out;
        try {
            servidor = new ServerSocket(PUERTO);
            System.out.println("Servidor iniciado");
            while(true){
                sc = servidor.accept(); //se queda a la espera hasta que se conecte un cliente
                System.out.println("Cliente Conectado");
                
                //in y out se crean apartir del socket del cliente
                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());
                
                String mensaje = in.readUTF();// se queda a la espera de que el cliente mande un mensaje
                System.out.println(mensaje);
                out.writeUTF(mensaje+" desde el servidor");
                
                sc.close();//cerrar cliente
                System.out.println("Cliente desconectado");
                
            }
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
