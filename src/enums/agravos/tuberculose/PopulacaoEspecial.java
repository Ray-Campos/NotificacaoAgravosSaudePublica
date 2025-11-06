package enums.agravos.tuberculose;

import enums.EnumInterface;
import util.EnumUtil;

public enum PopulacaoEspecial implements EnumInterface{
    SIM(1, "Sim", TipoPopulacao.class),
    NAO(2, "Não"),
    IGNORADO(9, "Ignorado");

    private final int codigo;
    private final String descricao;
    private final Class<? extends EnumInterface> dependente;

    PopulacaoEspecial(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.dependente = null;
    }

    PopulacaoEspecial(int codigo, String descricao, Class<? extends EnumInterface> dependente) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.dependente = dependente;
    }

    public int getCodigo() {return codigo;}

    public String getDescricao() {return descricao;}

    public Class<? extends EnumInterface> getDependente() {
        return dependente;
    }

    public static PopulacaoEspecial getPopulacaoEspecial(int codigo) {
        return EnumUtil.getFromCodigo(PopulacaoEspecial.class, codigo, IGNORADO);
    }
}
