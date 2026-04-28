package br.com.elitefightclub.shared;

import br.com.elitefightclub.aula.Horario;

import java.time.LocalTime;
import java.util.ArrayList;

public class Modalidade {
    private String nome;

    //Composição
    private ArrayList<Horario> horarios;

    public Modalidade(String nome){
        this.nome = nome;
        this.horarios = new ArrayList<Horario>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarHorario(String diaSemana, LocalTime horaInicio, LocalTime horaFim, int limiteAlunos){
        this.horarios.add(new Horario(diaSemana, horaInicio, horaFim, limiteAlunos));
    }

    public ArrayList<Horario> getHorarios() {
        return horarios;
    }


    @Override
    public String toString() {
        return "br.com.elitefightclub.shared.Modalidade{" +
                "nome='" + nome + '\'' +
                ", horarios=" + horarios +
                '}';
    }
}
