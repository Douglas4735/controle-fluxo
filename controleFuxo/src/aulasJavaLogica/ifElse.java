package aulasJavaLogica;

public class ifElse {
	public static void main(String[]args) {
	
		int nota = 6;
	
	if(nota >= 7) {
		System.out.println("Aprovado"); 
		
		}else if(nota >= 5 && nota < 7) {
			System.out.println("Prova Recuperação");
			
		}else if(nota < 5) {
			System.out.println("Reprovado");
		}
}
}
