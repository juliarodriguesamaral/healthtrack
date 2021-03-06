package br.com.healthtrack;

/**
 * @author Julia Amaral
 * @author Matheus Nascimento
 *
 */
public class Main {

    public static void main(String[] args) {
	
        Usuario usuario1 = new Usuario("Lúcia Pevensie", 21, 1.70F,65.0F,"luciapevensie@email.com","123", new Endereco("Jardim Bonito", "Nárnia", "Fim do Mundo"));
        Usuario usuario2 = new Usuario("Alvo Dumbledore", 100, 1.80F,85.0F,"alvodumbledore@email.com","123456", new Endereco("Lago da Coruja", "Hogwarts", "Castelo"));

        System.out.println(usuario1);
        System.out.println(usuario2);

        Exercicio exercicio1 = new Exercicio("caminhada", 50, Intensidade.MODERADA, 0, TipoExercicio.CAMINHADA);
    	System.out.println(exercicio1.calcularCaloriasPerdidas(usuario1));
    	
    	Exercicio exercicio2 = new Exercicio("natacao", 50, Intensidade.MODERADA, 0, TipoExercicio.NATACAO);
    	System.out.println(exercicio2.calcularCaloriasPerdidas(usuario1));
    	
    	Exercicio exercicio3 = new Exercicio("muscula??o", 50, Intensidade.MODERADA, 0, TipoExercicio.MUSCULACAO);
    	System.out.println(exercicio3.calcularCaloriasPerdidas(usuario2));
    }
}
