package model;

import enums.agravos.hanseniase.FormaClinica;

public class NotificacaoHanseniase extends Notificacao {
    private String numeroProntuario;
    private String ocupacao;
    private Integer numeroLesoes;
    private FormaClinica formaClinica;

    public NotificacaoHanseniase(
        DadosGerais dadosGerais,
        DadosInvestigador dadosInvestigador, 
        DadosPaciente dadosPaciente, 
        DadosResidenciais dadosResidenciais,
        Conclusao conclusao){

        super(dadosGerais, dadosInvestigador, dadosPaciente, dadosResidenciais, conclusao);
    }
}