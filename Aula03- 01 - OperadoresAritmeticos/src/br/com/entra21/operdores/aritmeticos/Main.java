package br.com.entra21.operdores.aritmeticos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Operadores aritm�ticos");
		
		System.out.println( "Realizando uma soma "+ (1+7));
		System.out.println(4+10);
		
		byte numeroA,numeroB; 
		int calculoSoma;
		
		//objeto entrada da classe Scanner precisa utilizar o System.in para ter acesso ao que � digitado no teclado
		Scanner entrada =new Scanner(System.in);
		// new Scanner significa: construa um objeto da classe Scanner e atribua na variavel entrada
		System.out.println("Informe o numero A:");
		numeroA = entrada.nextByte();
		
		System.out.println("Informe o numero B:");
		numeroB = entrada.nextByte();
		
		System.out.println("A soma entre esses 2 numeros � "+(numeroA+numeroB));
		calculoSoma = numeroA+numeroB;
		
		System.out.println("Outra forma de exibir essa soma � "+ calculoSoma);
		
		System.out.println("A subtra��o entre esses 2 numeros � "+(numeroA-numeroB));
		
		System.out.println("A multiplica��o " + numeroA * numeroB);
		
		System.out.println("A divis�o entre eles � " + numeroA / numeroB);
		
	}

}
