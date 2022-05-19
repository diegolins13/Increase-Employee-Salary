package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;

public class AppConta {
	/**
	 *@author: Diego_Lins
	 *@Versão: 1.0
	 *TODO: Cadastro de conta bancaria + opcao de deposito e saque, com exibicação dos dados.
	*/
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta = new Conta();
		
		System.out.println("------------CADASTRO------------");
		System.out.print("Insira o número da conta: ");
		conta.numeroConta(sc.nextInt());
		sc.nextLine();
		System.out.print("Insira o titular da conta: ");
		conta.setNome(sc.nextLine());
		System.out.print("Deseja inserir um deposito inicial (s/n)? ");
		char opcao = sc.next().charAt(0);
		
		if (opcao == 's') {
			System.out.print("Insira o valor do deposito inicial: ");
			conta.deposito(sc.nextDouble());
		}
		System.out.println("");
		
		System.out.println("---------Dados da conta---------");
		System.out.println(conta.toString());
		
		System.out.println("");
		System.out.println("------------DEPOSITO------------");
		System.out.print("Insira o valor do deposito: ");
		conta.deposito(sc.nextDouble());
		System.out.println("Dados atualizados da conta:");
		System.out.println(conta.toString());
		
		System.out.println("");
		System.out.println("-------------SAQUE-------------");
		System.out.print("Insira um valor de saque: ");
		conta.saque(sc.nextDouble());
		System.out.println("Dados atualizados da conta:");
		System.out.println(conta.toString());		
		
		sc.close();
	}
}
