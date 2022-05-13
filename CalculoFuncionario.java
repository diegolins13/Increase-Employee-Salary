package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.ClasseFuncionario;

public class CalculoFuncionario {
	/**
	 *@author: Diego_Lins
	 *@Vers�o: 1.0
	 *TODO: Cadastra funcionarios, acrescenta porcentagem no salario e exibe dados atualizados..
	*/
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<ClasseFuncionario> list = new ArrayList<>();
		
		System.out.print("Quantos funcion�rios ser�o registrados? ");
		int quantidade = sc.nextInt();
		
		for(int i=1; i<=quantidade; i++) {
			System.out.println();
			System.out.println("Funcionario #" + i + ":");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list,id)) {
				System.out.print("Id j� registrado. Tente novamente: ");
				id =sc.nextInt();
			}
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			list.add(new ClasseFuncionario(id, nome, salario));
		}
		System.out.println();
		System.out.print("Insira a id do funcion�rio que ter� aumento de sal�rio: ");
		int id = sc.nextInt();
		ClasseFuncionario funcionario = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(funcionario == null) {
			System.out.println("Este Id n�o existe!");
		}
		else {
			System.out.print("Digite a porcentagem: ");
			double porcentagem = sc.nextDouble();
			funcionario.aumentarSalario(porcentagem);
		}
		System.out.println();
		System.out.println("Lista de funcionarios: ");
		for(ClasseFuncionario obj : list) {
			System.out.println(obj);
		}
		sc.close();
	}
	public static boolean hasId(List<ClasseFuncionario> list, int id) {
		ClasseFuncionario funcionario = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return funcionario != null;
	}
}