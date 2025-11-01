package model;

import enums.agravos.tuberculose.*;

public class NotificacaoTuberculose extends Notificacao {
    private String numeroProntuario;

    public NotificacaoTuberculose() {}

    public NotificacaoTuberculose(
        DadosGerais dadosGerais,
        DadosInvestigador dadosInvestigador,
        DadosPaciente dadosPaciente,
        DadosResidenciais dadosResidenciais,
        Conclusao conclusao,
        String numeroProntuario) {

        super(dadosGerais, dadosInvestigador, dadosPaciente, dadosResidenciais, conclusao);
        this.numeroProntuario = numeroProntuario;
    }
}
