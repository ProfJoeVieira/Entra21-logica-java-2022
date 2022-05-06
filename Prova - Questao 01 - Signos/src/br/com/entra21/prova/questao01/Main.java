
package br.com.entra21.prova.questao01;

import java.util.Scanner;

public class Main {

	    public static void main(String[] args) {
	      Scanner ler = new Scanner(System.in);

	      //Crie um programa que informe o signo do usuário
	      //Capturar nome , dia e mês de aniversário
	      //Criar constante para numero limite do dia do mês, no caso 31
	      
	      int dia, mes;
           
	      System.out.println("Descubra qual é o teu Signo ;-)");
	      
	    
	      System.out.println("Por favor, digite o dia de nascimento "
	      					+ "(um número válido entre 1 a 31: ");
	      dia = ler.nextInt(); //Captura o dia
	    
	      System.out.printf("Agora, digite o mês de nascimento em número "
	      					+ "(Ex: Janeiro = 1/Dezembro = 12): ");
	      mes = ler.nextInt(); //Captura o mês
	     
	    	  System.out.printf("Aguarde, seu signo é: ");
                  //Se tudo der certo, retorna a resposta ao user de acordo com a lógica 
	    	  
	      if (((mes == 12) && ((dia >= 22) && (dia <= 31))) ||
	          ((mes == 1)  && ((dia >= 1)  && (dia <= 20))))
	    	  	  System.out.printf("Capricornio");
	      else if (((mes == 1) && ((dia >= 21) && (dia <= 31))) ||
	               ((mes == 2) && ((dia >= 1)  && (dia <= 19))))
	              System.out.printf("Aquario");
	      else if (((mes == 2) && ((dia >= 20) && (dia <= 29))) ||
	               ((mes == 3) && ((dia >= 1)  && (dia <= 20))))
	              System.out.printf("Peixes");
	      else if (((mes == 3) && ((dia >= 21) && (dia <= 31))) ||
	               ((mes == 4) && ((dia >= 1)  && (dia <= 20))))
	              System.out.printf("Aries");
	      else if (((mes == 4) && ((dia >= 21) && (dia <= 30))) ||
	               ((mes == 5) && ((dia >= 1)  && (dia <= 20))))
	              System.out.printf("Touro");
	      else if (((mes == 5) && ((dia >= 21) && (dia <= 31))) ||
	               ((mes == 6) && ((dia >= 1)  && (dia <= 20))))
	              System.out.printf("Gemeos");
	      else if (((mes == 6) && ((dia >= 21) && (dia <= 30))) ||
	               ((mes == 7) && ((dia >= 1)  && (dia <= 21))))
	              System.out.printf("Cancer");
	      else if (((mes == 7) && ((dia >= 22) && (dia <= 31))) ||
	               ((mes == 8) && ((dia >= 1)  && (dia <= 22))))
	              System.out.printf("Leao");
	      else if (((mes == 8) && ((dia >= 23) && (dia <= 31))) ||
	               ((mes == 9) && ((dia >= 1)  && (dia <= 22))))
	              System.out.printf("Virgem");
	      else if (((mes == 9)  && ((dia >= 23) && (dia <= 30))) ||
	               ((mes == 10) && ((dia >= 1)  && (dia <= 22))))
	              System.out.printf("Libra");
	      else if (((mes == 10) && ((dia >= 23) && (dia <= 31))) ||
	               ((mes == 11) && ((dia >= 1)  && (dia <= 21))))
	              System.out.printf("Escorpiao");
	      else if (((mes == 11) && ((dia >= 22) && (dia <= 30))) ||
	               ((mes == 12) && ((dia >= 1)  && (dia <= 21))))
	              System.out.printf("Sagitario");
	           else
	              System.out.printf("Erro: O dia ou mês de nascimento inválidos! Use apenas números válidos! ;-)");
	               //Caso algo dê errado, mostre isto
	    }

	}