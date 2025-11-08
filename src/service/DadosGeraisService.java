package service;

import util.*;
import java.time.LocalDate;
import enums.agravos.TipoAgravos;
import model.DadosGerais;

public class DadosGeraisService {
    public static DadosGerais cadastrar() {
        System.out.printf("\n----- Dados Gerais -----\n");

        String tipoNotificacao = "Individual"; //MAKE IT AUTOFILL LATER!!!!!!!
        TipoAgravos agravo = EnumUtil.escolherEnum(TipoAgravos.class);
        String codigoCID10 = ""; //randomize later LOOK HERE!!!!
        LocalDate dataNotificacao = ValidationUtil.getDate("Data de notificação ");
        String uf = ValidationUtil.getStringValido("Unidade Federativa: ");
        String municipioNotificacao = ValidationUtil.getStringValido("Município de Notificação: ");
        String codigoIBGE = ValidationUtil.getString("Código (IBGE): ");
        String us = ValidationUtil.getStringValido("Unidade de Saúde (ou outra fonte notificadora): ");
        String usCodigo = ValidationUtil.getString("Código da Unidade de Saúde: ");
        LocalDate dataDiagnostico = ValidationUtil.getDate("Data do Diagnóstico ");

        return new DadosGerais(
            tipoNotificacao, 
            agravo, 
            codigoCID10, 
            dataNotificacao, 
            uf, 
            municipioNotificacao,
            codigoIBGE,
            us,
            usCodigo,
            dataDiagnostico);
    }
}
