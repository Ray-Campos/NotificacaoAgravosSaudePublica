package enums.conclusao;

import enums.EnumInterface;
import util.EnumUtil;

public enum ClassificacaoFinal implements EnumInterface{
    CONFIRMADO(1, "Confirmado"),
    DESCARTADO(2, "Descartado");

    private final int codigo;
    private final String descricao;

    ClassificacaoFinal(int codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @Override
    public int getCodigo() {return codigo;}

    @Override
    public String getDescricao() {return descricao;}

    @Deprecated
    public static ClassificacaoFinal getClassificacaoFinal(int codigo) {
        return EnumUtil.getFromCodigo(ClassificacaoFinal.class, codigo, DESCARTADO);
    }
}
