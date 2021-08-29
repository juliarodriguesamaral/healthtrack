package br.com.healthtrack;

public class TipoExercicio implements Exercicio{
	
	private String nome;
	private double tempo;
	private Intensidade intensidade;
	private double caloriasPerdidas;
	
	public TipoExercicio() {
	}
	
	public TipoExercicio(String nome, double tempo, Intensidade intensidade, double caloriasPerdidas) {
		super();
		this.nome = nome;
		this.tempo = tempo;
		this.intensidade = intensidade;
		this.caloriasPerdidas = caloriasPerdidas;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getTempo() {
		return tempo;
	}
	public void setTempo(double tempo) {
		this.tempo = tempo;
	}
	public Intensidade getIntensidade() {
		return intensidade;
	}
	public void setIntensidade(Intensidade intensidade) {
		this.intensidade = intensidade;
	}
	public double getCaloriasPerdidas() {
		return caloriasPerdidas;
	}
	public void setCaloriasPerdidas(double caloriasPerdidas) {
		this.caloriasPerdidas = caloriasPerdidas;
	}

	@Override
	public double calcularCalorias(double caloriaAtual) {
		return caloriaAtual - this.caloriasPerdidas;
	}
	
}
