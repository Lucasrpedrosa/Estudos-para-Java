package jv11_Orientacao_a_Objetos;

public class ComparacaoEquals {
    public static void main(String[] args) {
        /*  Estudos da diferença entre == e equals
            o "==" é utilizado para tipos primitivos (int, double, short...)
            Já o "equals" é utilizado para comparar métodos e objetos

            stack vs heap
            São armazenados no "stack" todos os valores numéricos até 127
            passando desse valor, e indo para +128, ele é armazenado em "heap" que é um repositório de objetos

         */

        // Exemplo de ==
        int i1 = 30;
        int i2 = 30;
        System.out.println(i1==i2); // true

        // Exemplo de equals
        Integer j1 = 128;
        Integer j2 = Integer.parseInt("128");
        // System.out.println(j1==j2); <-- false
        System.out.println(j1.equals(j2)); // true


    }
}
