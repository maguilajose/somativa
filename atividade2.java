package Somativa;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Digite a base do triângulo: ");
	        double base = scanner.nextDouble(); //Double ele pode armazenar números com casas decimais e oferecer uma precisão maior.

	        
	        System.out.print("Digite a altura do triângulo: ");
	        double altura = scanner.nextDouble(); //Double ele pode armazenar números com casas decimais e oferecer uma precisão maior.

	        
	        double area = (base * altura) / 2; //Double ele pode armazenar números com casas decimais e oferecer uma precisão maior.

	        
	        System.out.println("A área do triângulo é: " + area); //é utilizada para imprimir uma mensagem no console
	        
	       
	        scanner.close(); //é usada para fechar o objeto
	    }
	}
