import java.util.Date;
import java.util.List;

public class Venda {
    // Atributos
    private int idVenda;
    private Cliente cliente;
    private Filme filme;
    private List<Produto> produtos;
    private BalcaoAtendimento balcaoAtendimento;
    private double valorTotal;
    private Date dataHora;

    // Construtor
    public Venda(int idVenda, Cliente cliente, Filme filme, List<Produto> produtos, BalcaoAtendimento balcaoAtendimento, double valorTotal, Date dataHora) {
        this.idVenda = idVenda;
        this.cliente = cliente;
        this.filme = filme;
        this.produtos = produtos;
        this.balcaoAtendimento = balcaoAtendimento;
        this.valorTotal = valorTotal;
        this.dataHora = dataHora;
    }

    // Métodos Getters e Setters (removidos para brevidade)

    // Método para emitir fatura da venda
    public void emitirFatura() {
        System.out.println("Fatura da Venda:");
        System.out.println("ID da Venda: " + idVenda);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Filme: " + filme.getTitulo());
        System.out.println("Produtos:");
        for (Produto produto : produtos) {
            System.out.println("- " + produto.getNome() + ": " + produto.getPreco());
        }
        System.out.println("Valor Total: " + valorTotal);
        System.out.println("Data e Hora: " + dataHora);
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
