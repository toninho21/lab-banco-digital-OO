
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato(TipoConta tc) {
		System.out.println("=== Extrato Conta " + tc + "===");
		super.imprimirInfosComuns();
	}
}
