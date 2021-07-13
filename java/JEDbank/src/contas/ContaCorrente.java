package contas;

import java.util.Scanner;

public class ContaCorrente {
	
	Scanner leia = new Scanner(System.in);

	int contadorTalao = 0;
	double tarifaTalao = 0.0, saldoCorrente=0.0;
			
	//iniciando movimenta��o da conta
	int contadorOperacao=0;
	char op;

	for (int i=0; i<10; i++){
		//limpa()
		//cabecalho()
		System.out.println("                        CONTA CORRENTE\n");
		System.out.println("\n");
		//exibindo menu de movimenta��o
		System.out.println("SALDO ATUAL: "+saldoCorrente+" REAIS\n");
		System.out.println("-----------------------------------------------------------\n");
		System.out.println("D - DEBITO\nC - CREDITO\nS - SAIR\n");
		//escolhendo a op��o debito ou credito
		System.out.println("\n"+(contadorOperacao+1)+"� MOVIMENTA��O (M�XIMO DI�RIO PERMITIDO = 10)")
		System.out.println("\n===========================================================");
		System.out.println("\nDIGITE A OPERA��O QUE DESEJA REALIZAR (D, C ou S): ");
		op = leia.next().charAt(0);
		System.out.println("\n");
		         
		double valor = 0.0;
		//debitando da conta
		if(tipoOperacao == 'D' || tipoOperacao == 'd'){
			//alertando que a conta n�o possui dinheiro para saque
			if(saldoCorrente <= 0){
				System.out.println("VOC� N�O POSSUI SALDO PARA SAQUE! AGUARDE...\n");
				contadorOperacao++;
			} else {
				System.out.println("INSIRA O VALOR QUE DESEJA RETIRAR DA CONTA: ");
			    valor = leia.nextDouble();
			    //verificando se o valor de saque n�o � maior que o saldo
			    if(valor > saldoCorrente){
			    	System.out.println("VOC� N�O TEM SALDO SUFICIENTE PARA ESTE SAQUE! AGUARDE...\n");
			        contadorOperacao++;
			    } else {
				    saldoCorrente -= valor;
				    contadorOperacao++;
			    }
			}
		}
		//adicionando dinheiro na conta
		if(tipoOperacao == 'C' || tipoOperacao == 'c'){
			System.out.println("INSIRA O VALOR QUE DESEJA ADICIONAR NA CONTA: ");
		    valor = leia.nextDouble();
		    saldoCorrente += valor;
		    contadorOperacao++;
		}
		if(tipoOperacao == 'S' || tipoOperacao == 's'){
			contadorOperacao = 10;
		}	
	}
	
	//limpando tela e exibindo o cabe�alho
	     	//limpa()
	     	cabecalho()
	     	escreva("           CONTA CORRENTE  N�: "+numeroConta+" AG�NCIA: "+agencia+"\n")
	     	//verificando se possui saldo suficiente para solicitar cheque
	     	se(saldoAtual<30.0){
	     		escreva("SALDO ATUAL: "+saldoAtual+" REAIS\n")
				escreva("-----------------------------------------------------------\n")
	     		escreva("\nDESCULPE, VOC� N�O TEM SALDO SUFICIENTE PARA SOLICITAR CHEQUE\n")
	     		escreva("\nRETORNANDO AO MENU PRINCIPAL...")
			     Util.aguarde(7000)
			     limpa()
			     saldoAtual = 0.0
			     inicio()
	     		
	     	}
			//perguntando se vai querer solicitar cheque
	     	escreva("\nDESEJA SOLICITAR ALGUM CHEQUE?\n")
	     	escreva("1 - SIM OU 2 - N�O: ")
		     leia(opcao)
		     //verificando se o numero digitado est� dentro do menu
			enquanto(opcao < 1 ou opcao > 2){                      	
		          escreva("DIGITE UMA OP��O VALIDA (1-3): ")
		          leia(opcao)        	 	
		     }  
			//solicitando a quantidade de cheques desejada
		     se(opcao == 1){
		     	escreva("\nSALDO ATUAL: "+saldoAtual+" REAIS | TARIFA POR TAL�O: 30 REAIS")
		     	escreva("\n=======================================================")
		     	escreva("\nQUANTOS CHEQUES DESEJA SOLICITAR? (M�XIMO 3): ")
			     leia(contadorTalao)
			     //efetuando valida��es
			     inteiro valida=0
			     faca{ 
			     	//verificando se a quantidade digitada est� dentro do limite
			     	enquanto(contadorTalao < 1 ou contadorTalao > 3){    
				          escreva("DIGITE UMA QUANTIDADE VALIDA: ")
				          leia(contadorTalao)   
				     }
				     //efetuando a contagem da tarifa a ser paga
				     tarifaTalao = (30.0*contadorTalao)
				     //verificando se o saldo atual permite essa opera��o
			          se(tarifaTalao > saldoAtual){    
			          	escreva("VOC� N�O TEM SALDO SUFICIENTE PARA ESSA QUANTIDADE!\n")
			          	//reiniciando a valida��o
			          	valida=0
			          	contadorTalao = 0
			          } senao {
			          	//debitando a tarifa do saldo da conta
			          	saldoAtual -= tarifaTalao 
			          	escreva("=======================================================\n")
		         			escreva("\nFORAM DEBITADOS "+(30.0*contadorTalao)+" REAIS PELA TARIFA DE "+contadorTalao+" TAL�O(ES)\nSEU SALDO ATUAL FICOU: "+saldoAtual+" REAIS.\n")
		         			//saindo da valida��o
		         			valida=1
		     		}
		     	} enquanto (valida==0)
		     }
		     //saindo da fun��o conta corrente e voltando ao inicio
		     escreva("\nRETORNANDO AO MENU PRINCIPAL...")
		     Util.aguarde(10000)
		     limpa()
		     saldoAtual = 0.0
		     inicio()
}
