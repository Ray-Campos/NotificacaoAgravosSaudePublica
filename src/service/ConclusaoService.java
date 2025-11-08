package service;

import model.Conclusao;
import enums.conclusao.*;
import java.time.LocalDate;
import util.*;

public class ConclusaoService {
    public static Conclusao cadastrar() {
        System.out.printf("\n----- Conclusão -----\n");
        
        ClassificacaoFinal classificacaoFinal = EnumUtil.escolherEnum(ClassificacaoFinal.class, "Classificação Final");
        Autoctone autoctone = EnumUtil.escolherEnum(Autoctone.class, "O caso é autóctone do município de residência?");
        String ufInfeccao = ValidationUtil.getStringValido("UF provável de infecção: ");
        String paisInfeccao = ValidationUtil.getStringValido("País provável de infecção: ");
        String municipioInfeccao = ValidationUtil.getStringValido("Município provável da infecção: ");
        String codigoIbge = ValidationUtil.getString("Código (IBGE): ");
        String distrito = ValidationUtil.getStringValido("Distrito: ");
        String bairro = ValidationUtil.getStringValido("Bairro: ");
        String localidadeInfeccao = ValidationUtil.getStringValido("Localidade provável da infecção: ");
        LocalDate dataEncerramento = ValidationUtil.getDate("Data de Encerramento");
        String observacaoAdicional = ValidationUtil.getString("Observações adicionais: ");

        return new Conclusao(
            classificacaoFinal,
            autoctone,
            ufInfeccao,
            paisInfeccao,
            municipioInfeccao,
            codigoIbge,
            distrito,
            bairro,
            localidadeInfeccao,
            dataEncerramento,
            observacaoAdicional);
    }
}
