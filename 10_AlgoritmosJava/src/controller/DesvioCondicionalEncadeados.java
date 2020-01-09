package controller;
import util.Teclado;
public class DesvioCondicionalEncadeados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	


	double sal;
	sal = Teclado.lerDouble("Digite o Salário: ");
		if (sal < 500) {
		System.out.println (" o valor Salario novo é " + (sal * 1.15));
		} else {
			if (sal <=1000) {
			System.out.println (" O valor do Salário novo é " + (sal * 1.10));
			} else {
					
					System.out.println(" O valor do Salário novo é " +(sal * 1.05));
				}
			
				
				
	
			}
		
		}


	}

		