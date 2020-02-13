package controller;

import util.Teclado;

public class Matematica {

double numero;
static String avalianumero;

public static void main(String[] args) {
int a;
a = 1;
Matematica av1 = new Matematica();

av1.numero = Teclado.lerDouble("Digite um valor");
while (a <= 3) {

av1.numero = av1.numero + Math.PI;

a = a + 1;
}
if (av1.numero >= 20) {
av1.avalianumero = " Número maior que 20";
} else {
av1.avalianumero = "Número menor que 20";
}

System.out.println(av1.numero);
System.out.println(av1.avalianumero);

}

}