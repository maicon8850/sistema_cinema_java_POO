import java.util.Date;
import java.util.List;

public class Venda {
    // Atributos
    private int idVenda;                 // Identificador único da venda
    private Cliente cliente;               // Cliente que realizou a compra
    private Filme filme;                    // Filme vendido
    private List<Produto> produtos;        // Produtos vendidos
    private BalcaoAtendimento balcaoAtendimento;  // Balcão de atendimento onde a venda foi realizada
    private double valorTotal;              // Valor total da venda
    private Date dataHora;                 // Data e hora da venda

    // Construtor
    public Venda(int idVenda, Cliente cliente, Filme filme, List<Produto> produtos,
                 BalcaoAtendimento balcaoAtendimento, double valorTotal, Date dataHora) {
        this.idVenda = idVenda;
        this.cliente = cliente;
        this.filme = filme;
        this.produtos = produtos;
        this.balcaoAtendimento = balcaoAtendimento;
        this.valorTotal = valorTotal;
        this.dataHora = dataHora;
    }

    // Métodos Getters e Setters
    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public BalcaoAtendimento getBalcaoAtendimento() {
        return balcaoAtendimento;
    }

    public void setBalcaoAtendimento(BalcaoAtendimento balcaoAtendimento) {
        this.balcaoAtendimento = balcaoAtendimento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    // Método para emitir fatura da venda
    public void emitirFatura() {
        // Implementação para emitir fatura da venda
    }

    @Override
    public String toString() {
        return "Venda{" +
                "idVenda=" + idVenda +
                ", cliente=" + cliente +
                ", filme=" + filme +
                ", produtos=" + produtos +
                ", balcaoAtendimento=" + balcaoAtendimento +
                ", valorTotal=" + valorTotal +
                ", dataHora=" + dataHora +
                '}';
    }
}
