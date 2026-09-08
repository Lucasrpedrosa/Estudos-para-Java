package jv11_Orientacao_a_Objetos.Enum;

public class SistemaEnumeracao {
    public static void main(String[] args) {
        EstadosBrasileiros eb = EstadosBrasileiros.PE; // Utilizando "EstadosBrasileiros.valueOf("PE") --> o valueOf irá transformar a string em um objeto
        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.name());
        // Percorrendo com for
        for(EstadosBrasileiros ebs: EstadosBrasileiros.values()){
            System.out.println("ESTADO ENCONTRADO");
            System.out.println(ebs.getNome());
            System.out.println(ebs.getSigla());
            System.out.println(ebs.name());

        }

    }


}
