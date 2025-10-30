package model;

public class NotificacaoHanseniase extends Notificacao {
    private String numeroProntuario;
    private String ocupacao;
    private Integer numeroLesoes;
    private FormaClinica formaClinica;

    public NotificacaoHanseniase(
        DadosGerais dadosGerais,
        DadosInvestigador dadosInvestigador, 
        DadosPaciente dadosPaciente, 
        DadosResidenciais dadosResidenciais){

        super(dadosGerais, dadosInvestigador, dadosPaciente, dadosResidenciais);
    }
}