package br.com.elitefightclub.pessoa;

public abstract class Pessoa {
    protected String cpf, nome;


    public Pessoa() {
    }

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    //Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Métodos abstratos
    public abstract void cadastrar();
    public abstract void atualizarDados();
    public abstract String exibirIdentificacao();

    @Override
    public String toString() {
        return "br.com.elitefightclub.pessoa.Pessoa{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
