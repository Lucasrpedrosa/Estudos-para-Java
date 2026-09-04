package jv09_estruturas_condicionais;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        double saldo = 20.0, valorSolicitado = 17.0;
        int nota = 6;
        // Utilizando as condicionais ternárias
        String resultado = nota >= 7 ? "Aprovado(a)" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado(a)";
        System.out.println(resultado);
        if(valorSolicitado <= saldo)
            saldo -= valorSolicitado;
        System.out.println("Valor sacado com sucesso!");
        System.out.println("O valor sacado foi de " + saldo);

        // Testando condicionais encadeadas
        if(nota >= 7)
        System.out.println("Aprovado(a)!");
        else if(nota >= 5 && nota < 7 )
            System.out.println("Recuperação!");
        else
            System.out.println("Reprovado(a)!");

    }
}
