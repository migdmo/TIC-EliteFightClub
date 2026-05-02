package br.com.elitefightclub.pessoa;

import br.com.elitefightclub.acompanhamento.Evolucao;
import br.com.elitefightclub.acompanhamento.Presenca;
import br.com.elitefightclub.aula.Aula;
import br.com.elitefightclub.aula.Turma;
import br.com.elitefightclub.financeiro.Financeiro;
import br.com.elitefightclub.notificacao.Notificacao;
import br.com.elitefightclub.shared.Registravel;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa implements Registravel {

    private int idade;
    private float peso;
    private float altura;
    private float valorMensalidade;
    private String graduacao;


    //Associações Simples
    private Professor professor;
    private List<Turma> turmas;

    //Composições
    private List<Notificacao> notificacoes;
    private List<Evolucao> evolucoes;
    private List<Presenca> presencas;
    private List<Financeiro> financeiros;

    public Aluno(){}

    public Aluno(String cpf, String nome, int idade, float peso, float altura, float valorMensalidade, String graduacao, Professor professor, ArrayList<Turma> turmas){
        super(cpf, nome);
        setIdade(idade);
        setPeso(peso);
        setAltura(altura);
        setValorMensalidade(valorMensalidade);
        this.graduacao = graduacao;
        this.professor = professor;
        this.turmas = turmas;
        this.notificacoes = new ArrayList<Notificacao>();
        this.evolucoes = new ArrayList<Evolucao>();
        this.presencas = new ArrayList<Presenca>();
        this.financeiros = new ArrayList<Financeiro>();
    }

    //Getters e Setters
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {

        if(idade <= 0){
            throw new IllegalArgumentException("Idade inválida");
        }
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        if(peso <= 0.0){
            throw new IllegalArgumentException("Peso inválido");
        }
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if(altura <= 0.0){
            throw new IllegalArgumentException("Altura inválida");
        }
        this.altura = altura;
    }

    public float getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(float valorMensalidade) {
        if(valorMensalidade <= 0.0){
            throw new IllegalArgumentException("Mensalidade inválida");
        }
        this.valorMensalidade = valorMensalidade;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        if(graduacao == null || graduacao.isEmpty()){
            throw new IllegalArgumentException("Graduação inválida");
        }
        this.graduacao = graduacao;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurma(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }
    public void adicionarNotificacoes(String tipoNotificacao, String mensagem){
        this.notificacoes.add(new Notificacao(tipoNotificacao, mensagem));
    }
    public void adicionarEvolucao(float pesoAtual, float bioImpedancia, String dataAvaliacao){
        this.evolucoes.add(new Evolucao(pesoAtual, bioImpedancia, dataAvaliacao));
    }
    public void adicionarPresenca(String data, String hora, String foto, Aula aula){
        this.presencas.add(new Presenca(data, hora, foto));
    }
    public void adicionarFinanceiro(float valor, String valorDePlano, float desconto, float taxaExtra, String dataPagamento){
        this.financeiros.add(new Financeiro(valor, valorDePlano, desconto, taxaExtra, dataPagamento));
    }


    //Métodos sobrescritos da Super Classe
    @Override
    public void cadastrar(){}
    @Override
    public void atualizarDados(){}
    @Override
    public String exibirIdentificacao(){return "";}
    @Override
    public String toString() {
        return "br.com.elitefightclub.pessoa.Aluno{" +
                super.toString() +
                "idade=" + idade +
                ", peso=" + peso +
                ", altura=" + altura +
                ", valorMensalidade=" + valorMensalidade +
                ", graduacao='" + graduacao + '\'' +
                ", professor=" + professor +
                ", turmas=" + turmas +
                ", notificacoes=" + notificacoes +
                ", evolucoes=" + evolucoes +
                ", presencas=" + presencas +
                ", financeiros=" + financeiros +
                '}';
    }

    //Métodos de Classe
    public Boolean registrarPresenca(){
        return false;
    }

    public void agendarAula(){}
    public void agendarAulaParticular(){}

    @Override
    public void registrar(){}

}
