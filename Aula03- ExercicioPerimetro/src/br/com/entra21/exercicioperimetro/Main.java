package br.com.entra21.exercicioperimetro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Fa�a um programa que solicite a base e altura de um ret�ngulo e informe sua �rea e perimetro.");
		System.out.println("Sabendo que a �rea � calculada com base no produto entre base e altura.\r\n"
				+ "O per�metro � obtido ao somar todos os vertices do ret�ngulo. ");
		
		//criar variaveis	
		float base,altura,area,perimetro; //boas praticas de nomenclatura
		
		@SuppressWarnings("resource")
		Scanner entrada= new Scanner(System.in);
		
		//definir valores �s vari�veis
		
		System.out.println("Informe a base do retangulo");
		base = entrada.nextFloat(); 
		
		System.out.println("Informe a altura do retangulo");
		altura = entrada.nextFloat();
		perimetro = base * 2 + altura *2;
		area = base * altura;
		
		
		System.out.println("O resultado da �rea �: " + area + " � a do perimetro �: " + perimetro);
		

	}

}
