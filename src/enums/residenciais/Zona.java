package emuns;

public enum Zona {
    URBANA(1, "Urbana"),
    RURAL(2, "Rural"),
    PERIURBANA(3, "Periurbana"),
    IGNORADO(9, "Ignorado");

    private final int codigo;
    private final String descricao;

    Zona(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {return codigo;}

    public String getDescricao() {return descricao;}

    public static Zona getZona(int codigo) {
        for(Zona z : values()) if(z.getCodigo() == codigo) return z;
        return null;
    }
}