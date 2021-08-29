package br.com.healthtrack;

/**
 * Classe que fornece o endereço para a classe Usuário
 * @author julia
 * @version 1.0
 */


public class Endereco {

    /**
     * Bairro onde o usuário reside
     */
    private String bairro;
    /**
     * Cidade onde o usuário reside
     */
    private String cidade;
    /**
     * Estado onde o usuário reside
     */
    private String estado;

    public Endereco(String bairro, String cidade, String estado) {
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }

    /**
     * Atualiza os dados de residência do usuário
     * @param bairro
     * @param cidade
     * @param estado
     */
    public void atualizar(String bairro, String cidade, String estado){
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

}
