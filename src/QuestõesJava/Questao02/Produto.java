package QuestõesJava.Questao02;

public class Produto {
    String nome;
    Double preco, totalEstoque = 0.0;
    Integer quantidadeEstoque = 10;


    public void exibirProduto(){
        System.out.printf("Dados do produto:\nNome: %s\nPreço (und): %.2f\nQuantidade em estoque: %d\n\n",nome, preco, quantidadeEstoque);

    }
    public double calcularValorEstoque( Double totalProdutoEstoque){
        totalProdutoEstoque = preco * quantidadeEstoque;
        return totalProdutoEstoque;

    }
    public Produto (String nome){
        this.nome = nome;
    }
}
