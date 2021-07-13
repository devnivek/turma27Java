package objetos;

public class Conta {
	
	private int numero;
	private double saldo;
	private double limite;
	
	public Conta(int numero, double saldo, double limite) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void sacar(double valor) {
		if(valor <= 0) {
			System.out.println("\nOpera��o inv�lida!");
		}
		else if(valor > this.saldo) {
			System.out.println("\nSaldo insuficiente para esta opera��o!");
		} else {
			this.saldo -= valor;
		}
	}
	
	public void depositar(double valor) {
		if(valor <= 0) {
			System.out.println("\nOpera��o inv�lida!");
		} else {
			this.saldo += valor;
		}
	}
	
	public void exibeExtrato() {
		System.out.printf("\nConta N� %d - Saldo atual: %.2f",this.numero,this.saldo);
	}

}
