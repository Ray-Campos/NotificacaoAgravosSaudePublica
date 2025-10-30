package model;


public class DadosInvestigador {
    private String municipioUs;
    private String codigoUnidadeSaude;
    private String nome;
    private String funcao;

    public DadosInvestigador() {}

    public DadosInvestigador(String municipioUs, String codigoUnidadeSaude, String nome, String funcao){
        this.municipioUs = municipioUs;
        this.codigoUnidadeSaude = codigoUnidadeSaude;
        this.nome = nome;
        this.funcao = funcao;
    }

    public String getMunicipioUs() {
        return municipioUs;
    }

    public void setMunicipioUs(String municipioUs) {
        this.municipioUs = municipioUs;
    }

    public String getCodigoUnidadeSaude() {
        return codigoUnidadeSaude;
    }

    public void setCodigoUnidadeSaude(String codigoUnidadeSaude) {
        this.codigoUnidadeSaude = codigoUnidadeSaude;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }    
}
