package sistemadecinema;

import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Esta classe representa uma venda realizada no sistema de cinema.
 */
public class Venda {
    // Atributos
    private int idVenda;                 // Identificador único da venda
    private Cliente cliente;               // Cliente que realizou a compra
    private Filme filme;                    // Filme vendido
    private List<Produto> produtos;        // Produtos vendidos
    private int balcaoAtendimento;  // Balcão de atendimento onde a venda foi realizada
    private double valorTotal;              // Valor total da venda
    private Date dataHora;                 // Data e hora da venda
   
    /**
     * Construtor padrão da classe Venda.
     */
    public Venda(){
        
    };

    /**
     * Construtor da classe Venda.
     *@param idVenda Id da venda que está sendo criada
     * @param cliente O cliente que realizou a compra.
     * @param filme O filme vendido.
     * @param produtos A lista de produtos vendidos.
     * @param balcaoAtendimento O balcão de atendimento onde a venda foi realizada.
     * @param valorTotal O valor total da venda.
     * @param dataHora A data e hora da venda.
     */
    public Venda(int idVenda, Cliente cliente, Filme filme, List<Produto> produtos, int balcaoAtendimento, double valorTotal, Date dataHora) {
        this.cliente = cliente;
        this.filme = filme;
        this.produtos = produtos;
        this.balcaoAtendimento = balcaoAtendimento;
        this.valorTotal = valorTotal;
        this.dataHora = dataHora;
    };

    // Métodos Getters e Setters

    /**
     * Retorna o identificador único da venda.
     *
     * @return O identificador único da venda.
     */
    public int getIdVenda() {
        return idVenda;
    };

    /**
     * Define o identificador único da venda.
     *
     * @param idVenda O identificador único da venda.
     */
    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    /**
     * Retorna o cliente que realizou a compra.
     *
     * @return O cliente que realizou a compra.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Define o cliente que realizou a compra.
     *
     * @param cliente O cliente que realizou a compra.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Retorna o filme vendido.
     *
     * @return O filme vendido.
     */
    public Filme getFilme() {
        return filme;
    }

    /**
     * Define o filme vendido.
     *
     * @param filme O filme vendido.
     */
    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    /**
     * Retorna a lista de produtos vendidos.
     *
     * @return A lista de produtos vendidos.
     */
    public List<Produto> getProdutos() {
        return produtos;
    }

    /**
     * Define a lista de produtos vendidos.
     *
     * @param produtos A lista de produtos vendidos.
     */
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    /**
     * Retorna o número do balcão de atendimento onde a venda foi realizada.
     *
     * @return O número do balcão de atendimento.
     */
    public int getBalcaoAtendimento() {
        return balcaoAtendimento;
    }

    /**
     * Define o número do balcão de atendimento onde a venda foi realizada.
     *
     * @param balcaoAtendimento O número do balcão de atendimento.
     */
    public void setBalcaoAtendimento(int balcaoAtendimento) {
        this.balcaoAtendimento = balcaoAtendimento;
    }

    /**
     * Retorna o valor total da venda.
     *
     * @return O valor total da venda.
     */
    public double getValorTotal() {
        return valorTotal;
    }

    /**
     * Define o valor total da venda.
     *
     * @param valorTotal O valor total da venda.
     */
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * Retorna a data e hora da venda.
     *
     * @return A data e hora da venda.
     */
    public Date getDataHora() {
        return dataHora;
    }

    /**
     * Define a data e hora da venda.
     *
     * @param dataHora A data e hora da venda.
     */
    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }
    
    
    /**
     * Retorna uma representação em string do objeto Venda.
     *
     * @return Uma string representando o objeto Venda.
     */
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
