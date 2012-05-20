package conta.model;

public class Conta {

	private String titular;
	private String numero;
	private double saldo;
	private String dataDeAbertura;
	
	public String getDataDeAbertura() {
		return dataDeAbertura;
	}

	public Conta(String titular, String conta, double saldo, String data)
	{
		this.titular = titular;
		this.numero = conta;
		this.saldo = saldo;
		dataDeAbertura = data;
		
	}

	public String getTitular() {
		return titular;
	}

	public String getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
}
