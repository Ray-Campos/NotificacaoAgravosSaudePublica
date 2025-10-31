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
    }
}