package br.com.elitefightclub.aula;

import br.com.elitefightclub.pessoa.Professor;
import br.com.elitefightclub.shared.Modalidade;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Aula {

    private LocalDate data;
    private LocalTime horarioInicio;
    private int duracaoMinutos;
    private boolean presente;
    private String observacao;


    //Agregações
    private Professor professor;
    private Modalidade modalidade;

    public Aula(LocalDate data, LocalTime horarioInicio, int duracaoMinutos, boolean presente, String observacao, Professor professor, Modalidade modalidade){
        this.data = data;
        this.horarioInicio = horarioInicio;
        this.duracaoMinutos = duracaoMinutos;
        this.presente = presente;
        this.observacao = observacao;
        this.professor = professor;
        this.modalidade = modalidade;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(LocalTime horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    @Override
    public String toString() {
        return "br.com.elitefightclub.aula.Aula{" +
                "data=" + data +
                ", horarioInicio=" + horarioInicio +
                ", duracaoMinutos=" + duracaoMinutos +
                ", presente=" + presente +
                ", observacao='" + observacao + '\'' +
                ", professor=" + professor +
                ", modalidade=" + modalidade +
                '}';
    }
    public void cadastrar(){}
    public void atualizarDados(){}
    // Retorna os horários da modalidade dessa aula
    public List<Horario> getHorarios() {
        return modalidade.getHorarios();
    }
}
