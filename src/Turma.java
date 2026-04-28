import java.util.ArrayList;

public class Turma {
    private String nome;


    //Agregações
    private ArrayList<Aluno> alunosInscritos;
    private ArrayList<Aula> aulas;
    private Modalidade modalidade;

    public Turma(String nome, ArrayList<Aluno> alunosInscritos, ArrayList<Aula> aulas, Modalidade modalidade) {
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

    public ArrayList<Aluno> getAlunosInscritos() {
        return alunosInscritos;
    }

    public void setAlunosInscritos(ArrayList<Aluno> alunosInscritos) {
        this.alunosInscritos = alunosInscritos;
    }

    public ArrayList<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(ArrayList<Aula> aulas) {
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
        return "Turma{" +
                "nome='" + nome + '\'' +
                ", alunosInscritos=" + alunosInscritos +
                ", aulas=" + aulas +
                ", modalidade=" + modalidade +
                '}';
    }

    public void criarTurma(){}
    public void inscreverAluno(Aluno aluno){}
}
