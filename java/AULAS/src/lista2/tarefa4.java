package lista2;
import java.util.Scanner;

public class tarefa4 {

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
			System.out.printf("A raiz quadrada de %d � %.2f",num,Math.sqrt(num));
		} else {
			System.out.println("O n�mero "+num+" � �mpar");
			System.out.println("O n�mero "+num+" ao quadrado � "+Math.pow(num,2));
		}
		leia.close();
	}

}