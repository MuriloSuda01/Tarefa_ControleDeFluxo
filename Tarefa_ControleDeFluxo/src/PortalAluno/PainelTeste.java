package PortalAluno;

import java.util.Scanner;

public class PainelTeste {
	public static void main(String[]args) {
		
		Painel painel = new Painel();
		Scanner s  =new Scanner(System.in);
		System.out.println("1- Validar Nota 2- Sair");
		int opcao = s.nextInt();
		switch(opcao) {
		case 1:
			painel.validarNotas();
			break;
		case 2:
			System.out.println("Aplicação encerrada");
			break;
		}
		

		
	}

}
