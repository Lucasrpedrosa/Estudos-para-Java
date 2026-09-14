package jv13_arrays;

public class Array {
    public static void main(String[] args) {
        // Caso adicione o tipo primitivo inteiro, ele imprimira 0
        // E o tipo String imprimira "null"
        Integer [] lista = new Integer[7]; // Também pode ser.. " new Integer[] {2,4,10,15,5,3}; "
        lista [0] = 2;
        lista [1] = 3;
        lista [2] = 5;
        lista [3] = 7;
        lista [4] = 9;
        lista [5] = 8;
        lista [6] = 1;
        for (int i = 0; i < lista.length; i++){
            System.out.println(lista[i]);
        }

    }
}
