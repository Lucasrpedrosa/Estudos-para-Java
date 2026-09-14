package jv13_arrays;
// Para utilizar conjuntos "Set" , "HashSet", "LinkedHashSet" e "TreeSet" deve-se importar obrigatoriamente
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Conjuntos {
    public static void main(String[] args) {
        /*
        Em conjuntos os elementos são exclusivos, ou seja, não permitem duplicatas
        No HashSet, possue uma ordem definida, fazendo com que todos os valores adicionados sejam reorganizados
        Os conjuntos não são identificados com índices
        No caso do LinkedHashSet, ele mantém a ordem em que os elementos foram adicionados
        E para o TreeSet, a sua organização é em ordem alfabética, para Strings
         */
        Set linguagens = new HashSet();

        linguagens.add(1); //  Detalhe na função .add que em conjuntos não é possível adicionar por índice
        linguagens.add(5);
        linguagens.add(10);
        linguagens.add(4);

        for(Object interar: linguagens){
            System.out.println(interar);
        }
    }
}
