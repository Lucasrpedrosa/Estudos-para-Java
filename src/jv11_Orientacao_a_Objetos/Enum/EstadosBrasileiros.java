package jv11_Orientacao_a_Objetos.Enum;

public enum EstadosBrasileiros {
    DF( "Distrito Federal", "DF"),
    PI( "Piauí",  "PI"),
    PE( "Pernambuco",  "PE"),
    SP( "São Paulo",  "SP"),
    CE( "Ceará", "CE"),

    ;

    private String nome;
    private String sigla;
    private EstadosBrasileiros(String nome, String sigla){
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
