package mod5.records;

public record Quadrado(double lado) {

	public double calcularArea() {
		return lado * lado;
	}
}
