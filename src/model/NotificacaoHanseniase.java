package model;

import java.time.LocalDate;
import enums.agravos.hanseniase.*;

public class NotificacaoHanseniase extends Notificacao {
    private String numeroProntuario;
    private String ocupacao;
    private Integer numeroLesoes;
    private FormaClinica formaClinica;
    private ClassificacaoOperacional classificacaoOperacional;
    private Integer numeroNervos;
    private GrauIncapacidade grauIncapacidade;
    private ModoEntrada modoEntrada;
    private ModoDeteccaoCaso modoDeteccaoCaso;
    private Baciloscopia baciloscopia;
    private LocalDate dataInicioTratamento;
    private EsquemaTerapeutico esquemaTerapeutico;
    private Integer numeroContatosRegistrados;

    public NotificacaoHanseniase() {}

    public NotificacaoHanseniase(
        DadosGerais dadosGerais,
        DadosInvestigador dadosInvestigador,
        DadosPaciente dadosPaciente, 
        DadosResidenciais dadosResidenciais,
        Conclusao conclusao,
        String numeroProntuario,
        String ocupacao,
        Integer numeroLesoes,
        FormaClinica formaClinica,
        ClassificacaoOperacional classificacaoOperacional,
        Integer numeroNervos,
        GrauIncapacidade grauIncapacidade,
        ModoEntrada modoEntrada,
        ModoDeteccaoCaso modoDeteccaoCaso,
        Baciloscopia baciloscopia,
        LocalDate dataInicioTratamento,
        EsquemaTerapeutico esquemaTerapeutico,
        Integer numeroContatosRegistrados){

        super(dadosGerais, dadosInvestigador, dadosPaciente, dadosResidenciais, conclusao);
        this.numeroProntuario = numeroProntuario;
        this.ocupacao = ocupacao;
        this.numeroLesoes = numeroLesoes;
        this.formaClinica = formaClinica;
        this.classificacaoOperacional = classificacaoOperacional;
        this.numeroNervos = numeroNervos;
        this.grauIncapacidade = grauIncapacidade;
        this.modoEntrada = modoEntrada;
        this.modoDeteccaoCaso = modoDeteccaoCaso;
        this.baciloscopia = baciloscopia;
        this.dataInicioTratamento = dataInicioTratamento;
        this.esquemaTerapeutico = esquemaTerapeutico;
        this.numeroContatosRegistrados = numeroContatosRegistrados;
    }

    public String getNumeroProntuario() {
        return numeroProntuario;
    } 
    
    public void setNumeroProntuario(String numeroProntuario) {
        this.numeroProntuario = numeroProntuario;
    }
    
    public String getOcupacao() {
        return ocupacao;
    } 
    
    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public Integer getNumeroLesoes() {
        return numeroLesoes;
    } 
    
    public void setNumeroLesoes(Integer numeroLesoes) {
        this.numeroLesoes = numeroLesoes;
    }

    public FormaClinica getFormaClinica() {
        return formaClinica;
    } 
    
    public void setFormaClinica(FormaClinica formaClinica) {
        this.formaClinica = formaClinica;
    }
    
    public ClassificacaoOperacional getClassificacaoOperacional() {
        return classificacaoOperacional;
    } 
    
    public void setClassificacaoOperacional(ClassificacaoOperacional classificacaoOperacional) {
        this.classificacaoOperacional = classificacaoOperacional;
    }
    
    public Integer getNumeroNervos() { 
        return numeroNervos; 
    } 
    
    public void setNumeroNervos(Integer numeroNervos) { 
        this.numeroNervos = numeroNervos; 
    }
    
    public GrauIncapacidade getGrauIncapacidade() { 
        return grauIncapacidade; 
    } 
    public void setGrauIncapacidade(GrauIncapacidade grauIncapacidade) { 
        this.grauIncapacidade = grauIncapacidade; 
    }
   
    public ModoEntrada getModoEntrada() { 
        return modoEntrada; 
    } 
    
    public void setModoEntrada(ModoEntrada modoEntrada) { 
        this.modoEntrada = modoEntrada; 
    }
    
    public ModoDeteccaoCaso getModoDeteccaoCaso() { 
        return modoDeteccaoCaso; 
    } 
    
    public void setModoDeteccaoCaso(ModoDeteccaoCaso modoDeteccaoCaso) { 
        this.modoDeteccaoCaso = modoDeteccaoCaso; 
    }
    
    public Baciloscopia getBaciloscopia() { 
        return baciloscopia; 
    } 
    
    public void setBaciloscopia(Baciloscopia baciloscopia) { 
        this.baciloscopia = baciloscopia; 
    }
    
    public LocalDate getDataInicioTratamento() { 
        return dataInicioTratamento; 
    } 
    
    public void setDataInicioTratamento(LocalDate dataInicioTratamento) { 
        this.dataInicioTratamento = dataInicioTratamento; 
    }
    
    public EsquemaTerapeutico getEsquemaTerapeutico() { 
        return esquemaTerapeutico; 
    } 
    
    public void setEsquemaTerapeutico(EsquemaTerapeutico esquemaTerapeutico) { 
        this.esquemaTerapeutico = esquemaTerapeutico; 
    }
    
    public Integer getNumeroContatosRegistrados() { 
        return numeroContatosRegistrados; 
    } 
    
    public void setNumeroContatosRegistrados(Integer numeroContatosRegistrados) { 
        this.numeroContatosRegistrados = numeroContatosRegistrados; 
    }
}