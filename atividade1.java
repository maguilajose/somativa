package Somativa;


import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Digite o valor de a: ");
	        double a = scanner.nextDouble(); //Calcula a soma do valor A
	       
	        System.out.print("Digite o valor de b: ");
	        double b = scanner.nextDouble(); //Calcula a soma do valor A

	       
	        double soma = a + b; // Calcula a Soma de A + B
	        
	        
	        double subtracao = a - b; // Calcula a Subtração de A - B
	        
	      
	        double multiplicacao = a * b; // Calcula a multiplicação A*B
	        
	        
	        double divisao = 0; // Calcula a divisão entre A e B
	        
	        
	        if (b != 0) { //"if", ele é uma estrutura de controle de fluxo que permite executar um bloco de código se uma condição especificada for avaliada como verdadeira. 
	            divisao = a / b;
	        } else { //O comando "else" em Java é usado em conjunto com o "if" para fornecer uma alternativa quando a condição do "if" não é atendida.
	            System.out.println("Divisão por zero não é permitida.");
	        }

	        
	        System.out.println("Soma: " + soma); //Esse trecho de código imprime a soma de uma variável chamada "soma" na saída padrão
	       
	        
	        System.out.println("Subtração: " + subtracao); //Este trecho de código faz algo semelhante ao anterior, mas em vez de imprimir a soma, ele imprime o resultado de uma subtração, armazenada na variável "subtracao"
	       
	        
	        System.out.println("Multiplicação: " + multiplicacao);
	        if (b != 0) { //Este trecho de código primeiro imprime o resultado de uma multiplicação armazenada na variável "multiplicacao" e, em seguida, verifica se o valor de "b" é diferente de zero.
	            System.out.println("Divisão: " + divisao);
	        }

	        scanner.close(); //Para scannear o codigo e encerrar o codigo
	    
	 

	}

}
