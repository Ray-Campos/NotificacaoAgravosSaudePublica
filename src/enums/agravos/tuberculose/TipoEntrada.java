package enums.agravos.tuberculose;

import enums.EnumInterface;
import util.EnumUtil;

public enum TipoEntrada implements EnumInterface{
    CASO_NOVO(1, "Caso novo"),
    RECIDIVA(2, "Recidiva"),
    REINGRESSO_ABONDONO(3, "Reingresso Após Abandono"),
    NAO_SABE(4, "Não sabe"),
    TRANSFERENCIA(5, "Transferência"),
    POS_OBITO(6, "Pós-óbito");

    private final int codigo;
    private final String descricao;

    TipoEntrada(int codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {return codigo;}

    public String getDescricao() {return descricao;}

    public static TipoEntrada getTipoEntrada(int codigo) {
        return EnumUtil.getFromCodigo(TipoEntrada.class, codigo, NAO_SABE);
    }
}
