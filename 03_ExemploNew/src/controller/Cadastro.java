package controller;

import model.Usuario;
public class Cadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario user = new Usuario();
		user.nome = "Kaíque Vargas";
		user.endereco = "Rua Caldas Barbosa Vargas";
		user.idade = 18;
		System.out.println(user.nome);
		System.out.println(user.endereco);
		System.out.println(user.idade);
	
	}

}
