package br.com.entra21.condicionalswitchcase;

import java.util.Scanner;

public class Main {

	private static final String sim = null;

	public static void main(String[] args) {
		
	    System.out.println("Condicionais - Switch");
	    
	    System.out.println("Serve para escolher entre opções pré definidas");
	    
	    System.out.println("Geralmente quando há muitos 'if''elses ifs'baseados em igualdade");
	    
	    float altura=1.5f;
	    
	    if(altura == 1.0) {
	    	System.out.println("É baixinho");
	    }else if(altura ==1.2) {
	    	System.out.println("Continua baixinho");
	    }else if(altura == 1.5) {
	    	System.out.println("Baixinho mas nem tanto");
	    }else {
	    	System.out.println("Já não é considerado baixinho");
	    }
	    System.out.println("1 = Intervalo");
	    System.out.println("2 = Exercicio");
	    System.out.println("3 = Prova");
	    Scanner entrada = new Scanner(System.in);
	    byte opcao;
	    System.out.println("Escolha a op 3 se tiver coragem");
	    opcao = entrada.nextByte();
	    
	    switch (opcao) {
	    case 1:
	    	System.out.println("Vamos para o intervalo");
	    	break;
	    
	    case 2:
	    	System.out.println("Daqui a pouco tem exercicio");
	    
	    case 3:
	    	System.out.println("Era dia 5 mais podemos fazer hoje");

	    	System.out.println("Ou escolha qualquer opção.");
			break;
		}
		
		
		
		String resposta;
		System.out.println("Queremos intervalo? Escolha uma opção: ");
		resposta = entrada.next();
		
		switch(resposta) {
		
		case "sim":
			System.out.println("Hoje foi na hora...");
			break;
		
		case "nao":
			System.out.println("esperar mais um pouco");
			break;
		
		default:
			System.out.println("era uma pergunta tao simples...");
			break;
		}
		
		
		System.out.println("Escolha um número: ");
		System.out.println("1 = azul");
		System.out.println("2 = vermelho");
		System.out.println("nenhuma = nenhuma");
		resposta = entrada.next();
		
		switch (resposta) {
		case "1":
			System.out.println("Azul é bom, mas nada contra quem gosta de vermelho.");
			break;
		case "2":
			System.out.println("Vermelho é bom, mas nada contra quem gosta de azul.");
			break;
		case "nenhuma":
			System.out.println("");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		
		}
		
	} 

}


