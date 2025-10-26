package model;

import enums;

public abstract class Notificacao {
    protected String numero;
    protected TipoAgravos agravo;
    protected DadosGerais dadosGerais;
    protected DadosPaciente dadosPaciente;
    protected DadosResidenciais dadosResidenciais;

    public Notificacao(
        DadosGerais dadosGerais,
        DadosPaciente dadosPaciente,
        DadosResidenciais dadosResidenciais) {
        
        this.dadosGerais = dadosGerais;
        this.dadosPaciente = dadosPaciente;
        this.dadosResidenciais = dadosResidenciais;
    }

    public abstract TipoAgravos getTipoAgravos();
}