public class SistemaExterno {
    private String tipoSistema;
    private String dadosFinanceiros;

    //constructor
    public SistemaExterno(){


    }


    //Getter
    public String getTipoSistema(){
        return tipoSistema;
    }

    public String getDadosFinanceiros(){
        return dadosFinanceiros;
    }


    //Setters
    public void setTipoSistema(String tipoSistema){
        this.tipoSistema = tipoSistema;
    }

    public void setDadosFinanceiros(String dadosFinanceiros){
        this.dadosFinanceiros = dadosFinanceiros;
    }


    //metodos
    public void integrar(){

    }


    //toString


    @Override
    public String toString() {
        return "SistemaExterno{" +
                "tipoSistema='" + tipoSistema + '\'' +
                ", dadosFinanceiros='" + dadosFinanceiros + '\'' +
                '}';
    }
}

