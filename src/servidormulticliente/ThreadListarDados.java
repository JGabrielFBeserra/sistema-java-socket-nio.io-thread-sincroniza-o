/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidormulticliente;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author cg3034593
 */
public class ThreadListarDados extends Thread {
    
    

    public synchronized void run() {
        try {
            Path arquivo = Paths.get("relatorio_pessoas.txt");
            if (Files.exists(arquivo)) {
                System.out.println("O arquivo já existe. Nenhuma ação será realizada.");

            } else {
                Files.createFile(arquivo);
            }
            
            Leitor leitor = new Leitor();
            
            leitor.ler();

        } catch (IOException e) {
            System.err.println("Erro ao criar diretórios ou arquivo: " + e.getMessage());
        }
    }
}
