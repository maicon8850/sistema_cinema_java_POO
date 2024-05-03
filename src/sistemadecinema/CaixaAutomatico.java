package sistemadecinema;

public class CaixaAutomatico {
    // Atributos
    private int idCaixa;      // Identificador único do caixa automático
    private int numero;                    // Número do caixa automático
    private BalcaoAtendimento balcaoAtendimento;// Balcão de atendimento associado ao caixa automático

    // Construtor
    public CaixaAutomatico(int idCaixa, int numero, BalcaoAtendimento balcaoAtendimento) {
        this.idCaixa = idCaixa;
        this.numero = numero;
        this.balcaoAtendimento = balcaoAtendimento;
    }

    // Métodos Getters e Setters
    public int getIdCaixa() {
        return idCaixa;
    }

    public void setIdCaixa(int idCaixa) {
        this.idCaixa = idCaixa;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public BalcaoAtendimento getBalcaoAtendimento() {
        return balcaoAtendimento;
    }

    public void setBalcaoAtendimento(BalcaoAtendimento balcaoAtendimento) {
        this.balcaoAtendimento = balcaoAtendimento;
    }

    // Métodos adicionais

    // Método para iniciar venda de ingresso
    public void iniciarVendaIngresso() {
        // Implementação para iniciar venda de ingresso
    }

    // Método para exibir lista de filmes em cartaz
    public void exibirListaFilmesEmCartaz() {
        // Implementação para exibir lista de filmes em cartaz
    }

    // Método para selecionar filme desejado
    public void selecionarFilmeDesejado() {
        // Implementação para selecionar filme desejado
    }

    // Método para verificar disponibilidade de ingressos
    public void verificarDisponibilidadeIngressos() {
        // Implementação para verificar disponibilidade de ingressos
    }

    // Método para selecionar número de ingressos
    public void selecionarNumeroIngressos() {
        // Implementação para selecionar número de ingressos
    }

    // Método para calcular valor total da compra
    public void calcularValorTotalCompra() {
        // Implementação para calcular valor total da compra
    }

    // Método para confirmar venda
    public void confirmarVenda() {
        // Implementação para confirmar venda
    }

    // Método para registrar venda e atualizar estoque
    public void registrarVendaAtualizarEstoque() {
        // Implementação para registrar venda e atualizar estoque
    }

    // Método para exibir recibo da transação
    public void exibirReciboTransacao() {
        // Implementação para exibir recibo da transação
    }

    // Método para exibir mensagem de erro
    public void exibirMensagemErro() {
        // Implementação para exibir mensagem de erro
    }

    @Override
    public String toString() {
        return "CaixaAutomatico{" +
                "idCaixa=" + idCaixa +
                ", numero=" + numero +
                ", balcaoAtendimento=" + balcaoAtendimento +
                '}';
    }
}
