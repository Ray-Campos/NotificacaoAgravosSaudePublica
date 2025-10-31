package enums.agravos.hanseniase;

import enums.EnumInterface;
import enums.agravos.hanseniase.ClassificacaoOperacional;
import util.EnumUtil;

public enum EsquemaTerapeutico implements EnumInterface {
    PQT_PB(1, "PQT/PB/ 6 doses"),
    PQT_MB(2, "PQT/MB/ 12 doses"),
    OUTROS(3, "Outros Esquemas Substitutos");

    private final int codigo;
    private final String descricao;

    EsquemaTerapeutico(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @Override
    public int getCodigo() {return codigo;}

    @Override
    public String getDescricao() {return descricao;}

    public static EsquemaTerapeutico getEsquemaTerapeutico(int codigo) {
        return EnumUtil.getFromCodigo(EsquemaTerapeutico.class, codigo, OUTROS);
    }
}
