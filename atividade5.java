package Somativa;

import java.util.Scanner;

public class atividade5 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        
	        
	        double[] numeros = new double[15]; //Ele define a estrutura de dados que pode ser usada para armazenar uma sequência de valores numéricos do tipo double.
	        
	       
	        System.out.println("Digite 15 números:"); // Responsável por imprimir a mensagem "Digite 15 números:" no console, indicando ao usuário que ele deve inserir 15 números.

	       
	        for (int i = 0; i < 15; i++) { //A palavra-chave que inicia a estrutura do l(int i = 0;: Esta parte é a inicialização do loop. Aqui, declaramos e inicializamos uma variável chamada i do tipo inteiro com o valor inicial de 0.oop for. 
	            System.out.print("Número " + (i + 1) + ": "); //para imprimir uma mensagem no console, solicitando um número ao usuário, e também exibe o número da iteração atual do loop.
	            numeros[i] = scanner.nextDouble(); //atribui um valor double digitado pelo usuário para um elemento específico do array numeros.
	        }

	        
	        double soma = 0;
	        for (int i = 0; i < 15; i++) { //Declara e inicializa uma variável chamada soma com o valor 0, que será usada para armazenar a soma dos números no array.
            soma += numeros[i];//Dentro do loop, cada elemento do array numeros é adicionado à variável soma.
	        }

	        
	        System.out.println("A soma dos números é: " + soma); // imprimirá a mensagem "A soma dos números é: " seguida pelo valor contido na variável soma. Por exemplo, se soma for 10, a saída será "A soma dos números é: 10".
	        
	        
	        scanner.close(); //Encerrar o codigo e terminar de ler todo o codigo 
	    }
	}
