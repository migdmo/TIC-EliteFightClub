import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{

    private int idade;
    private float peso;
    private float altura;
    private float valorMensalidade;
    private String graduacao;


    //Associações Simples
    private Professor professor;
    private ArrayList<Turma> turmas;

    //Composições
    private ArrayList<Notificacao> notificacoes;
    private ArrayList<Evolucao> evolucoes;
    private ArrayList<Presenca> presencas;
    private ArrayList<Financeiro> financeiros;

    public Aluno(){

    }

    public Aluno(String cpf, String nome, int idade, float peso, float altura, float valorMensalidade, String graduacao, Professor professor, ArrayList<Turma> turmas){
        super(cpf, nome);
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.valorMensalidade = valorMensalidade;
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
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(float valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Turma> getTurmas() {
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
    public void adicionarPresenca(String data, String hora, String foto){
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
    public String exibirIdentificacao(){
        return "";
    }
    @Override
    public String toString() {
        return "Aluno{" +
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

}
