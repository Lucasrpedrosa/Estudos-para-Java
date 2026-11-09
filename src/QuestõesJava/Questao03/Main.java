package QuestõesJava.Questao03;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.marca = "Honda";
        carro1.modelo = "Sedã";
        carro1.ano = 2008;
        carro1.velocidade = 100;
        carro1.exibirVelocidade();
        carro1.acelerar();
        carro1.exibirVelocidade();
        carro1.frear();
        carro1.exibirVelocidade();

        Carro carro2 = new Carro();
        carro2.marca = "Onix";
        carro2.modelo = "Conversivel";
        carro2.ano = 2010;
        carro2.velocidade = 10;
        carro2.exibirVelocidade();
        carro2.frear();
        carro2.frear();
        carro2.exibirVelocidade();
        carro2.acelerar();
        carro2.exibirVelocidade();

    }
}
