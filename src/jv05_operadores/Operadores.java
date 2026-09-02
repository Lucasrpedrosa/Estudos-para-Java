package jv05_operadores;

public class Operadores {
    public static void main(String[] args) {
        String concat = "?";
        System.out.println(concat);
        concat = 1+1+1+"1";
        System.out.println(concat);
        concat = 1+"1"+1+1;
        System.out.println(concat);
        concat = 1+"1"+1+"1";
        System.out.println(concat);
        concat = "1"+1+1+1;
        System.out.println(concat);
        concat = "1"+(1+1+1);
        System.out.println(concat);

    }
}
