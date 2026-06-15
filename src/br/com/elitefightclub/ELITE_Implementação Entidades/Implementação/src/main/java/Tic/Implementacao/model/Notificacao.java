package Tic.Implementacao.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import org.aspectj.weaver.ast.Not;
import org.hibernate.tool.schema.spi.SchemaTruncator;

import java.time.LocalTime;



@Entity
@Table(name = "notificação")
public class Notificacao    {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tipoNotificacao;


    @Column(nullable = false)
    private String mensagem;

    public Notificacao(){

    }

    public Notificacao(String tipoNotificacao, String mensagem){
        this.tipoNotificacao = tipoNotificacao;
        this.mensagem = mensagem;
    }

    public Long getId() {
        return id;
    }


    public String getTipoNotificacao() {
        return tipoNotificacao;
    }

    public void setTipoNotificacao(String tipoNotificacao) {
        this.tipoNotificacao = tipoNotificacao;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void enviar(){}
}



