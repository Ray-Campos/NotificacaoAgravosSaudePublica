package enums;

public enum Sexo {
    MASCULINO(1, "Masculino"),
    FEMININO(2, "Feminino"),
    IGNORADO(3, "Ignorado");

    private final int codigo;
    private final String descricao;
    
    Sexo(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Sexo getSexo(int codigo) {
        for(Sexo s : values()) if (s.getCodigo() == codigo) return s;
        return IGNORADO;
    }
}