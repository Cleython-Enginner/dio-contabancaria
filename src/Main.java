
public class Main {

	public static void main(String[] args) {
		Cliente clara = new Cliente();
		clara.setNome("Clara Kaylane");

		Conta cc = new ContaCorrente(clara);
		Conta digital = new ContaDigital(clara);

		cc.depositar(300);
		cc.transferir(100, digital);

		cc.imprimirExtrato();
		digital.imprimirExtrato();

		Cliente cleython = new Cliente();
		cleython.setNome("Cleython Venceslau");

		Conta universitaria = new ContaUniversitaria(cleython);
		Conta poupanca = new ContaPoupanca(cleython);

		universitaria.depositar(1000);
		universitaria.transferir(350, poupanca);

		universitaria.imprimirExtrato();
		poupanca.imprimirExtrato();

	}
}
