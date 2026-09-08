package jv10_estruturas_repeticao;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class EstruturaExcecoes {
    public static void main(String[] args) {

        // Utilizando exceptions do tipo Exception. Que devem ser tratadas antes da execução do programa
        try {
            Number valor = NumberFormat.getInstance().parse("1.75");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        // Utilizando exceptions do tipo Runtime. Que são exceções que so podem ser identificadas durante ou após a execução do programa
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
