
public interface Iconta {
	
	public void sacar(double valor) ; //Obs: o public é desnecessário mas deixei para reforçar

	public void depositar(double valor);
	
	public void transferir(double valor, Conta contaDestino);

	void imprimirExtrato();

}
