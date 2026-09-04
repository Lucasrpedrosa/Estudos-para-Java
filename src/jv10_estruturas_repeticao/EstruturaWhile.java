package jv10_estruturas_repeticao;

public class EstruturaWhile {
    public static void main(String[] args) {
        int i = 0;
        double mesada = 50.0;
        while(i<=10){
            ++i;
            System.out.println(i);

        }
        // Mais exemplos
        while(mesada>0){
            Double valorItem = 20.0;
            if(mesada >= valorItem) {
                mesada -= valorItem;
                System.out.println("Compra realizada com sucesso!\nItem comprado no valor de " + valorItem + "\nMesada: " + mesada);
            }
            else {
                System.out.println("Mesada insuficiente!\nValor do item " + valorItem + "\nMesada: " + mesada);
                break;
            }
        }
    }
}
