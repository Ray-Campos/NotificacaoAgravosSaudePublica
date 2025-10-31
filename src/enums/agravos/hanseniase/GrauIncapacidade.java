package enums.agravos.hanseniase;

import enums.EnumInterface;
import util.EnumUtil;

public enum GrauIncapacidade implements EnumInterface{
    GRAU_ZERO(0, "Grau zero"),
    GRAU_UM(1, "Grau um"),
    GRAU_DOIS(2, "Grau dois"),
    NAO_AVALIADO(3, "Não avaliado");

    private final int codigo;
    private final String descricao;

    GrauIncapacidade(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @Override
    public int getCodigo() {return codigo;}

    @Override
    public String getDescricao() {return descricao;}

    public static GrauIncapacidade getGrauIncapacidade(int codigo) {
        return EnumUtil.getFromCodigo(GrauIncapacidade.class, codigo, NAO_AVALIADO);
    }
}
