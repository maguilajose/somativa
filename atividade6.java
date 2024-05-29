package Somativa;

import java.util.Scanner;

public class atividade6 {

	public static void main(String[] args) {
			String nome [] = new String[6];
			Scanner ler = new Scanner(System.in);
			for (int i = 0; i<6; i++) {
				System.out.println("Informe o nome do " +i+" carro ");
				nome[i] = ler.next();
			}
         for (int i = 0; i<6; i++) {
        	 System.out.println(nome[i]);
         }
}
}
