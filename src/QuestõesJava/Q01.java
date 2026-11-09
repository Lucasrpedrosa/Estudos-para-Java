package QuestõesJava;

import java.util.Locale;
import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite um valor para n1: ");
        Double n1 = scanner.nextDouble();
        System.out.println("Digite um valor para n2: ");
        Double n2 = scanner.nextDouble();
        System.out.println("Escolha uma das opções:\n1- Somar\n2- Subtrair\n3- Multiplicar\n4- Dividir\n5- Resto da divisão\n>>> ");
        int opcao = scanner.nextInt();
        if (opcao == 1) {
            System.out.printf("%.2f + %.2f = %.2f", n1, n2, n1 + n2);
        }
        else if (opcao == 2) {
            System.out.printf("%.2f + %.2f = %.2f", n1, n2, n1 - n2);
        }
        else if (opcao == 3) {
            System.out.printf("%.2f + %.2f = %.2f", n1, n2, n1 * n2);
        }
        else if (opcao == 4) {
            if (n2 == 0) {
                System.out.println("ERRO! Operação não poderá ser efetuada como divisor 0!");
            } else {
                System.out.printf("%.2f + %.2f = %.2f", n1, n2, n1 / n2);
            }
        }
        else if (opcao == 5) {
            if (n2 == 0) {
                System.out.println("ERRO! Operação não poderá ser efetuada como divisor 0!");
            } else {
                System.out.printf("%.2f + %.2f = %.2f", n1, n2, n1 % n2);
            }
        }

        else {
            System.out.println("ERRO! Nenhuma das opções selecionada");
        }
}}
