package model;

public abstract class Notificacao {
    protected String numero;
    protected TipoAgravos agravo;
    protected DadosGerais dadosGerais;
    protected DadosInvestigador dadosInvestigador;
    protected DadosPaciente dadosPaciente;
    protected DadosResidenciais dadosResidenciais;

    public Notificacao(
        DadosGerais dadosGerais,
        DadosInvestigador dadosInvestigador,
        DadosPaciente dadosPaciente,
        DadosResidenciais dadosResidenciais) {
        
        this.dadosGerais = dadosGerais;
        this.dadosInvestigador = dadosInvestigador;
        this.dadosPaciente = dadosPaciente;
        this.dadosResidenciais = dadosResidenciais;
    }
}