package enums.agravos.tuberculose;

import enums.EnumInterface;
import util.EnumUtil;

public enum PopulacaoEspecial implements EnumInterface{
    SIM(1, "Sim"),
    NAO(2, "Não"),
    IGNORADO(9, "Ignorado");

    private final int codigo;
    private final String descricao;

    PopulacaoEspecial(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {return codigo;}

    public String getDescricao() {return descricao;}

    public static PopulacaoEspecial getPopulacaoEspecial(int codigo) {
        return EnumUtil.getFromCodigo(PopulacaoEspecial.class, codigo, IGNORADO);
    }
}
