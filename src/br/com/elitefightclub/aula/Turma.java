package br.com.elitefightclub.aula;

import br.com.elitefightclub.pessoa.Aluno;
import br.com.elitefightclub.shared.Modalidade;


import java.util.List;

public class Turma {
    private String nome;


    //Agregações
    private List<Aluno> alunosInscritos;
    private List<Aula> aulas;
    private Modalidade modalidade;

    public Turma(String nome, List<Aluno> alunosInscritos, List<Aula> aulas, Modalidade modalidade) {
        this.nome = nome;
        this.alunosInscritos = alunosInscritos;
        this.aulas = aulas;
        this.modalidade = modalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunosInscritos() {
        return alunosInscritos;
    }

    public void setAlunosInscritos(List<Aluno> alunosInscritos) {
        this.alunosInscritos = alunosInscritos;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    @Override
    public String toString() {
        return "br.com.elitefightclub.aula.Turma{" +
                "nome='" + nome + '\'' +
                ", alunosInscritos=" + alunosInscritos +
                ", aulas=" + aulas +
                ", modalidade=" + modalidade +
                '}';
    }

    public void criarTurma(){}
    public void inscreverAluno(Aluno aluno){}
}
