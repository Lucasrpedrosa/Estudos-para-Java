package jv06_operadoresUnarios;

public class Unarios {
    /**
     * Utilizamos os seguintes operadores
     *
     * + <- Apenas declara que a variável é positiva
     * - <- Apenas declara que a variável é negativa
     * ++ <- Adiciona 1 ao valor
     * -- <- Subtrai 1 do valor
     * ! <- Nega a variavel ou a operação
     *
     */
    // Usos dos operadores
    public static void main(String[] args) {
        int num = +5;
        System.out.println(num); // 5
        System.out.println(-num); // -5

        System.out.println(num++); // Imprime 5 pois somente será adicionado apos a primeira impressão
        System.out.println(num); // 6

        int num2 = 5;
        System.out.println(++num2); // Adicionando o "++" a direita esquerda do valor ele irá imprimir o valor já adicionado, nesse caso imprime 6
        System.out.println(num2); // 6
    }
}
