import java.util.Scanner;

public class Treinamanto {
    /*Os codigos escritos aqui são somente para treina sendo que sempre averá mudanças */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Digite o nome do banco?");
       String banco = sc.next();

       System.out.println("Digite o numero da sua conta: ");
       int conta = sc.nextInt();


       System.out.println("Digite o valor a ser sacado:");
       double valor = sc.nextDouble();
   
       System.out.println("Nome do banco é: " + banco + " e o numero da conta é: " + conta + " e o valor a ser sacado é R$: " + valor + " Reais.");
}

}