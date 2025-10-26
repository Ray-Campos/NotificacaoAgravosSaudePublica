package model;

import enums.*;
import java.time.LocalDate;

public class DadosPaciente {
    private String nomePaciente;
    private LocalDate dataNascimento;
    private Integer idade;
    private Sexo sexo;
    private Gestante gestante;
    private Raca raca;
    private Escolaridade escolaridade;
    private String cartaoSus;
    private String nomeMae;

    public DadosPaciente() {}

    public DadosPaciente(
        String nomePaciente,
        LocalDate dataNascimento,
        Integer idade,
        Sexo sexo,
        Gestante gestante,
        Raca raca,
        Escolaridade escolaridade,
        String cartaoSus,
        String nomeMae) {

        this.nomePaciente = nomePaciente;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
        this.sexo = sexo;
        this.gestante = gestante;
        this.raca = raca;
        this.escolaridade = escolaridade;
        this.cartaoSus = cartaoSus;
        this.nomeMae = nomeMae;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Gestante getGestante() {
        return gestante;
    }

    public void setGestante(Gestante gestante) {
        this.gestante = gestante;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getCartaoSus() {
        return cartaoSus;
    }

    public void setCartaoSus(String cartaoSus) {
        this.cartaoSus = cartaoSus;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }
}