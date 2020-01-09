package controller;

import model.Pessoa;

public class Cadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa = new Pessoa () ;
		
		pessoa.setNome ("A ppk da minha tia");
		pessoa.setIdade (24);
		pessoa.setSexo ("3 cú safado");
		
		System.out.println ("Nome: " + pessoa.getNome () ) ;
		System.out.println ("Nome: " + pessoa.getIdade () ) ;
		System.out.println ("Sexo: " + pessoa.getSexo () ) ;
		
	}

}
