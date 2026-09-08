package jv11_Orientacao_a_Objetos;

public class Cliente { // <-- Classe Cliente
    String nome; // Caracteristicas da classe
    Double limiteCredito = 100.0;

    public Cliente(String nome){ // <-- Contrutor que define que assim que a classe Cliente for chamada, obigatoriamente será definido a variavel "nome"
        this.nome = nome; // Caso a variavel de parâmetro seja igual a variavel da classe, utiliza-se o "this." para identificar que aquela variavel é da classe

    }
    public void solicitarLimiteCredito(Double valorSolicitado){ // <-- Metodo da classe
        limiteCredito = valorSolicitado;
    }
    public void comprar(Double valorProduto){
        limiteCredito -= valorProduto;
    }
}
