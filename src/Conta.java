
public abstract class Conta implements IConta {
	
	private int agencia;
	private int numero;
	private double saldo;
	
	@Override
	public void sacar(Double valor) {
	}

	@Override
	public void depositar(Double valor) {
	}

	@Override
	public void transferir(Double valor, Conta contaDestino) {
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

}
