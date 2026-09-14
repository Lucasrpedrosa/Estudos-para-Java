package jv13_arrays;
// Para utilizar "List" e "ArrayList" deve importar seus pacotes
import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {

        List lista = new ArrayList(); // Declarando ArrayList, aqui não se define o tamanho nem os elementos inseridos nele

        lista.add("Lucas"); // Aqui está adicionando o elemento do tipo String "Lucas" a lista
        lista.add("Python");
        lista.add("Carro");
        lista.add("Santa Cruz");
        lista.remove("Carro"); // Remove o elemento espefícifico da lista
        lista.add(2, "Flamengoo"); // É possível adicionar elementos pelo índice

        System.out.println(lista.get(0)); // Localiza o elemento do index específico, no caso o index 0,  e irá imprimir "Lucas"

        System.out.println(lista.indexOf("Lucas")); // Irá imprimir o index do elemento "Lucas", no caso 0. Está função imprime apenas a primeira ocorrencia daquele valor, ou seja, o index onde ele aparece primeiro na lista

        System.out.println(lista.size()); //  Indicara o tamanho da lista, neste caso imprimindo o valor 1, pois apenas tem 1 elemento na lista

        System.out.println(lista.contains("Carro")); // Verifica se aquele elemento está na lista e retorna um valor booleano

        for(Object interar: lista){
            System.out.println(interar); // Imprime todos os valores da lista, percorrendo ela
        }

    }
}
