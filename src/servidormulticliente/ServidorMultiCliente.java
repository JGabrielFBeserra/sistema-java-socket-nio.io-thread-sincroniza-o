/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package servidormulticliente;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServidorMultiCliente {

    public static void main(String[] args) throws IOException {
        ServerSocket servidor = new ServerSocket(12345);

        
        
        System.out.println("Porta 12345 aberta! Aguardando conexão...");

        while (true) {
            Socket cliente = servidor.accept();
            Scanner entrada = new Scanner(cliente.getInputStream());
            PrintStream saida = new PrintStream(cliente.getOutputStream());
            
            if (entrada.hasNextLine()) {
                String mensagem = entrada.nextLine();
                System.out.println("Resposta recebida: " + mensagem);
                if (mensagem.equals("1")) {
                    System.out.println("Startando ThreadLerDados" );
                    ThreadLerDados tcn = new ThreadLerDados(cliente);
                    tcn.start();
                } else if (mensagem.equals("2")) {
                    ThreadListarDados tld = new ThreadListarDados(cliente);
                    tld.start();
                } else {
                    saida.println("Opção inválida!");
                }
                
            }
            
        
            
            
        }

    }
}
