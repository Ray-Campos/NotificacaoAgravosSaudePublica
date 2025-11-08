package service;

import util.*;
import model.DadosInvestigador;

public class DadosInvestigadorService {
    public static DadosInvestigador cadastrar() {
        System.out.printf("\n----- Dados do Investigador -----\n");

        String municipioUs = ValidationUtil.getStringValido("Município/Unidade de Saúde: ");
        String codigoUnidadeSaude = ValidationUtil.getStringValido("Código da Unid. de Saúde: ");
        String nome = ValidationUtil.getStringValido("Nome do Investigador: ");
        String funcao = ValidationUtil.getStringValido("Função: ");

        return new DadosInvestigador(municipioUs, codigoUnidadeSaude, nome, funcao);
    }
}
