package application;

import entities.Funcionario;
import entities.Terceiro;

public class TesteCad {

	public static void main(String[] args) {

		Funcionario func1 = new Funcionario("X1",70,13.7);
		Terceiro func2 = new Terceiro("X9",70,13.7,41);
		
		System.out.println("FUNCION�RIO 1");
		System.out.println("Matr�cula:"+func1.getMatricula());
		System.out.println("Sal�rio:"+func1.salario());
		
		System.out.println("\nFUNCION�RIO 2");
		System.out.println("Matr�cula:"+func2.getMatricula());
		System.out.println("Sal�rio:"+func2.salario());

	}

}
