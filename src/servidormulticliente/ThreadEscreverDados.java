/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidormulticliente;

import java.io.IOException;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 *
 * @author cg3034593
 */
public class ThreadEscreverDados extends Thread{
    
    private Pessoa pessoa;

    public ThreadEscreverDados(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    public synchronized void run() {
        try {
            Path arquivo = Paths.get("relatorio_pessoas.txt");
            if (Files.exists(arquivo)) {
                System.out.println("O arquivo já existe. Nenhuma ação será realizada.");
                
            } else {
                Files.createFile(arquivo);
            }    
            
            String novaLinha = pessoa.getNome() +";"+ pessoa.getEndereco() +";"+ pessoa.getCpf() +";"+ pessoa.getAltura() +";"+ pessoa.getIdade() +";"+ pessoa.getNascimento() +"\n";
            Files.write(arquivo, 
                novaLinha.getBytes(), 
                StandardOpenOption.CREATE, 
                StandardOpenOption.APPEND);
            
            System.out.println("Novo Registro no txt:" + novaLinha);
        } catch (IOException e) {
            System.err.println("Erro ao criar diretórios ou arquivo: " + e.getMessage());
        }
       
    }
    
}
