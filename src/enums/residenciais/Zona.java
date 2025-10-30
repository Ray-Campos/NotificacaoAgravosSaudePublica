package enums.paciente;

import enums.EnumInterface;
import util.EnumUtil;

public enum Zona implements EnumInterface{
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

    @Override
    public int getCodigo() {return codigo;}

    @Override
    public String getDescricao() {return descricao;}

    public static Zona getZona(int codigo) {
        return EnumUtil.getFromCodigo(Zona.class, codigo, IGNORADO);
    }
}