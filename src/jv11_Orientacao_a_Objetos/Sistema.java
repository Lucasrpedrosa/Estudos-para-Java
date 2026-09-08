package jv11_Orientacao_a_Objetos;

public class Sistema {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Lucas Ribeiro");
        System.out.println("O limite atual de " + cliente1.nome + " é de: R$" + cliente1.limiteCredito);
        cliente1.solicitarLimiteCredito(250.0);
        System.out.println("O novo limite de " + cliente1.nome + " é de: R$" + cliente1.limiteCredito);
    }
}
