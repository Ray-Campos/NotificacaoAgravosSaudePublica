package enums;

public enum Raca {
    BRANCA(1, "Branca"),
    PRETA(2, "Preta"),
    AMARELA(3, "Amarela"),
    PARDA(4, "Parda"),
    INDIGENA(5, "Indígena"),
    IGNORADO(9, "Ignorado");

    private final int codigo;
    private final String descricao;

    Raca(int codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {return codigo;}

    public String getDescricao() {return descricao;}

    public static Raca getRaca(int codigo) {
        for(Raca r : values()) if(r.getCodigo() == codigo) return r;
        return null;
    }
}