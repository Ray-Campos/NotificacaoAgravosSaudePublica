package model;

import enums;

public class NotificacaoHanseniase extends Notificacao {
    private String numeroProntuario;
    private String ocupacao;
    private Integer numeroLesoes;
    private FormaClinica formaClinica;

    public NotificacaoHanseniase(
        DadosGerais dadosGerais, 
        DadosPaciente dadosPaciente, 
        DadosResidenciais dadosResidenciais){

        super(dadosGerais, dadosPaciente, dadosResidenciais);
    }
}