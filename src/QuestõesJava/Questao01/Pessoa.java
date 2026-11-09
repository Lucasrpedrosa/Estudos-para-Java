package QuestõesJava.Questao01;

public class Pessoa {
    String nome;
    Integer idade;
    Double altura;

    public void apresenatarDados(){
        System.out.printf("Dados\nNome: %s\nIdade: %d\nAltura: %.2f\n\n", nome, idade, altura);
    }
}
