package controller;
import util.Teclado;
public class DesvioConvecionalSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, x;
		a = Teclado.lerInt ("informe o primeiro n�mero: ");
		b = Teclado.lerInt (" Informe o segundo n�mero: ");
		x = a + b;
		if (x>10) {
			System.out.println ("O valor da soma � " + (x + 5));
			
		} else { 
		System.out.println (" O valor da soma � " + (x - 7));
						
			}
		}

	
}
