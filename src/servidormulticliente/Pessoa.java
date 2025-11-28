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
    private String endereco;
    private String cpf;
    private int idade;
    private float altura;
    private String nascimento;

    public Pessoa(String nome, String endereco, String cpf, int idade, float altura, String nascimento) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.idade = idade;
        this.altura = altura;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }

    public String getNascimento() {
        return nascimento;
    }

    public int compareTo(Pessoa outraPessoa) {

        // ordenação por nome (usando a implementação do compareTo dos Strings)
        if (this.nome.compareTo(outraPessoa.nome) > 0) {
            return 1;
        }
        if (this.nome.compareTo(outraPessoa.nome) < 0) {
            return -1;
        }
        return 0;

    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", endereco=" + endereco + ", cpf=" + cpf + ", idade=" + idade + ", altura=" + altura + ", nascimento=" + nascimento + '}';
    }
    
    

}
