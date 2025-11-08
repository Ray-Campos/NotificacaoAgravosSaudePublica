package service;

import enums.residenciais.*;
import util.*;
import model.DadosResidenciais;

public class DadosResidenciaisService {
    public static DadosResidenciais cadastrar() {
        System.out.printf("\n----- Dados de Residência -----\n");

        String uf = ValidationUtil.getStringValido("Unidade Federativa: ");
        String municipio = ValidationUtil.getStringValido("Município de Residência: ");
        String codigoIbge = ValidationUtil.getString("Código (IBGE): ");
        String distrito = ValidationUtil.getStringValido("Distrito: ");
        String bairro = ValidationUtil.getStringValido("Bairro: ");
        String logradouro = ValidationUtil.getStringValido("Logradouro: ");
        String codigoLogradouro = ValidationUtil.getString("Código do Logradouro: ");
        String numero = ValidationUtil.getStringValido("Número: ");
        String complemento = ValidationUtil.getString("Complemento: ");
        String geoCampo1 = ValidationUtil.getString("Geo campo 1: ");
        String geoCampo2 = ValidationUtil.getString("Geo campo 2: ");
        String pontoReferencia = ValidationUtil.getString("Ponto de Referência: ");
        String cep = ValidationUtil.getStringValido("CEP: ");
        String telefone = ValidationUtil.getString("Telefone: ");
        Zona zona = EnumUtil.escolherEnum(Zona.class, "Zona");
        String pais = ValidationUtil.getString("País (se residente fora  do Brasil): ");

        return new DadosResidenciais(
            uf,
            municipio,
            codigoIbge,
            distrito,
            bairro,
            logradouro,
            codigoLogradouro,
            numero,
            complemento,
            geoCampo1,
            geoCampo2,
            pontoReferencia,
            cep,
            telefone,
            zona,
            pais);
    }
}
