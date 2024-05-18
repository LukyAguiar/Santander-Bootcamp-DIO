package Main;

public class Usuario {
	
	private int numero;
	private String agencia;
	private String nomeCliente;
	private Double saldo;
	
	public int getNumero() {
		return this.numero;
	}
	
	public String getAgencia() {
		return this.agencia;
	}
	
	public String getNomeCliente(){
		return this.nomeCliente;
	}
	
	public Double getSaldo() {
		return this.saldo;
	}
	
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
}
