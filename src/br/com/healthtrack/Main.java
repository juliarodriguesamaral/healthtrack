package br.com.healthtrack;

public class Main {

    public static void main(String[] args) {
	
    	Exercicio exercicio1 = new Exercicio("caminhada", 50, Intensidade.MODERADA, 0, TipoExercicio.CAMINHADA);
    	System.out.println(exercicio1.calcularCalorias(70, 1.90));
    	
    	Exercicio exercicio2 = new Exercicio("natacao", 50, Intensidade.MODERADA, 0, TipoExercicio.NATACAO);
    	System.out.println(exercicio2.calcularCalorias(70, 1.90));
    	
    	Exercicio exercicio3 = new Exercicio("musculação", 50, Intensidade.MODERADA, 0, TipoExercicio.MUSCULACAO);
    	System.out.println(exercicio3.calcularCalorias(80, 1.90));
    }
}
