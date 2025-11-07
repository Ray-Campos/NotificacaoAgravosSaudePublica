package model;

import java.time.LocalDate;

import enums.conclusao.*;

public class Conclusao {
    private ClassificacaoFinal classificacaoFinal;
    private Autoctone autoctone;
    private String ufInfeccao;
    private String paisInfeccao;
    private String municipioInfeccao;
    private String codigoIbge;
    private String distrito;
    private String bairro;
    private String localidadeInfeccao;
    private LocalDate dataEncerramento;
    private String observacaoAdicional;

    public Conclusao() {}

    public Conclusao(
        ClassificacaoFinal classificacaoFinal,
        Autoctone autoctone,
        String ufInfeccao,
        String paisInfeccao,
        String municipioInfeccao,
        String codigoIbge,
        String distrito,
        String bairro,
        String localidadeInfeccao,
        LocalDate dataEncerramento,
        String observacaoAdicional) {

        this.classificacaoFinal = classificacaoFinal;
        this.autoctone = autoctone;
        this.ufInfeccao = ufInfeccao;
        this.paisInfeccao = paisInfeccao;
        this.municipioInfeccao = municipioInfeccao;
        this.codigoIbge = codigoIbge;
        this.distrito = distrito;
        this.bairro = bairro;
        this.localidadeInfeccao = localidadeInfeccao;
        this.dataEncerramento = dataEncerramento;
        this.observacaoAdicional = observacaoAdicional;
    }

    public ClassificacaoFinal getClassificacaoFinal() {
        return classificacaoFinal;
    }

    public void setClassificacaoFinal(ClassificacaoFinal classificacaoFinal) {
        this.classificacaoFinal = classificacaoFinal;
    }

    public Autoctone getAutoctone() {
        return autoctone;
    }

    public void setAutoctone(Autoctone autoctone) {
        this.autoctone = autoctone;
    }

    public String getUfInfeccao() {
        return ufInfeccao;
    }

    public void setUfInfeccao(String ufInfeccao) {
        this.ufInfeccao = ufInfeccao;
    }

    public String getPaisInfeccao() {
        return paisInfeccao;
    }

    public void setPaisInfeccao(String paisInfeccao) {
        this.paisInfeccao = paisInfeccao;
    }

    public String getMunicipioInfeccao() {
        return municipioInfeccao;
    }

    public void setMunicipioInfeccao(String municipioInfeccao) {
        this.municipioInfeccao = municipioInfeccao;
    }

    public String getCodigoIbge() {
        return codigoIbge;
    }

    public void setCodigoIbge(String codigoIbge) {
        this.codigoIbge = codigoIbge;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidadeInfeccao() {
        return localidadeInfeccao;
    }

    public void setLocalidadeInfeccao(String localidadeInfeccao) {
        this.localidadeInfeccao = localidadeInfeccao;
    }

    public LocalDate getDataEncerramento() {
        return dataEncerramento;
    }

    public void setDataEncerramento(LocalDate dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
    }

    public String getObservacaoAdicional() {
        return observacaoAdicional;
    }

    public void setObservacaoAdicional(String observacaoAdicional) {
        this.observacaoAdicional = observacaoAdicional;
    }
}
