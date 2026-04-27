public class Evolucao {
    private float pesoAtual;
    private float bioimpedancia;
    private String dataAvaliacao;


    //constructor
    public Evolucao(){

    }



    //GEtters

    public float getPesoAtual(){
        return  pesoAtual;
    }

    public float getBioimpedancia(){
        return bioimpedancia;
    }

    public String getDataAvaliacao(){
        return dataAvaliacao;
    }


    //SEtters

    public void setPesoAtual(float pesoAtual){
        this.pesoAtual = pesoAtual;
    }

    public void setBioimpedancia(float bioimpedancia){
        this.bioimpedancia = bioimpedancia;
    }

    public void setDataAvaliacao(String dataAvaliacao){
        this.dataAvaliacao = dataAvaliacao;
    }

    //Metodos

    public void registrar(){

    }



    //toString


    @Override
    public String toString() {
        return "Evolucao{" +
                "pesoAtual=" + pesoAtual +
                ", bioimpedancia=" + bioimpedancia +
                ", dataAvaliacao='" + dataAvaliacao + '\'' +
                '}';
    }
}
