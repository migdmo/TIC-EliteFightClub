package br.com.elitefightclub.aula;

import br.com.elitefightclub.pessoa.Aluno;
import br.com.elitefightclub.pessoa.Professor;
import br.com.elitefightclub.shared.Registravel;

public class AulaParticular implements Registravel {
    private Aluno aluno;
    private Professor professor;
    private String data;
    private String horario;



    //construtor----------------------------------------------
    public AulaParticular(){

    }



    //Getters----------------------------------------------
    public Aluno getAluno() {
        return aluno;
    }


    public Professor getProfessor() {
        return professor;
    }

    public String getData() {
        return data;
    }

    public String getHorario() {
        return horario;
    }



    //SEtters----------------------------------------------
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }


    public void setProfessor(Professor professor) {
        this.professor = professor;
    }


    public void setData(String data) {
        this.data = data;
    }


    public void setHorario(String horario) {
        this.horario = horario;
    }


    //Metodos----------------------------------------------

    public void agendar(){

    }

    public void cancelar(){

    }

    @Override
    public void registrar(){

    }





    //toString----------------------------------------------
    @Override
    public String toString() {
        return "br.com.elitefightclub.aula.AulaParticular{" +
                "aluno=" + aluno +
                ", professor=" + professor +
                ", data='" + data + '\'' +
                ", horario='" + horario + '\'' +
                '}';
    }
}
