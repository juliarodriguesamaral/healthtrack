package br.com.healthtrack;

/**
 * Classe que representa o Usuário
 * @author julia
 * @version 1.0
 */

public class Usuario {

    /**
     * Nome do usuário
     */
    private String nome;
    /**
     * Idade do usuário
     */
    private int idade;
    /**
     * Altura do usuário
     */
    private float altura;
    /**
     * Peso do usuário
     */
    private float peso;
    /**
     * E-mail do usuário
     */
    private String email;
    /**
     * Senha do usuário
     */
    private String senha;
    /**
     * Endereço do usuário
     */
    private Endereco endereco;
    /**
     * IMC do usuário
     */
    private IMC imc;

    public Usuario(String nome, int idade, float altura, float peso, String email, String senha, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
        this.imc = new IMC();
        this.imc.calcular(peso, altura);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                ", peso=" + peso +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", endereco=" + endereco +
                ", imc=" + imc +
                '}';
    }

    /**
     * Atualiza dados do usuário
     * @param email
     * @param senha
     * @param bairro
     * @param cidade
     * @param estado
     */
    public void atualizarInformacoes(String email, String senha, String bairro, String cidade, String estado){

        this.email = email;
        this.senha = senha;
        this.endereco.atualizar(bairro, cidade, estado);

    }

    /**
     * Atualiza peso e altura do usuário
     * @param peso
     * @param altura
     */
     public void atualizarPesoAltura(float peso, float altura) {
        this.peso = peso;
        this.altura= altura;
        this.imc.calcular(this.peso, this.altura);
     }
}
