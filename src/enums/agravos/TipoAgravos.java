package enums.agravos;

import enums.EnumInterface;
import util.EnumUtil;

public enum TipoAgravos implements EnumInterface{
    HANSENÍASE(1, "Hanseníase"),
    TUBERCULOSE(2, "Tuberculose"),
    MALÁRIA(3, "Malária");

    private final int codigo;
    private final String descricao;

    TipoAgravos(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @Override
    public int getCodigo() {
        return codigo;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    public static TipoAgravos getTipoAgravos(int codigo) {
        return EnumUtil.getFromCodigo(TipoAgravos.class, codigo, null);
    }
}