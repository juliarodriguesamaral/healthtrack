package br.com.healthtrack;

public class Usuario {

    private String nome;
    private int idade;
    private float altura;
    private float peso;
    private String email;
    private String senha;
    private Endereco endereco;
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

    public void atualizarInformacoes(String email, String senha, String bairro, String cidade, String estado){

        this.email = email;
        this.senha = senha;
        this.endereco.atualizar(bairro, cidade, estado);

    }

     public void atualizarPesoAltura(float peso, float altura) {
        this.peso = peso;
        this.altura= altura;
        this.imc.calcular(this.peso, this.altura);
     }
}
