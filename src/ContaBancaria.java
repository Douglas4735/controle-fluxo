import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class ContaBancaria {
    public static void main(String[] args) {
       try{
       Scanner sc = new Scanner(System.in).useLocale(Locale.US);

       System.out.println("Digite seu nome: ");
       String nome = sc.next();

       System.out.println("Digite o numero da sua agencia: ");
       int agencia = sc.nextInt();


       System.out.println("Digite o numero da sua conta: ");
       int conta = sc.nextInt();
        
       System.out.println("Digite o valor para saque?");
       double saque = sc.nextDouble();

       System.out.println("Olá, " + nome.toUpperCase());
       System.out.println("Sua agencia é: " + agencia);
       System.out.println("O numero da Sua conta é: " + conta);
       System.out.println("E o valor informado para saque é: " + saque);

       sc.close();
        }
        
        catch (InputMismatchException e){
            System.err.println("Os campos idade e altura precisam ser numericos.");
        }
    }  
}
