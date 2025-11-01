package model;

import java.time.LocalDate;

import enums.agravos.tuberculose.*;

public class NotificacaoTuberculose extends Notificacao {
    private String numeroProntuario;
    /*private TipoEntrada tipoEntrada;
    private PopulacaoEspecial populacaoEspecial;
    private BeneceficiarioProgamaRenda beneceficiarioProgamaRenda;
    private Forma forma;
    private SeExtrapulmonar seExtrapulmonar;
    private AgravoAssociado agravoAssociado;
    private BaciloscopiaEscarro baciloscopiaEscarro;
    private RadiografiaTorax radiografiaTorax;
    private HIV hiv;
    private TerapiaAntirretroviral terapiaAntirretroviral;
    private Histopatologia histopatologia;
    private Cultura cultura;
    private TesteMolecularRapido testeMolecularRapido;
    private TesteSensibilidade testeSensibilidade;
    private LocalDate dataInicioTratamento;
    private Integer numeroContatosRegistrados;*/

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
