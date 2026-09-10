package jv11_Orientacao_a_Objetos.Commparacao;

public class FabricaCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("branca", "fiat", "palio");
        Carro carro2 = new Carro("branca", "fiat", "palio");
        Carro carro3 = new Carro("preto", "fiat", "palio");
        Carro carro4 = new Carro("branca", "fiat", "palio");

        System.out.println(carro1.equals(carro2));
        System.out.println(carro3.equals(carro4));


    }
}

