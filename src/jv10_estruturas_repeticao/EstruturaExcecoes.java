package jv10_estruturas_repeticao;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class EstruturaExcecoes {
    public static void main(String[] args) {
            try {
                Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
                System.out.println("Digite seu nome: ");
                String nome = scanner.next();
                System.out.println("Digite seu sobrenome: ");
                String sobrenome = scanner.next();
                System.out.println("Digite sua idade: ");
                int idade = scanner.nextInt();
                System.out.println("Digite sua altura: ");
                double altura = scanner.nextDouble();

                System.out.println("Olá " + nome.toUpperCase() + " " + sobrenome.toUpperCase() + " tudo bem com você?");
                System.out.println("Sua idade é " + idade + " anos\nE sua Altura é de " + altura + "cm");
                scanner.close();
            }catch (InputMismatchException ex){
                System.err.println("Valor Inválido!");
            }

    }


}
