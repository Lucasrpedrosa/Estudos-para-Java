package jv07_ternarios;

public class Ternario {

    /**
     * Ternários
     *
     * São os usos de condições e operaçõe em uma mesma linha
     * A exemplo do "?" e ":" em conjunto que indicam condição tendo uma função de if e else
     *
     *
     *
     */

    public static void main(String[] args) {
        String nome = "Lucas";
        int idade = 17;
        final int MAIOR_IDADE = 18;
        boolean maiorIdade = idade >= MAIOR_IDADE;
        String mensagem = nome + (maiorIdade ? " é de maior!" : " não é de maior!");
        System.out.println(mensagem);

    }

}
