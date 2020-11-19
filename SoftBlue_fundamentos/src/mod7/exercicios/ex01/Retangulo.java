package mod7.exercicios.ex01;


public class Retangulo implements AreaCalculavel {

	//base e altura do ret�ngulo
	private double base;
	private double altura;
	
	//construtor
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	//c�lculo da �rea do ret�ngulo
	public double calcularArea() {
		return base * altura;
	}

}
