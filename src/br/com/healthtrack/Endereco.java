package br.com.healthtrack;

public class Endereco {

    private String bairro;
    private String cidade;
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

    public void atualizar(String bairro, String cidade, String estado){
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

}
