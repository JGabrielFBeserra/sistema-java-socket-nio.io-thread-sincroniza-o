/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package servidormulticliente;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorMultiCliente {

    public static void main(String[] args) throws IOException {
        ServerSocket servidor = new ServerSocket(12345);

        System.out.println("Porta 12345 aberta! Aguardando conexão...");

       while(true){
        Socket cliente = servidor.accept();
        ThreadLerDados tcn = new ThreadLerDados(cliente);
        tcn.start();
       }

    }
}