package br.com.enra21.condicionalif;

import java.lang.invoke.ClassSpecializer.Factory;

public class Main {

	public static void main(String[] args) {
		System.out.println("Aprendendo sobre If ");
		
		if(true) {
			System.out.println("Vai fazer isso quando der true");
			System.out.println("Somente true");
			
		}

		System.out.println("Aqui vai acontecer naturalmente porque o c�digo segue sempre em frente ");
	
		if(false) {
			//nunca passaria aqui, pois apenas quando resulta em true 
		
		}
		
		byte idade =17; 
		
		if(idade>=18 ) {//idade � maior de idade?
			//sim
			System.out.println("� maior de idade");
		
		if(idade>=13 && (idade<18)) {//� adolescente
			System.out.println("� adolescente");
		}
			
		}
	}

}
