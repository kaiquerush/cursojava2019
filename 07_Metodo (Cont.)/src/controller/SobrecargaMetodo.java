package controller;

public class SobrecargaMetodo {
	int idade;
	String nome;



	public void cadastrarPessoa (int valor) {
		idade = valor;
		System.out.println("Idade: "+idade);
}

	public void cadastrarPessoa(String Valor) {
		nome = Valor;
		System.out.println("Nome: " + nome);
	}

	public void cadastrarPessoa(int valor1, String valor2) {
		idade = valor1;
		nome = valor2;
		System.out.println("Idade: " + idade + " - Nome: " + nome);
	}

	public static void main(String[] args) {
		SobrecargaMetodo scm = new SobrecargaMetodo();
		scm.cadastrarPessoa(28);
		scm.cadastrarPessoa("Michael Ferreira");
		scm.cadastrarPessoa(35, "Fabr�cio Gomes");
	}

}
