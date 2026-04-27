public class Financeiro {
    private float valor;
    private String valorDePlano;
    private float desconto;
    private float taxaExtra;
    private String dataPagamento;

    public Financeiro(float valor, String valorDePlano, float desconto, float taxaExtra, String dataPagamento) {
        this.valor = valor;
        this.valorDePlano = valorDePlano;
        this.desconto = desconto;
        this.taxaExtra = taxaExtra;
        this.dataPagamento = dataPagamento;
    }

    //construtor


    public Financeiro() {
    }


    //Getters and Setters


    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getValorDePlano() {
        return valorDePlano;
    }

    public void setValorDePlano(String valorDePlano) {
        this.valorDePlano = valorDePlano;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public float getTaxaExtra() {
        return taxaExtra;
    }

    public void setTaxaExtra(float taxaExtra) {
        this.taxaExtra = taxaExtra;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    //metodos

    public void registrarPagamento(){

    }

    public void aplicarDesconto(float desconto){

    }

    public void calcularMensalidadeAtual(){

    }







    //toString
    @Override
    public String toString() {
        return "Financeiro{" +
                "valor=" + valor +
                ", valorDePlano='" + valorDePlano + '\'' +
                ", desconto=" + desconto +
                ", taxaExtra=" + taxaExtra +
                ", dataPagamento='" + dataPagamento + '\'' +
                '}';
    }
}
