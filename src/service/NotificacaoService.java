package service;

import service.notificacao.*;
import enums.agravos.TipoAgravos;
import model.*;
import util.*;

public class NotificacaoService {
    public static Notificacao cadastrar() {
        System.out.printf("\n---------- Ficha de Notificação ----------\n");

        String numero = ValidationUtil.getStringValido("Número da Notificação: ");
        TipoAgravos agravo = EnumUtil.escolherEnum(TipoAgravos.class, "Tipo do Agravo");
        DadosGerais dadosGerais = DadosGeraisService.cadastrar();
        DadosPaciente dadosPaciente = DadosPacienteService.cadastrar();
        DadosResidenciais dadosResidenciais = DadosResidenciaisService.cadastrar();
        DadosInvestigador dadosInvestigador = DadosInvestigadorService.cadastrar();
        Conclusao conclusao = ConclusaoService.cadastrar();

        return new Notificacao(
            numero,
            agravo,
            dadosGerais,
            dadosPaciente,
            dadosResidenciais,
            dadosInvestigador,
            conclusao);
    }
}
