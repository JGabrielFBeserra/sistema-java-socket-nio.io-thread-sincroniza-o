/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidormulticliente;

import java.util.Scanner;

public class ThreadLerDados extends Thread {

    Scanner entrada;

    public ThreadLerDados(Scanner entrada) {
        this.entrada = entrada;
    }

    @Override
    public void run() {
        while (entrada.hasNextLine()) {
            String mensagem = entrada.nextLine();
            System.out.println(">> " + mensagem);
        }
    }
}
