package jv10_estruturas_repeticao;

public class EstruturaFor {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        // Outra maneira de utilizar o for
        int j = 0;
        for(; j<=10;){
            System.out.println(j);
            j++;
        }

        // Uso percorrendo uma array
        String alunos[] = {"FELIPE", "LUCAS", "VITOR", "GUILHERME"};
        for(int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no indice x = "+x+" é "+alunos[x]);
        }
        // Sem utilizar indices
        for(String aluno : alunos){
            System.out.println(aluno);
        }
    }
}
