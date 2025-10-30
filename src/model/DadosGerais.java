package model;

import enums.agravos.TipoAgravos;
import java.time.LocalDate;

public class DadosGerais {
    private String tipoNotificacao;
    private TipoAgravos agravo;
    private String codigoCID10;
    private LocalDate dataNotificacao;
    private String uf;
    private String municipioNotificacao;
    private String codigoIBGE;
    private String us;
    private String usCodigo;
    private LocalDate dataDiagnostico;

    public DadosGerais() {}

    public DadosGerais(
        String tipoNotificacao, 
        TipoAgravos agravo, 
        String codigoCID10,
        LocalDate dataNotificacao, 
        String uf, 
        String municipioNotificacao,
        String codigoIBGE, 
        String us,
        String usCodigo, 
        LocalDate dataDiagnostico) {
        
        this.tipoNotificacao = tipoNotificacao;
        this.agravo = agravo;
        this.codigoCID10 = codigoCID10;
        this.dataNotificacao = dataNotificacao;
        this.uf = uf;
        this.municipioNotificacao = municipioNotificacao;
        this.codigoIBGE = codigoIBGE;
        this.us = us;
        this.usCodigo = usCodigo;
        this.dataDiagnostico = dataDiagnostico;
    }

    public String getTipoNotificacao() {
    return tipoNotificacao;
    }

    public void setTipoNotificacao(String tipoNotificacao) {
        this.tipoNotificacao = tipoNotificacao;
    }

    public TipoAgravos getAgravo() {
        return agravo;
    }

    public void setAgravo(TipoAgravos agravo) {
        this.agravo = agravo;
    }

    public String getCodigoCID10() {
        return codigoCID10;
    }

    public void setCodigoCID10(String codigoCID10) {
        this.codigoCID10 = codigoCID10;
    }

    public LocalDate getDataNotificacao() {
        return dataNotificacao;
    }

    public void setDataNotificacao(LocalDate dataNotificacao) {
        this.dataNotificacao = dataNotificacao;
    }

    public String getUf() {
        return uf;
    }

    public void setUF(String uf) {
        this.uf = uf;
    }

    public String getMunicipioNotificacao() {
        return municipioNotificacao;
    }

    public void setMunicipioNotificacao(String municipioNotificacao) {
        this.municipioNotificacao = municipioNotificacao;
    }

    public String getCodigoIBGE() {
        return codigoIBGE;
    }

    public void setCodigoIBGE(String codigoIBGE) {
        this.codigoIBGE = codigoIBGE;
    }

    public String getUs() {
        return us;
    }

    public void setUS(String us) {
        this.us = us;
    }

    public String getUsCodigo() {
        return usCodigo;
    }

    public void setUsCodigo(String usCodigo) {
        this.usCodigo = usCodigo;
    }

    public LocalDate getDataDiagnostico() {
        return dataDiagnostico;
    }

    public void setDataDiagnostico(LocalDate dataDiagnostico) {
        this.dataDiagnostico = dataDiagnostico;
    }
}