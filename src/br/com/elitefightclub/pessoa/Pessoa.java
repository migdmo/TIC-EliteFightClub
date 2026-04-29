package br.com.elitefightclub.pessoa;

public abstract class Pessoa {
    protected String cpf, nome;


    public Pessoa() {
    }

    public Pessoa(String cpf, String nome) {
        setNome(nome);
        setCpf(cpf);
    }

    //Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf == null || cpf.isBlank()){
            throw new IllegalArgumentException("Cpf não pode ser nulo ou vazio");
        }
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }
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
