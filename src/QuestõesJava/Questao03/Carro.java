package QuestõesJava.Questao03;

public class Carro {
    String marca, modelo;
    Integer ano, velocidade;

    public void exibirVelocidade(){
        System.out.printf("Velocidade atual: %d\n\n",velocidade);
    }
    public void acelerar(){
        velocidade += 10;
    }
    public void frear(){
        if (velocidade < 10){
            velocidade = 0;
        }
        else{
            velocidade -= 10;
        }
    }
}
