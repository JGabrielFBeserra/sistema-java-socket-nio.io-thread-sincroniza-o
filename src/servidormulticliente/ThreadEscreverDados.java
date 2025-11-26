/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidormulticliente;

import java.net.Socket;

/**
 *
 * @author cg3034593
 */
public class ThreadEscreverDados extends Thread{
    
    

    public ThreadEscreverDados(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
}
