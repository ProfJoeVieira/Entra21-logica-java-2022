# Aprendendo sobre uso de Condicionais Switch

- � uma forma de tomar decis�es usando mais de uma condi��o.
- Usado para decis�es diretas.
- � uma forma de economizar recursos.

## Formas de uso

````
opcoes = entrada.nextLine();
		
		switch(opcoes) {
		case "verde":
			System.out.println("A cor da natureza!");
			break;
		case "azul":
			System.out.println("A cor do c�u!");
			break;
		case "amarelo":
			System.out.println("Essa � pra animar!");
			break;
		case "vermelho":
			System.out.println("A cor do sangue!");
			break;
		default:
			System.out.println("Escolha uma op��o valida.");
			break;
		}
````