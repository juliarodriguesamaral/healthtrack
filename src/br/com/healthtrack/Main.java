package br.com.healthtrack;

public class Main {

    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Lúcia Pevensie", 21, 1.70F,65.0F,"luciapevensie@email.com","123", new Endereco("Jardim Bonito", "Nárnia", "Fim do Mundo"));
        Usuario usuario2 = new Usuario("Alvo Dumbledore", 100, 1.80F,85.0F,"alvodumbledore@email.com","123456", new Endereco("Lago da Coruja", "Hogwarts", "Castelo"));

        System.out.println(usuario1);
        System.out.println(usuario2);

    }
}
