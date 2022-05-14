package br.com.entra21.aula11.praticaemsala;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1-Cauculando a soma
		Scanner input = new Scanner(System.in);
		String option;
      do {
    	  
        System.out.println("\n Escolha uma das opções");
		System.out.println(" 0 - \''Sair'' ");
        System.out.println(" 1 - Cauculando a soma ");
		System.out.println(" 2 - Repita 20 vezes ");
		System.out.println(" 3 - Entre 20 pessoas, exibir a soma das idades?");
		System.out.println(" 4 - Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade");
		System.out.println(" 5 - Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.");
		
		
		option = input.nextLine();
		switch (option) {
		case "0":
			System.out.println("Saindo...");
			break;
		
		case "1":
			calculandoASoma();
			break;
		
		case "2":
		     runRepeat20();
		     break;
		 
		case "3":
			maioresDeIdade();
			break;
			
		case "4":
			sumAge();
			break;
		
		case "5":
			exibirMaisNovo();
			break;
			
		default:
			System.out.println("Escolha uma opção válida");
			break;
			
			
			}
		
		
      } while  (option.equals("0") == false); 
	 System.out.println("Obrigada por usar o programa");
	 }
	 

  

	//Função soma
	private static void calculandoASoma() {
		  System.out.println("CALCULANDO A SOMA");
	        byte soma = 0;
	        for(byte counter=1; counter <=15; counter++) {
	            System.out.println("Soma = soma + counter,  " + soma + " = " + soma + " + " + counter +  " ==> " + (soma + counter)  );
	            soma = (byte) (soma + counter);
	           
	        }
	    }

         //Função runRepeat20
	private static void runRepeat20() {
		
		 for(byte cont = 1; cont <= 20; cont++ ) {
			 System.out.println( "Eu gosto de algoritmos"+(cont%5==0?"\n":"  "));
			 
		/*	 if(cont % 5==0) {
				 System.out.println("\n");
				 
			 }
			 */
		 }
	
	}			
	  //Função maioresDeIdade
	private static void maioresDeIdade() {
		 System.out.println("Exibir apenas os maiores de idade");
	        byte maiores = 0;
	        byte idade, cont;

	        Scanner input = new Scanner(System.in);
	        for (cont = 1; cont <= 20; cont++) {
	            System.out.println("Informe a idade da pessoa " + cont);
	            idade = input.nextByte();
	            if (idade >= 18) {
	                maiores++;
	                System.out.println("A última pessoa informada era de maior.");
	            }
	        }
	        System.out.println("Entre " + (cont - 1) + " pessoas, apenas " + maiores + " são maiores de idade");
	    }
		

     //Função sumAge = soma as idades e armazena
	private static void sumAge() {
		int sumAge=0;
        byte age;
        Scanner input = new Scanner(System.in);
       
        for(byte count=1;count<=5;count++) {
            System.out.println("No momento a soma está em "+sumAge);
            System.out.println("Por favor, insira a idade: ");
            age = input.nextByte();
            sumAge = sumAge + age;
        }
        System.out.println("A soma total das idades foi "+sumAge);
    }
	
	//Função para ler, guardar e exibir o nome da pessoa mais nova
	private static void exibirMaisNovo() {
		Scanner input = new Scanner(System.in);
		String name, youngerName;
		byte age, ageMinimal = 0;
		
		for(byte count=1; count <=10; count++) {
			
			System.out.println("Digite seu nome: ");
			name = input.next();
			System.out.println("Por favor, digite a idade: ");
			age = input.nextByte();
			//No primeiro laço, a primeira idade sempre vai ser a menor
			if (count == 1) {
				ageMinimal = age;
				youngerName = name;
				System.out.println("Sou o primeiro e por isso sou o mais novo "+name+" "+age);
			
			}else {
				//A partir do segundo laço já tenho como comparar com "ageMin"
				System.out.println("Estou no laço " + count + " e preciso verificar");
				if (age < ageMinimal) {
					System.out.println( "Ainda bem que testei porque a pessoa mais nova é..." + name + "com " + age + " anos");
					ageMinimal = age;
					youngerName = name;
					
				}					
					
				}
			}
			
		}
		
		
	}

	
