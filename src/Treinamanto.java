import java.util.Scanner;

import javax.swing.JOptionPane;

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
   
       System.out.println("Fim");
}

    @Override
    public String toString() {
        return "Treinamanto []";
    }
}