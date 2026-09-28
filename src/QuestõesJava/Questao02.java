package QuestõesJava;

import java.util.Stack;
/*
Utilizando o Stack ( pilha ), exercitamos o principio LIFO (último a entrar, primeiro a sair), adicionando uma pilha inversa que imprime os valores e depois os remove

Tags novas:
.isEmpty() --> retorna true se a pilha estiver vazia
.pop() --> remove o último item adicionado
.peek() --> imprime o topo da lista sem remover
.push(item) --> Adiciona itens a pilha


 */
public class Questao02 {
    public static void main(String[] args) {
        Stack<String> chamados = new Stack<>();
        chamados.push("Chamado 001 - Sem internet");
        chamados.push("Chamado 002 - Computador lento");
        chamados.push("Chamado 003 - Sitema fora de ar");

        System.out.println("Ordem de atendimento: ");

        while(!chamados.isEmpty()) {
            String chamadoAtual = chamados.pop();
            System.out.printf("Atendendo: %s\n", chamadoAtual);

        }
    }
}
