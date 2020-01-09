package controller;
import model.Carro;

public class Cadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro carro01 = new Carro();
		carro01.modelo = "Jeep Renagade";
		carro01.fabricante = "Jeep";
		carro01.cor = "cinza";
		carro01.ano = 2018;
		
		
		Carro carro02 = new Carro();
		carro02.modelo = "Argo";
		carro02.fabricante = "Fiat";
		carro02.cor = "branco";
		carro02.ano = 2018;
		
		
		Carro carro03 = new Carro();
		carro03.modelo = "Uno";
		carro03.fabricante = "Fiat";
		carro03.cor = "cinza";
		carro03.ano = 2014;
		
		
		System.out.println("Modelo:" +carro01.modelo);
		System.out.println("Modelo:" +carro02.modelo);
		System.out.println("Modelo:" +carro03.modelo);
		System.out.println("Modelo:" +carro03.modelo);
	
		
	
		
		
		

	}

}
