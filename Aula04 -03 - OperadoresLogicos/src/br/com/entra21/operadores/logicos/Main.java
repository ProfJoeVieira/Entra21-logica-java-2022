package br.com.entra21.operadores.logicos;

public class Main {

	public static void main(String[] args) {
		System.out.println("Operadores lóigicos");
		
		System.out.println(" E - AND - && - eComercial - (Shift+7) - = expressão restritiva");
		
		byte idade=19;
		float altura=1.8f;
		double dinheiro
		boolean resultado;
		
		resultado = idade<18;//false
		resultado = altura>=2.0f;//false
		resultado = (idade<18) && (altura>=2.0f);
		//               (false)  && (false)
		//						false
		
		idade=15;
		altura=1.9f;
		resultado = (idade<18) && (altura>=2.0f);
		//				(true) &&  (false)
		//					false
		
		
		idade=20;
		altura=2.10f;
		dinheiro=20000;
		
		resultado = (idade>=18) && (altura>=2.0f) && (dinheiro >=50000);
				//		(true)  &&  (true)        &&    (false)
				//		(true)  &&  (false)             
		        //				false
		
		
		idade=30;
		altura=2.15f;
		dinheiro=100000;
		
		resultado = (idade>=18) && (altura>=2.0f) && (dinheiro >=50000);
				//		(true)  &&  (true)        &&    (true)
				//		(true)  &&  (true)             
		        //				true
		
		
		idade=40;
		altura=2.35f;
		dinheiro=100000;
		
		resultado = (idade>=18) && (idade<=45)  &&  (altura>=2.35) && (dinheiro >=50000);
				//		(true)  &&  (true)        &&    (false)
				//		(true)  &&  (false)             
		        //				false
		
		
		//---------------------------------------------------------------------------------
		
		System.out.println("OU - OR - || - pipe - (Shift\\) - (alt+124) = expressão inclusiva") ;
		
		idade=17;
		dinheiro=1000;
		
		resultado = (idade>=18) || (dinheiro>=1000); //entra na rave7dias no sitio
		//			(false)     || (dinheiro>=1000)
		//			(false)		||	(true)
		//					   true 
		
		
	}

}
