package jv13_arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Genericos {
    public static void main(String[] args) {
        List<String> prateleira = new ArrayList();
        prateleira.add("jeep");
        prateleira.add("ford ka");
        prateleira.add("gol 2000");
        prateleira.add("fiesta");

        Collections.sort(prateleira); // Põem em ordem alfabética todos os elementos da lista
        Collections.reverse(prateleira); // Põem na ordem reversa ao sort
        Collections.shuffle(prateleira); // Coloca na ordem aleatória.

        System.out.println(prateleira);

    }
}
