package mod7.exercicios.ex03;

public class Porta implements Cloneable {
	// Altura
	private double altura;
	
	// Largura
	private double largura;
	
	// Porta aberta?
	private boolean aberta;
	
	// Construtor que recebe a altura e largura da porta
	public Porta(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
		
		// Inicialmente a porta est� fechada
		this.aberta = false;
	}
	
	// Abre a porta
	public void abrir() {
		aberta = true;
	}
	
	// Fecha a porta
	public void fechar() {
		aberta = false;
	}

	// Getter da altura
	public double getAltura() {
		return altura;
	}

	// Getter da largura
	public double getLargura() {
		return largura;
	}

	// Getter de 'aberta'
	public boolean isAberta() {
		return aberta;
	}

	/*
	 * O m�todo clone() � declarado na classe Object. Ele � sobrescrito pelas classes que desejam criar
	 * c�pias de objetos da pr�pria classe. S� � poss�vel utiliz�-lo se a classe implementar a interface 
	 * Cloneable.
	 */
	public Object clone() throws CloneNotSupportedException {
		// Cria um novo objeto e copia os valores dos atributos para este novo objeto
		Porta p = new Porta(this.altura, this.largura);
		p.aberta = this.aberta;
		
		// Retorna o novo objeto, que � uma c�pia do objeto anterior
		return p;
	}
}
