
public class Main {

	public static void main(String[] args) {
		Cliente caio = new Cliente();
		caio.setNome("Caio");
		
		ContaCorrente cc = new ContaCorrente(caio);		
		ContaPoupanca poupanca = new ContaPoupanca(caio);
		
		cc.depositar(300.00);
		cc.transferir(100.00, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
