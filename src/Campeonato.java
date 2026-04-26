import java.util.List;

public class Campeonato {
    private String nome;
    private String data;
    private String locomocao;
    private float valores;
    private String descricao;
    private List<String> pesosDeLuta;


    //constructor----------------------------------
    public Campeonato(){

    }


    //Getters------------------------------------

    // public, tipo, getMaicusculo() { return }
    public String getNome(){
        return nome;
    }

    public String getData(){
        return data;
    }

    public String getLocomocao(){
        return locomocao;
    }

    public float getValores(){
        return valores;
    }

    public String getDescricao(){
        return descricao;
    }

    public List<String> getPesosDeLuta(){
        return pesosDeLuta;
    }


    //Setters---------------------------------------

    public void setNome(String nome){
        this.nome = nome;
    }


    public void setData(String data){
        this.data = data;
    }

    public void setLocomocao(String locomocao){
        this.locomocao = locomocao;
    }

    public void setValores(float valores){
        this.valores = valores;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setPesosDeLuta(List<String> pesosDeLuta) {
        this.pesosDeLuta = pesosDeLuta;
    }



    //Metodos-------------------------------

    public void cadastrar(){

    }

    public void inscreveraluno(Aluno aluno, String peso){


    }



    //toString


    @Override
    public String toString() {
        return "Campeonato{" +
                "nome='" + nome + '\'' +
                ", data='" + data + '\'' +
                ", locomocao='" + locomocao + '\'' +
                ", valores=" + valores +
                ", descricao='" + descricao + '\'' +
                ", pesosDeLuta=" + pesosDeLuta +
                '}';
    }
}
