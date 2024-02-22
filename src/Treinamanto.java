import java.util.Scanner;

public class Treinamanto {
    
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);

       System.out.println("Digite o nome do banco?");
       String banco = sc.next();

       System.out.println("Digite o numero da sua conta: ");
       int conta = sc.nextInt();


       System.out.println("Digite o valor a ser sacado:");
       double valor = sc.nextDouble();
   
       System.out.println("Fim");
}

    @Override
    public String toString() {
        return "Treinamanto []";
    }
}