package enums.agravos.hanseniase;

import enums.EnumInterface;
import util.EnumUtil;

public enum ModoEntrada implements EnumInterface {
    CASO_NOVO(1, "Caso Novo"),
    TRANSFERENCIA_MESMO_MUNICIPIO(2, "Transferência do mesmo município (outra unidade)"),
    TRANSFERENCIA_OUTRO_MUNICIPIO(3, "Transferência de Outro Município (mesma UF)"),
    TRANSFERENCIA_OUTRO_ESTADO(4, "Transferência de Outro Estado"),
    TRANSFERENCIA_OUTRO_PAIS(5, "Transferência de Outro País"),
    RECIDIVA(6, "Recidiva"),
    OUTROS_REINGRESSOS(7, "Outros Reingressos"),
    IGNORADO(9, "Ignorado");

    private final int codigo;
    private final String descricao;

    ModoEntrada(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @Override
    public int getCodigo() {return codigo;}

    @Override
    public String getDescricao() {return descricao;}

    public static ModoEntrada getModoEntrada(int codigo) {
        return EnumUtil.getFromCodigo(ModoEntrada.class, codigo, IGNORADO);
    }
}