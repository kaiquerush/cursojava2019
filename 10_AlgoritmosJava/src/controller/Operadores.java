package controller;
import util.Teclado;
public class Operadores {

	public static void main(String[] args) {
		//Leitura de texto
		
		 Teclado.lerTexto ("Digite seu nome: ");
		
		//Leitura de inteiro
		
		int b1;
		 b1= Teclado.lerInt (" Nota do 1� bimestre: ");
		 
		int b2;
		b2= Teclado.lerInt (" Nota do 2� bimestre: ");
		
		int b3;
		b3= Teclado.lerInt (" Nota do 3� bimestre: ");
		
		int b4;
	 b4= Teclado.lerInt (" Nota do 4� bimestre: ");
		
		int media;
		media=(b1+b2+b3+b4)/4;
		
	
		
		System.out.println ("m�dia do aluno �:" + media);
	
		
		if (media>=6) { 
			System.out.println("Voc� foi aprovado");
			
		} else {
			System.out.println ("Voc� foi reprovado");
			
				
			}
		}
	
	}



