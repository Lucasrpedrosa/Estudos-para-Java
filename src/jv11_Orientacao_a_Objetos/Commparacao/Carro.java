package jv11_Orientacao_a_Objetos.Commparacao;

import java.util.Objects;

public class Carro {
    String cor, marca, modelo;
    public Carro(String cor, String marca, String modelo){
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }
    //  Deve ser implementado o equals and hashCode para que os valores sejam reconhecidos como objetos mesmo que sejam de instâncias diferentes
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(cor, carro.cor) && Objects.equals(marca, carro.marca) && Objects.equals(modelo, carro.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cor, marca, modelo);
    }
}
