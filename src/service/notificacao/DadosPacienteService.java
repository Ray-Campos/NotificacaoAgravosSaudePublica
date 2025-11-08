package service.notificacao;

import util.*;
import java.time.LocalDate;
import model.DadosPaciente;
import enums.paciente.*;

public class DadosPacienteService {
    public static DadosPaciente cadastrar() {
        System.out.printf("\n----- Dados do Paciente -----\n");

        String nomePaciente = ValidationUtil.getStringValido("Nome do Paciente: ");
        LocalDate dataNascimento = ValidationUtil.getDate("Data de Nascimento ");
        Integer idade = ValidationUtil.getInt("Idade: ");
        Sexo sexo = EnumUtil.escolherEnum(Sexo.class, "Sexo");
        Gestante gestante = EnumUtil.escolherEnum(Gestante.class, "Gestante");
        Raca raca = EnumUtil.escolherEnum(Raca.class, "Raça/Cor");
        Escolaridade escolaridade = EnumUtil.escolherEnum(Escolaridade.class, "Escolaridade");
        String cartaoSus = ValidationUtil.getStringValido("Número do Cartão SUS: ");
        String nomeMae = ValidationUtil.getStringValido("Nome da mãe: ");

        return new DadosPaciente(
            nomePaciente,
            dataNascimento,
            idade,
            sexo,
            gestante,
            raca,
            escolaridade,
            cartaoSus,
            nomeMae);
    }
}
