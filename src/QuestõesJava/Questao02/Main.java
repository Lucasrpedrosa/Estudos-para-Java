package QuestõesJava.Questao02;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("sardinha");
        produto1.preco = 3.35;
        produto1.exibirProduto();
        System.out.println("Preço total em estoque: "+produto1.calcularValorEstoque(produto1.totalEstoque));

    }
}
