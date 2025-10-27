package enums.agravos;

public enum TipoAgravos {
    HANSENÍASE(1, "Hanseníase"),
    TUBERCULOSE(2, "Tuberculose"),
    MALÁRIA(3, "Malária");

    private final int codigo;
    private final String descricao;

    TipoAgravos(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoAgravos getTipoAgravos(int codigo) {
        for(TipoAgravos t : values()) if(t.getCodigo() == codigo) return t;
        return null;
    }
}