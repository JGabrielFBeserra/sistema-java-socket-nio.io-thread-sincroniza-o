/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidormulticliente;

/**
 *
 * @author cg3034593
 */
public class Pessoa {
    private String nome;
    private String email;
    private String cpf;
    private String idade;
    private String altura;
    private String nascimento;

    public Pessoa(String nome, String email, String cpf, String idade, String altura, String nascimento) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.idade = idade;
        this.altura = altura;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getIdade() {
        return idade;
    }

    public String getAltura() {
        return altura;
    }

    public String getNascimento() {
        return nascimento;
    }
    
}
