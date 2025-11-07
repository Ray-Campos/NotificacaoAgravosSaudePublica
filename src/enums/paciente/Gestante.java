package enums.paciente;

import enums.EnumInterface;
import util.EnumUtil;

public enum Gestante implements EnumInterface{
    PRIMEIRO_TRIMESTRE(1, "1º Trimestre"),
    SEGUNDO_TRIMESTRE(2, "2º Trimestre"),
    TERCEIRO_TRIMESTRE(3, "3º Trimestre"),
    IDADE_IGNORADA(4, "Idade gestacional ignorada"),
    NAO(5, "Não"),
    NAO_APLICA(6, "Não se aplica"),
    IGNORADO(9, "Ignorado");

    private final int codigo;
    private final String descricao;

    Gestante(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @Override
    public int getCodigo() {return codigo;}

    @Override
    public String getDescricao() {return descricao;}

    @Deprecated
    public static Gestante getGestante(int codigo) {
        return EnumUtil.getFromCodigo(Gestante.class, codigo, IGNORADO);
    }
}