/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidormulticliente;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadLerDados extends Thread {

    Socket cliente;

    public ThreadLerDados(Socket cliente) {
        this.cliente = cliente;
    }

    public void run() {

        try {

            Scanner entrada = new Scanner(cliente.getInputStream());
            PrintStream saida = new PrintStream(cliente.getOutputStream());
            Scanner teclado = new Scanner(System.in);

            String nome = "", endereco = "", cpf = "", idade = "", altura = "", nascimento = "";

            saida.println("Informe o Nome da pessoa: ");
            if (entrada.hasNextLine()) {
                nome = entrada.nextLine();
            }

            saida.println("Informe o Endereco da pessoa: ");
            if (entrada.hasNextLine()) {
                endereco = entrada.nextLine();
            }

            saida.println("Informe o CPF da pessoa: ");
            if (entrada.hasNextLine()) {
                cpf = entrada.nextLine();
            }

            saida.println("Informe a Idade da pessoa: ");
            if (entrada.hasNextLine()) {
                idade = entrada.nextLine();
            }

            saida.println("Informe a Altura da pessoa: ");
            if (entrada.hasNextLine()) {
                altura = entrada.nextLine();
            }

            saida.println("Informe a Data de Nascimento da pessoa: ");
            if (entrada.hasNextLine()) {
                nascimento = entrada.nextLine();
            }
            
            Pessoa pessoa = new Pessoa(nome, endereco, cpf, idade, altura, nascimento);
        
            
            ThreadEscreverDados tec = new ThreadEscreverDados(pessoa);
            tec.start();

            

            teclado.close();
            entrada.close();
            saida.close();

        } catch (IOException ex) {
            Logger.getLogger(ThreadLerDados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
