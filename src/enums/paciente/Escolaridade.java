package enums.paciente;

import enums.EnumInterface;
import util.EnumUtil;

public enum Escolaridade implements EnumInterface{
    ANALFABETO(0, "Analfabeto"),
    PRIMARIO_INCOMPLETO(1, "1ª a 4ª série incompleta"),
    PRIMARIO_COMPLETO(2, "4ª série completa"),
    FUNDAMENTAL_IMCOMPLETO(3, "5ª à 8ª série incompleta"),
    FUNDAMENTAL_COMPLETO(4, "Ensino fundamental completo"),
    MEDIO_INCOMPLETO(5, "Ensino médio incompleto"),
    MEDIO_COMPLETO(6, "Ensino médio completo"),
    SUPERIOR_INCOMPLETO(7, "Educação superior incompleta"),
    SUPERIOR_COMPLETO(8, "Educação superior completa"),
    IGNORADO(9, "Ignorado"),
    NAO_APLICA(10, "Não se aplica");

    private final int codigo;
    private final String descricao;

    Escolaridade(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @Override
    public int getCodigo() {return codigo;}

    @Override
    public String getDescricao() {return descricao;}

    @Deprecated
    public static Escolaridade getEscolaridade(int codigo) {
        return EnumUtil.getFromCodigo(Escolaridade.class, codigo, NAO_APLICA);
    }
}