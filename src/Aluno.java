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

}
