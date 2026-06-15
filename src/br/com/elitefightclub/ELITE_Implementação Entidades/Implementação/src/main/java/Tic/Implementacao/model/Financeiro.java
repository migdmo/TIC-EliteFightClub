package Tic.Implementacao.model;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


//LEMBRAR DO RELACIONAMENTO COM ALUNO!!!!
@Entity
@Table(name = "financeiros")
public class Financeiro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Double valor;

    @Column(length = 500)
    private String valorDePlano;

    @Column(nullable = false)
    private Double desconto;

    @Column (nullable = false)
    private Double taxaExtra;

    @Column(length = 500)
    private String dataPagamento;

    public Financeiro() {
    }

    public Financeiro(Long id, Double valor, String valorDePlano, Double desconto, Double taxaExtra, String dataPagamento) {
        this.id = id;
        this.valor = valor;
        this.valorDePlano = valorDePlano;
        this.desconto = desconto;
        this.taxaExtra = taxaExtra;
        this.dataPagamento = dataPagamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getValorDePlano() {
        return valorDePlano;
    }

    public void setValorDePlano(String valorDePlano) {
        this.valorDePlano = valorDePlano;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double getTaxaExtra() {
        return taxaExtra;
    }

    public void setTaxaExtra(Double taxaExtra) {
        this.taxaExtra = taxaExtra;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public void registrarPagamento(){}
    public void aplicarDesconto(Double desconto) {
        this.desconto = desconto;
    }
    public float calcularMensalidadeAtual(){
        return 0;
    }


}
