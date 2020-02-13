package controller;

import util.Teclado;

public class Trator {


public static void main(String[] args) {
	//Leitura de texto
	int cavalos;
	cavalos = Teclado.lerInt ("Digite a quantidade de Cavalos: ");
	if (cavalos < 100) {
		System.out.println (" avaliacao_cavalos "  +  ( "FRACA" ));
	} else {
		System.out.println (" avaliacao_cavalos "  +  ( "FORTE" ));
		
	}
	
	//Leitura de inteiro
	int ano;
	ano = Teclado.lerInt ("Digite o ano: ");
	System.out.println ("Ano informado : " + ano);
	
	//Leitura de Ponto Flutuante
	int quilometragem;
	quilometragem = Teclado.lerInt("Digite a quilometragem: ");
	System.out.println ("Quilometragem informada : " + quilometragem);
				}






}


