package enums.conclusao;

import enums.EnumInterface;
import util.EnumUtil;

public enum Autoctone implements EnumInterface{
    SIM(1, "Sim"),
    NAO(2, "Não"),
    INDETERMINADO(3, "Indeterminado");

    private final int codigo;
    private final String descricao;

    Autoctone(int codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @Override
    public int getCodigo() {return codigo;}

    @Override
    public String getDescricao() {return descricao;}

    public static Autoctone getAutoctone(int codigo){
        return EnumUtil.getFromCodigo(Autoctone.class, codigo, INDETERMINADO);
    }
}
