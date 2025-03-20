package PortalAluno;

import java.util.Scanner;

public class Painel {
	
	Scanner s= new Scanner(System.in);
	public void validarNotas() {


			System.out.println("Nota 1");
			double num1= s.nextDouble();
			System.out.println("Nota 2");
			double num2= s.nextDouble();
			System.out.println("Nota 3");
			double num3 = s.nextDouble();
			System.out.println("Nota 4");
			double num4= s.nextDouble();
			double result= (num1+num2+num3+num4)/4;
			validarMedia(result);

	
}
	private void validarMedia(double result) {
		
		if(result>=0 && result <=10) {
			if(result>=7 && result<=10) {
				System.out.println("Media do Aluno:"+result);
				System.out.println("Aprovado");
			}
			if(result<7 && result>5) {
				System.out.println("Media do Aluno:"+result);
				System.out.println("Aluno de recuperação");
				
			}
			if(result>=0 && result<5) {
				System.out.println("Media do Aluno:"+result);
				System.out.println("Reprovado");
				
			}
		}
		else {
			
			System.out.println("Notas inseridas com incongruencias");
		}
	}
}
