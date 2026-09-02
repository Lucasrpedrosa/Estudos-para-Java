package jv04_tiposWrappes;

/**
 * Tipos Wrapers
 *
 * São utilizados principalmente paa quando os tipos primitivos devem ser utilizados em métodos,
 * ou seja, são objetos dos tipos primitivos. São objetos imutáveis, não sendo possível alterar
 * seu valor posteriormente
 */


public class TiposWrappers {
    Integer num;
    Float num2;
    Long num3;
    Boolean val;
    Character letra;
    String letra2;

    public static void main(String[] args) {

        // Conversões de tipos com primitivos
        double d = 100.0;
        int i = (int) d;
        System.out.println(i); // 100

        // Conversão de tipos com wrapers
        Double n = 100.0898798;
        Integer j = n.intValue();
        System.out.println(j); // 100

        // Convertendo tipos de Strings para valores Int e double
        String n2 = "100";
        int k = Integer.parseInt(n2);
        System.out.println(k); // 100

        String n3 = "100.12";
        double h = Double.parseDouble(n3);
        System.out.println(h); // 100.12

        // Algumas operações com tipos wraper
        Integer obj1 = Integer.valueOf("100");
        Integer obj2 = Integer.valueOf("100");

        System.out.println(obj1.equals(obj2)); // true

        // Utilizando o compareTo, para quando o valor de obj1 for maior que o obj2 será imprimido 1.
        // Para quando o obj1 for igual a obj2 seja impresso 0
        // E para obj1 menor que obj2 imprime -1
        System.out.println(obj1.compareTo(obj2)); // 0

        // Utiizando operador lógico
        System.out.println(obj1>obj2); // false
    }


}
