package jv09_estruturas_condicionais;

public class SwitchCase {
    public static void main(String[] args) {
        // Sistema de Medida

        String sigla = "G";
        switch(sigla){
            case "P":{
                System.out.println("Pequeno");
                break;
            }
            case "M":{
                System.out.println("Médio");
                break;
            }
            case "G":{
                System.out.println("Grande");
                break;
            }
            default:{
                System.out.println("Nenhum valor encontrado!");
            }
        }
    }
}
