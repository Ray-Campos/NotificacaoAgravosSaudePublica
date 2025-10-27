package enums;

public enum Gestante {
    PRIMEIRO_TRIMESTRE(1, "1º Trimestre"),
    SEGUNDO_TRIMESTRE(2, "2º Trimestre"),
    TERCEIRO_TRIMESTRE(3, "3º Trimestre"),
    IDADE_IGNORADA(4, "Idade gestacional ignorada"),
    NAO(5, "Não"),
    NAO_APLICA(6, "Não se aplica"),
    IGNORADO(9, "Ignorado");

    private final int codigo;
    private final String descricao;

    Gestante(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {return codigo;}

    public String getDescricao() {return descricao;}

    public static Gestante getGestante(int codigo) {
        for(Gestante g : values()) if(g.getCodigo() == codigo) return g;
        return null;
    }
}