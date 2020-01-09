package controller;
import util.Teclado;
public class Operadores {

	public static void main(String[] args) {
		//Leitura de texto
		
		 Teclado.lerTexto ("Digite seu nome: ");
		
		//Leitura de inteiro
		
		int b1;
		 b1= Teclado.lerInt (" Nota do 1º bimestre: ");
		 
		int b2;
		b2= Teclado.lerInt (" Nota do 2º bimestre: ");
		
		int b3;
		b3= Teclado.lerInt (" Nota do 3° bimestre: ");
		
		int b4;
	 b4= Teclado.lerInt (" Nota do 4° bimestre: ");
		
		int media;
		media=(b1+b2+b3+b4)/4;
		
	
		
		System.out.println ("média do aluno é:" + media);
	
		
		if (media>=6) { 
			System.out.println("Você foi aprovado");
			
		} else {
			System.out.println ("Você foi reprovado");
			
				
			}
		}
	
	}



