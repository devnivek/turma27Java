package lista1;

import java.util.Scanner;

public class novo {

	public static void main(String[] args) {
		
		int num;
		Scanner leia = new Scanner(System.in);

		System.out.println("digite um n�mero:");
		num = leia.nextInt();
		
		if (num<0){
			System.out.println("O n�mero "+num+" � negativo, ");
		}
		
		if (num==0){
			System.out.println("O n�mero "+num+" � neutro");
		}

		if ((num%2)==0){
			System.out.println("O n�mero "+num+" � par");
		} else {
			System.out.println("O n�mero "+num+" � �mpar");
		}
		leia.close();
	}

}
