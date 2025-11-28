/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidormulticliente;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cg3034593
 */
public class ThreadListarDados extends Thread {

    Socket cliente;

    public ThreadListarDados(Socket cliente) {
        this.cliente = cliente;
    }

    public synchronized void run() {
        try {
            Scanner entrada = new Scanner(cliente.getInputStream());
            PrintStream saida = new PrintStream(cliente.getOutputStream());
            Scanner teclado = new Scanner(System.in);


            Leitor leitor = new Leitor();

            ArrayList<Pessoa> bd = leitor.ler();

            for (Pessoa pessoa : bd) {
                saida.println(pessoa.toString());

            }

        } catch (IOException e) {
            System.err.println("Erro ao listar dados do arquivo: " + e.getMessage());
        }
    }
}
