package br.com.elitefightclub.relatorio;

public class Relatorio {
    private String periodo;
    private String tipoRelatorio;

    //constructor
    public Relatorio(){

    }


    //Getter
    public String getPeriodo(){
        return periodo;
    }

    public String getTipoRelatorio(){
        return tipoRelatorio;
    }


    //Setter
    public void setPeriodo(String periodo){
        this.periodo = periodo;
    }

    public void setTipoRelatorio(String tipoRelatorio){
        this.tipoRelatorio = tipoRelatorio;
    }


    //metodos

    public void gerar(){


    }


    public void exportarExcel(){


    }


    //toString

    @Override
    public String toString() {
        return "br.com.elitefightclub.relatorio.Relatorio{" +
                "periodo='" + periodo + '\'' +
                ", tipoRelatorio='" + tipoRelatorio + '\'' +
                '}';
    }
}
