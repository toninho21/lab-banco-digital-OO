
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato(TipoConta tc) {
		System.out.println("=== Extrato Conta " + tc + "===");
		super.imprimirInfosComuns();
	}
}
