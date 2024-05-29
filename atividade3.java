package Somativa;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	       
	        int[] vectorA = new int[5];
	        int[] vectorB = new int[5];

	        
	        System.out.println("Digite os valores do vetor A:");
	        for (int i = 0; i < vectorA.length; i++) {
	            System.out.print("Valor " + (i + 1) + ": ");
	            vectorA[i] = scanner.nextInt();
	        }

	     
	        System.out.println("Digite os valores do vector B:");
	        for (int i = 0; i < vectorB.length; i++) {
	            System.out.print("Valor " + (i + 1) + ": ");
	            vectorB[i] = scanner.nextInt();
	        }

	        
	        int[] vectorC = new int[vectorA.length + vectorB.length];
	        for (int i = 0; i < vectorA.length; i++) {
	            vectorC[i] = vectorA[i];
	        }
	        for (int i = 0; i < vectorB.length; i++) {
	            vectorC[vectorA.length + i] = vectorB[i];
	        }

	        
	        System.out.println("Vector A:");
	        printArray(vectorA);
	        System.out.println("Vector B:");
	        printArray(vectorB);
	        System.out.println("Vector C (junção de A e B):");
	        printArray(vectorC);

	        scanner.close();
	    }

	    
	    public static void printArray(int[] array) {
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println();
	    }
	}
