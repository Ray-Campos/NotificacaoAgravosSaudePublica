package enums.agravos.hanseniase;

import enums.EnumInterface;
import util.EnumUtil;

public enum FormaClinica implements EnumInterface{
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

    @Override
    public int getCodigo() {return codigo;}

    @Override
    public String getDescricao() {return descricao;}

    public static FormaClinica getFormaClinica(int codigo) {
        return EnumUtil.getFromCodigo(FormaClinica.class, codigo, NAO_CLASSIFICADO);
    }
}