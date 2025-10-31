package enums.agravos.hanseniase;

import enums.EnumInterface;
import util.EnumUtil;

public enum ClassificacaoOperacional implements EnumInterface {
    PB(1, "PB"),
    MB(2, "MB");

    private final int codigo;
    private final String descricao;

    ClassificacaoOperacional(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @Override
    public int getCodigo() {return codigo;}

    @Override
    public String getDescricao() {return descricao;}

    public static ClassificacaoOperacional getClassificacaoOperacional(int codigo) {
        return EnumUtil.getFromCodigo(ClassificacaoOperacional.class, codigo, MB);
    }
}
