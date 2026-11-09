package QuestõesJava.Questao01;

public class Sistema {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Lucas Ribeiro";
        pessoa1.idade = 18;
        pessoa1.altura = 1.78;
        pessoa1.apresenatarDados();

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Vitor Ribeiro";
        pessoa2.idade = 16;
        pessoa2.altura = 1.76;
        pessoa2.apresenatarDados();

        Pessoa pessoa3 = new Pessoa();
        pessoa3.nome = "Maria Clara";
        pessoa3.idade = 18;
        pessoa3.altura = 1.55;
        pessoa3.apresenatarDados();
    }

}
