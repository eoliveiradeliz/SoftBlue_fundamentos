package mod7.exercicios.ex02;

// Classe que representa uma conta corrente
public class ContaCorrente extends ContaBancaria {

	// Implementa o c�lculo do saldo, diminuindo 10% do saldo real (impostos)
	public double calcularSaldo() {	
		return saldo - (saldo * 0.1);
	}

}
