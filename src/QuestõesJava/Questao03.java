package QuestõesJava;

import java.util.LinkedList;
import java.util.Queue;


public class Questao03 {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.offer("Cliente 01");
        fila.offer("Cliente 02");
        fila.offer("Cliente 03");
        fila.offer("Cliente 04");
        fila.offer("Cliente 05");

        System.out.println("Ordem de atendimento: ");

        while(!fila.isEmpty()){
            String filaAtual = fila.poll();
            System.out.printf("Atendendo: %s\n\n", filaAtual);

        }
    }
}
