package introducao;
import java.util.Scanner;
import java.util.Locale;

public class Teste2 {

	public static void main(String[] args) {

		//Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int anoNascimento;
		String nome;
		double salario;
		
		System.out.println("Digite seu nome: ");
		nome = leia.next().toUpperCase();
		System.out.println("Digite o ano de nascimento: ");
		anoNascimento = leia.nextInt();
		System.out.println("Digite seu sal�rio: ");
		salario = leia.nextDouble();
		
		System.out.printf("Ol� %s, voc� tem %d anos e seu sal�rio � %.2f Reais.",nome,(2021-anoNascimento),salario);
	}

}
