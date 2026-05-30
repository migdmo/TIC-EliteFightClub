package Tic.Implementacao.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;

@Entity
@Table(name = "alunos")
public class Aluno extends Pessoa {
    @Id  //indica chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private int idade;

    @Column(nullable = false)
    private float peso;

    @Column(nullable = false)
    private float altura;

    @Column(nullable = false)
    private float valorMensalidade;

    @Column(length = 500)
    private String graduacao;


    public Aluno() {
    }

    public Aluno(String cpf, String nome, int idade, float peso, float altura, float valorMensalidade, String graduacao) {
        super(cpf, nome);
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.valorMensalidade = valorMensalidade;
        this.graduacao = graduacao;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade <= 0) throw new IllegalArgumentException("Idade inválida");
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        if (peso <= 0) throw new IllegalArgumentException("Peso inválido");
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if (altura <= 0) throw new IllegalArgumentException("Altura inválida");
        this.altura = altura;
    }

    public float getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(float valorMensalidade) {
        if (valorMensalidade <= 0) throw new IllegalArgumentException("Mensalidade inválida");
        this.valorMensalidade = valorMensalidade;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        if (graduacao == null || graduacao.isEmpty()) throw new IllegalArgumentException("Graduação inválida");
        this.graduacao = graduacao;
    }



    @Override
    public void cadastrar() {}
    @Override
    public void atualizarDados() {}
    @Override
    public String exibirIdentificacao() { return ""; }





}
