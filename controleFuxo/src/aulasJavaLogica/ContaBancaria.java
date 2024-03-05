package aulasJavaLogica;

import java.util.Scanner;

public class ContaBancaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner conta = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String nome = conta.next();
		
		System.out.println("Digite sua conta:");
		int conta1 = conta.nextInt();
		
		System.out.println("Digite a Agência:");
		int agencia = conta.nextInt();	
		
		System.out.println("Valor a ser sacado:");
		double valor = conta.nextDouble();
		
		}
}
