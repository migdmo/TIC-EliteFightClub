public class Professor extends Pessoa {

    private String especialidade, contato;


    public Professor(){

    }

    public Professor(String cpf, String nome, String especialidade, String contato){
        super(cpf, nome);
        this.especialidade = especialidade;
        this.contato = contato;
    }

    //Getters e Setters
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
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
        return "Professor{" +
                super.toString() +
                "especialidade='" + especialidade + '\'' +
                ", contato='" + contato + '\'' +
                '}';
    }
}
