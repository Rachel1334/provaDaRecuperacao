package br.com.senai;
import java.util.Scanner;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		int valor = 0;
		
		Scanner tec = new Scanner(System.in);
		String continuar = "s";
		int opcaoMenu;
	do {
		System.out.println("----MENU----");
		System.out.println("1 - Tabuada");
		System.out.println("2 - Sequencia de valores");
		System.out.println("---------------");
		System.out.println("Informe a opção desejada: ");
		opcaoMenu = tec.nextInt();
		
		switch(opcaoMenu) {
		case 1:
			System.out.println("Tabuada");
			int multiplicador = 0;
	
			System.out.println("Informe um valor: ");
			valor = tec.nextInt();
			do {
				System.out.println(valor + " x " + multiplicador +  " = " + (valor * multiplicador));
				multiplicador++;
			}while(multiplicador <=10);	
			break;
		case 2:			
			System.out.println("Contagem de valores");

			System.out.print("informe o primeiro valor: ");
			int primeiroValor = tec.nextInt();
			System.out.print("informe o segundo valor: ");
			int segundoValor = tec.nextInt();
				if(primeiroValor  > segundoValor) {
					while(segundoValor <= primeiroValor) {
						segundoValor ++;
						System.out.println(segundoValor);
					}
				}else {
					while(primeiroValor <= segundoValor){	
						primeiroValor ++;
						System.out.println(primeiroValor);
					}
				}	
				break;
		default:
			System.out.println("opção invalida.");
			break;
			}	
		System.out.println("Deseja continuar?");;
		continuar = tec.next();
		} while (continuar.equalsIgnoreCase("s"));
		System.out.println("Sistema Finalizado");
}
}
