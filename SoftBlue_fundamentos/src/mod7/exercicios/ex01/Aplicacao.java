package mod7.exercicios.ex01;


public class Aplicacao {

	public static void main(String[] args) {
		
		//�rea da figura
		double area;
		
		/*
		 * O c�digo abaixo usa polimorfismo para referenciar o objeto criado na mem�ria. Isto possibilita
		 * que o c�digo enxergue todos os objetos de uma forma homog�nea, n�o interessando qual o tipo real
		 * do objeto criado na mem�ria (o c�digo referencia apenas um objeto AreaCalculavel).
		 */
		
		//�rea de um quadrado de lado 2
		AreaCalculavel a1 = new Quadrado(2);
		area = a1.calcularArea();
		System.out.println(area);
		
		//�rea de um retr�ngulo de lados 3 e 2
		AreaCalculavel a2 = new Retangulo(3, 2);
		area = a2.calcularArea();
		System.out.println(area);
		
		//�rea de uma circunfer�ncia de raio 3
		AreaCalculavel a3 = new Circunferencia(3);
		area = a3.calcularArea();
		System.out.println(area);
		
	}
}
