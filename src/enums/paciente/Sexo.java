package enums.paciente;

import enums.EnumInterface;
import util.EnumUtil;

public enum Sexo implements EnumInterface{
    MASCULINO(1, "Masculino"),
    FEMININO(2, "Feminino"),
    IGNORADO(9, "Ignorado");

    private final int codigo;
    private final String descricao;
    
    Sexo(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    @Override
    public int getCodigo() {return codigo;}

    @Override
    public String getDescricao() {
        return descricao;
    }

    public static Sexo getSexo(int codigo) {
        return EnumUtil.getFromCodigo(Sexo.class, codigo, IGNORADO);
    }
}