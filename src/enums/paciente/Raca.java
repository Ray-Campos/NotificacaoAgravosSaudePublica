package enums.paciente;

import enums.EnumInterface;
import util.EnumUtil;

public enum Raca implements EnumInterface{
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

    @Override
    public int getCodigo() {return codigo;}

    @Override
    public String getDescricao() {return descricao;}

    @Deprecated
    public static Raca getRaca(int codigo) {
        return EnumUtil.getFromCodigo(Raca.class, codigo, IGNORADO);
    }
}