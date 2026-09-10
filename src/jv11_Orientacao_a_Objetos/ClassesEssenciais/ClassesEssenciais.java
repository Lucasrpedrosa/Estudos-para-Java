package jv11_Orientacao_a_Objetos.ClassesEssenciais;
import java.util.Scanner;
public class ClassesEssenciais {
    public static void main(String[] args) {

        // Utilizando o Scanner
        /* String nome= null;
        Integer idade = null;
        Double peso = null;

        String stringLinhaArquivos = "Lucas Ribeiro;18;95.60";
        Scanner scan = new Scanner(stringLinhaArquivos);
        scan.useDelimiter(";");

        //String stringLinhaArquivos = "Lucas Ribeiro|18|95.60"; <-- Quando utilizandos outros delimitadores
        //Scanner scan = new Scanner(stringLinhaArquivos);
        //scan.useDelimiter("\\|"); <-- o "\\" deverá ser usado para que o delimitador "|" seja interpretado corretamente

        int index = 0;
        while(scan.hasNext()){

            if(index == 0)
                nome = scan.next();
            else if(index == 1)
                idade = Integer.valueOf(scan.next());
            else
                peso = Double.valueOf(scan.next()) ;

            index++;
        }
        System.out.println("Olá "+ nome + "!\nSua idade é "+ idade +"\nSeu peso é "+ peso);
        */
        // Utilizando propriedades do PrintStream

        String nome = "Lucas Ribeiro";
        int idade = 18;
        double peso = 95.63;
        double renda = 3125.00;
        System.out.printf("Nome: %s \nIdade: %d \nPeso(kg): %.2f \n Renda: R$ %,.2f", nome, idade, peso, renda);
        // %s -> parametro do tipo String
        // %d -> parametro do tipo Integer/Long
        // %f -> parametro do tipo Double/Float
        // %.2f -> quer dizer que serão dois digitos decimais
        // %,.2f -> quer dizer que serão dois digitos decimais e informando o (.) de milhar


        // Utilizando o StringBuilder
        // Ele é utilizado para caso seja necessário a concatenação constante de valores strings

        StringBuilder nome2 = new StringBuilder();
        nome2.append("Lucas");
        nome2.append(" Ribeiro");

    }
}
