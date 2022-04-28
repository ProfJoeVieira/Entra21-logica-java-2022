package br.com.entra21.exercicioperimetro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Faça um programa que solicite a base e altura de um retângulo e informe sua área e perimetro.");
		System.out.println("Sabendo que a área é calculada com base no produto entre base e altura.\r\n"
				+ "O perímetro é obtido ao somar todos os vertices do retângulo. ");
		
		//criar variaveis	
		float base,altura,area,perimetro; //boas praticas de nomenclatura
		
		@SuppressWarnings("resource")
		Scanner entrada= new Scanner(System.in);
		
		//definir valores às variáveis
		
		System.out.println("Informe a base do retangulo");
		base = entrada.nextFloat(); 
		
		System.out.println("Informe a altura do retangulo");
		altura = entrada.nextFloat();
		perimetro = base * 2 + altura *2;
		area = base * altura;
		
		
		System.out.println("O resultado da área é: " + area + " é a do perimetro é: " + perimetro);
		

	}

}
