package mod7.exercicios.ex02;

// Classe que representa uma conta investimento
public class ContaInvestimento extends ContaBancaria {

	// Implementa o c�lculo do saldo, aumentando 5% sobre o saldo real (rendimentos)
	public double calcularSaldo() {
		return saldo + (saldo * 0.05);
	}
}
