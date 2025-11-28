/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidormulticliente;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 *
 * @author cg3034593
 */
public class Leitor {

    public static ArrayList<Pessoa> ler() throws FileNotFoundException, IOException {

        String arqLeitura = "relatorio_pessoas.csv";
        ArrayList<Pessoa> bd = new ArrayList<Pessoa>();
        String nome = "", endereco = "", cpf = "", nascimento = "";
        int idade = 0;
        float altura = 0;
        
        
        BufferedReader buffRead = new BufferedReader(new FileReader(arqLeitura, StandardCharsets.ISO_8859_1));

        buffRead.readLine();
        System.out.println("Lendo o arquivo " + arqLeitura);
        String linha = buffRead.readLine();
        while (linha != null) {
            String x[] = linha.split(";");
            // x[0] = nome, x[1] = endereco, x[2] = cpf, x[3] = idade, x[4] = altura, x[5] = nascimento
            try {
                idade = Integer.parseInt(x[3]);

            } catch (NumberFormatException e) {
                System.err.println("Erro: A idade informada não é um número inteiro válido.");
            }
            
            try {
                altura = Float.parseFloat(x[4]);

            } catch (NumberFormatException e) {
                System.err.println("Erro: A idade informada não é um número inteiro válido.");
            }
            Pessoa temp = new Pessoa(x[0], x[1], x[2], idade, altura, x[5]);
            bd.add(temp);
            linha = buffRead.readLine();
        }
        buffRead.close();

        return bd;

    }

}
