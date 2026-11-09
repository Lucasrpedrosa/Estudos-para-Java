package jv01_indentacao;

import org.w3c.dom.ls.LSOutput;

public class MediaAluno {
    public static void main(String[] args) {
        int media = 7;
        if (media < 6)
        System.out.println("Reprovado(a)!");

        else if (media == 6)
            System.out.println("Aprovado(a) por média!");
        else
            System.out.println("Aprovado(a)!");

    }
}
