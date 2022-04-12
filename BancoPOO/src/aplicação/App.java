package aplica��o;

import modelagem.Conta;

import java.util.Scanner; //Biblioteca do Scanner

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Fun��o scan do java.util.Scanner
		
		//Declara��o das vari�veis
		String n = "40028922";
		String ag = "324-15";
		String dgt = "8";
		double sld = 100; //Saldo inicial
		
		System.out.println("Informe o nome do cliente: ");
		String clt = scan.next(); //Escaneia a primeira palavra/primeiro nome
		clt += scan.nextLine(); //Escaneia o resto da linha
		
		//Cria uma nova conta com as informa��es declaradas anteriormente
		Conta conta = new Conta(n, ag, dgt, clt, sld);
		
		System.out.println("====== Conta criado! ======");
		System.out.println("N�mero: " + conta.getNumero());
		System.out.println("Ag�ncia: " + conta.getAgencia());
		System.out.println("Digito: " + conta.getDigito());
		System.out.println("Cliente: " + conta.getCliente());
		System.out.println("Saldo: " + conta.getSaldo());
		System.out.println("==================================");
		
		while(true) {
			System.out.println("Selecione uma das op��es: \n" + "(1- saldo, 2- dep�sito, 3- saque, 4- sair): ");
			int escolha = scan.nextInt();
			
			if(escolha == 1) { //SALDO
				System.out.println("Saldo atual: " + sld + "\n");
			} else {
				
				if(escolha == 2) { //DEP�SITO
					System.out.println("Insira o valor de dep�sito: ");
					sld += scan.nextDouble(); //Adicionar� ao saldo o valor inserido
					System.out.println("Saldo atual: " + sld + "\n");
				} else {
					
					if(escolha == 3) { //SAQUE
						System.out.println("Insira o valor de saque: ");
						double valor = scan.nextDouble(); //Armazena o valor inserido
						if(valor <= sld) { //Se o valor condizer com o saldo, o saque ser� feito
							sld = sld - valor; //Retira do saldo o valor inserido
							System.out.println("Saldo atual: " + sld + "\n");
						} else { //Se n�o houver saldo, n�o ser� feito o saque
							System.out.println("SALDO INSUFICIENTE!\n");
						}
					} else {
						
						if(escolha == 4) { //SA�DA
							System.out.println("Obrigado por usar nosso servi�o. Volte sempre!");
							break;
						} else {
							System.out.println("ERRO! Digite uma op��o v�lida!\n");
						}
					}
				}
			}
		}
	}
}