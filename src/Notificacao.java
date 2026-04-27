public class Notificacao {

    private String tipoNotificacao;;
    private String mensagem;



    //constructor
    public Notificacao(){

    }

    public Notificacao(String tipoNotificacao, String mensagem) {
        this.tipoNotificacao = tipoNotificacao;
        this.mensagem = mensagem;
    }

    //Getters

    public String getTipoNotificacao(){
        return tipoNotificacao;
    }

    public String getMensagem(){
        return mensagem;
    }



    //Setters

    public void setTipoNotificacao(String tipoNotificacao){
        this.tipoNotificacao = tipoNotificacao;
    }

    public void setMensagem(String mensagem){
        this.mensagem = mensagem;
    }


    //Metodos

    public void enviar(){

    }


    //toString


    @Override
    public String toString() {
        return "Notificacao{" +
                "tipoNotificacao='" + tipoNotificacao + '\'' +
                ", mensagem='" + mensagem + '\'' +
                '}';
    }
}
