package QuestõesJava;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaAlunos {
    String nome;
    double nota;
    public ListaAlunos(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }
    public static void main(String[] args) {
        ArrayList<ListaAlunos> alunos = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.println("Digite qual o nome do aluno(a): ");
            String nome = scan.next();
            System.out.println("Digite sua nota: ");
            double nota = scan.nextDouble();
            alunos.add(new ListaAlunos(nome, nota));
        }


    }
}
