package jv10_estruturas_repeticao;

import java.util.Random;

public class EstruturaDoWhile {
    private static int numeroTentativas=0;
    public static void main(String[] args) {
        // Estruturando lógica ao do while
        System.out.println("Discando...");
        do{
            System.out.println("Telefone tocando...");
        }while(tocando());
        if(numeroTentativas<5)
            System.out.println("ALÔ !!!");
        else
            System.out.println("Não atendeu!");

    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(5)==1;
        numeroTentativas++;
        if(numeroTentativas==5)
            return false;
        else
            return !atendeu;
    }
}
