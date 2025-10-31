package enums.agravos.hanseniase;

import enums.EnumInterface;
import util.EnumUtil;

public enum ModoDeteccaoCaso implements EnumInterface{
    ENCAMINHAMENTO(1, "Encaminhamento"),
    DEMANDA_ESPONTANEA(2, "Demanda Espontânea"),
    EXAME_COLETIVIDADE(3, "Exame de Coletividade"),
    EXAME_CONTATOS(4, "Exame de Contatos"),
    OUTROS_MODOS(5, "Outros Modos"),
    IGNORADO(9, "Ignorado");

    private final int codigo;
    private final String descricao;

    ModoDeteccaoCaso(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @Override
    public int getCodigo() {return codigo;}

    @Override
    public String getDescricao() {return descricao;}

    public static ModoDeteccaoCaso getModoDeteccaoCaso(int codigo) {
        return EnumUtil.getFromCodigo(ModoDeteccaoCaso.class, codigo, IGNORADO);
    }
}
