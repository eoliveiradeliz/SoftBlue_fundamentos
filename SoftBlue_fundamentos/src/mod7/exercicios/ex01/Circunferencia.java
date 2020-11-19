package mod7.exercicios.ex01;


public class Circunferencia implements AreaCalculavel {

	//raio da circunfer�ncia
	private double raio;

	//construtor
	public Circunferencia(double raio) {
		this.raio = raio;
	}
	
	//c�lculo da �rea da circunfer�ncia
	public double calcularArea() {
		return Math.PI * raio * raio;
	}
}
