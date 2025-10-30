package model;

import enums.residenciais.*;

public class DadosResidenciais {
    private String uf;
    private String municipio;
    private String codigoIbge;
    private String distrito;
    private String bairro;
    private String logradouro;
    private String codigoLogradouro;
    private String numero;
    private String complemento;
    private String geoCampo1;
    private String geoCampo2;
    private String pontoReferencia;
    private String cep;
    private String telefone;
    private Zona zona;
    private String pais;

    public DadosResidenciais() {}

    public DadosResidenciais(
        String uf,
        String municipio,
        String codigoIbge,
        String distrito,
        String bairro,
        String logradouro,
        String codigoLogradouro,
        String numero,
        String complemento,
        String geoCampo1,
        String geoCampo2,
        String pontoReferencia,
        String cep,
        String telefone,
        Zona zona,
        String pais) {

        this.uf = uf;
        this.municipio = municipio;
        this.codigoIbge = codigoIbge;
        this.distrito = distrito;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.codigoLogradouro = codigoLogradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.geoCampo1 = geoCampo1;
        this.geoCampo2 = geoCampo2;
        this.pontoReferencia = pontoReferencia;
        this.cep = cep;
        this.telefone = telefone;
        this.zona = zona;
        this.pais = pais;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
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

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCodigoLogradouro() {
        return codigoLogradouro;
    }

    public void setCodigoLogradouro(String codigoLogradouro) {
        this.codigoLogradouro = codigoLogradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getGeoCampo1() {
        return geoCampo1;
    }

    public void setGeoCampo1(String geoCampo1) {
        this.geoCampo1 = geoCampo1;
    }

    public String getGeoCampo2() {
        return geoCampo2;
    }

    public void setGeoCampo2(String geoCampo2) {
        this.geoCampo2 = geoCampo2;
    }

    public String getPontoReferencia() {
        return pontoReferencia;
    }

    public void setPontoReferencia(String pontoReferencia) {
        this.pontoReferencia = pontoReferencia;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}