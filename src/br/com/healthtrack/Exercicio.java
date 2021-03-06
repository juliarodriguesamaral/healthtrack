package br.com.healthtrack;

/**
 * 
 * @author Matheus Nascimento
 *
 */
public class Exercicio {
	
	/**
	 * Nome do exercicio 
	 */
	private String nome;
	
	/**
	 * Tempo do exercicio
	 */
	private double tempo;
	
	/**
	 * Intensidade do exercicio
	 */
	private Intensidade intensidade;
	
	/**
	 * Calorias perdidas no exercicio
	 * caso n?o precise de calculo
	 */
	private double caloriasPerdidas;
	
	/**
	 * Tipo do exercicio
	 */
	private TipoExercicio tipoExercicio;
	
	public Exercicio() {
	}
	
	public Exercicio(String nome, double tempo, Intensidade intensidade, double caloriasPerdidas,
			TipoExercicio tipoExercicio) {
		super();
		this.nome = nome;
		this.tempo = tempo;
		this.intensidade = intensidade;
		this.caloriasPerdidas = caloriasPerdidas;
		this.tipoExercicio = tipoExercicio;
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

	public TipoExercicio getTipoExercicio() {
		return tipoExercicio;
	}

	public void setTipoExercicio(TipoExercicio tipoExercicio) {
		this.tipoExercicio = tipoExercicio;
	}

	/**
	 * 
	 * @param usuario
	 * @return numero de calorias perdidas
	 */
	public double calcularCaloriasPerdidas(Usuario usuario) {
		if (this.tipoExercicio == TipoExercicio.CAMINHADA) {
			return (8 * usuario.getPeso() * 0.0175) * this.tempo;
		}else if (this.tipoExercicio == TipoExercicio.NATACAO){
			return 8 * usuario.getPeso() * this.tempo/60;
		}else if (this.tipoExercicio == TipoExercicio.MUSCULACAO){
			return 4.5 * usuario.getPeso() * this.tempo/60;
		}else if (this.tipoExercicio == TipoExercicio.CICLISMO){
			return (8 * usuario.getPeso() * 0.0175) * this.tempo;
		}
		return this.caloriasPerdidas;
	}
}
