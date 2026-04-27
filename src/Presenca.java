public class Presenca {
    private String data;
    private String hora;
    private String foto;

    //constructor

    public Presenca(){

    }


    //Getters

    public String getData(){
        return data;
    }

    public String getHora(){
        return hora;
    }

    public String getFoto(){
        return foto;
    }

    //Setters

    public void setData(String data){
        this.data = data;
    }


    public void setHora(String hora){
        this.hora = hora;
    }


    public void setFoto(String foto){
        this.foto = foto;
    }



    //metodos

    public void registrar(){


    }


    //toString


    @Override
    public String toString() {
        return "Presenca{" +
                "data='" + data + '\'' +
                ", hora='" + hora + '\'' +
                ", foto='" + foto + '\'' +
                '}';
    }
}
