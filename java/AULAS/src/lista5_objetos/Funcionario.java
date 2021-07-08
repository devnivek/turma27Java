package lista5_objetos;

import java.util.Random;

public class Funcionario {
	
	Random gerador = new Random();

	public String nome;
	public String codigo;
	public double valorHora;
	public int horasTrabalhadas;
	
	public double calculaSalario() {
		double salario = valorHora*horasTrabalhadas;
		return salario;
	}
	
	public String geraCodigo() {
		codigo  = "000"+gerador.nextInt(100);
		return codigo;
	}
	
	public void exibeDados() {
		System.out.println("-----------------------------------------");
		System.out.println("Funcion�rio: "+nome+" - C�digo: "+geraCodigo());
		System.out.println("Valor por hora: "+valorHora+" reais.");
		System.out.println("Horas trabalhadas nesse m�s: "+horasTrabalhadas+" horas");
		System.out.println("-----------------------------------------");
	}
}
