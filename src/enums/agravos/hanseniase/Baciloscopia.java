package enums.agravos.hanseniase;

import enums.EnumInterface;
import util.EnumUtil;

public enum Baciloscopia implements EnumInterface {
    POSITIVA(1, "Positiva"),
    NEGATIVA(2, "Negativa"),
    NAO_REALIZADA(3, "Não realizada"),
    IGNORADO(9, "Ignorado");

    private final int codigo;
    private final String descricao;

    Baciloscopia(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @Override
    public int getCodigo() {return codigo;}

    @Override
    public String getDescricao() {return descricao;}

    public static Baciloscopia getBaciloscopia(int codigo) {
        return EnumUtil.getFromCodigo(Baciloscopia.class, codigo, IGNORADO);
    }
}
