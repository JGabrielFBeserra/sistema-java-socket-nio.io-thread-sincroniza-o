/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidormulticliente;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException {
        Socket cliente = new Socket("127.0.0.1", 12345);

        Scanner entrada = new Scanner(cliente.getInputStream());
        PrintStream saida = new PrintStream(cliente.getOutputStream());
        Scanner teclado = new Scanner(System.in);
        System.out.println("Você deseja cadastrar uma pessoa na base ou listar as pessoas? [1] Cadastrar [2] Listar");
        String opcaoStr = teclado.nextLine(); 
        int opcao = 0;
        try {
            opcao = Integer.parseInt(opcaoStr); // <-- Converter para int
        } catch (NumberFormatException e) {
            System.err.println("Opção inválida.");
            cliente.close();
            return;
        }
        
        System.out.println("Enviando a resposta para o servidor !");
        saida.println(opcao);

        if (opcao == 1) {
            //Nome, 
            if (entrada.hasNextLine()) {
                System.out.print(entrada.nextLine());
            }
            saida.println(teclado.nextLine());

            //Endereço, 
            if (entrada.hasNextLine()) {
                System.out.print(entrada.nextLine());
            }

            saida.println(teclado.nextLine());

            //CPF, 
            if (entrada.hasNextLine()) {
                System.out.print(entrada.nextLine());
            }
            saida.println(teclado.nextLine());

            //Idade, 
            if (entrada.hasNextLine()) {
                System.out.print(entrada.nextLine());
            }
            saida.println(teclado.nextLine());

            //Altura e
            if (entrada.hasNextLine()) {
                System.out.print(entrada.nextLine());
            }
            saida.println(teclado.nextLine());

            //Data de Nascimento (use string nesse campo).
            if (entrada.hasNextLine()) {
                System.out.print(entrada.nextLine());
            }
            saida.println(teclado.nextLine());
        } else if (opcao == 2) {
            System.out.println("Listando Usuários ordenados por nome");
            while (entrada.hasNextLine()) {
                
                System.out.println(entrada.nextLine());
                
            }
        }

        teclado.close();
        saida.close();
        entrada.close();
    }
}
