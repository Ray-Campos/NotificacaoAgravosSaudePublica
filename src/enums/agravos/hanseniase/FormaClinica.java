package enums.agravos.hanseniase;

public enum FormaClinica {
    I(1, "I"),
    T(2, "T"),
    D(3, "D"),
    V(4, "V"),
    NAO_CLASSIFICADO(5, "Não classificado");

    private final int codigo;
    private final String descricao;

    FormaClinica(int codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {return codigo;}

    public String getDescricao() {return descricao;}

    public static FormaClinica getFormaClinica(int codigo) {
        for(FormaClinica f : values()) if(f.getCodigo() == codigo) return f;
        return null;
    }
}