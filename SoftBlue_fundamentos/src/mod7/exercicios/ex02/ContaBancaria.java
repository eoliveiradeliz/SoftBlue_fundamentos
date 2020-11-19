package mod7.exercicios.ex02;

// Classe que representa uma conta banc�ria gen�rica. Por ser abstrata, n�o pode ser instanciada
public abstract class ContaBancaria {

	// Saldo da conta
	protected double saldo;
	
	// Deposita determinado valor na conta
	public void depositar(double valor) {
		saldo += valor;
	}
	
	// Saca determinado valor da conta
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	// Transfere determinado valor para outra conta
	public void transferir(double valor, ContaBancaria conta) {
		sacar(valor);
		conta.depositar(valor);
	}
	
	// Calcula o saldo final, que pode sofrer varia��o do valor armazenado no atributo
	// 'saldo'. Cada subclasse deve implementar este m�todo de acordo com suas regras de c�lculo
	public abstract double calcularSaldo();
}
