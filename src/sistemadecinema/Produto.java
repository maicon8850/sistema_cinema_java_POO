package sistemadecinema;

import java.util.Date;

/**
 * Esta classe representa um produto no sistema de cinema.
 */
public class Produto {
    // Atributos

    private int idProduto; // Identificador único do produto
    private String nome; // Nome do produto
    private double preco; // Preço do produto
    private Date dataValidade; // Data de validade do produto
    private int qtd_estoque; // Quantidade disponível em estoque do produto

    // Construtores

    /**
     * Construtor padrão da classe Produto.
     */
    public Produto(){

    }

    /**
     * Construtor da classe Produto.
     *
     * @param nome Nome do produto.
     * @param preco Preço do produto.
     * @param dataValidade Data de validade do produto.
     * @param qtd_estoque Quantidade disponível em estoque do produto.
     */
    public Produto(String nome, double preco, Date dataValidade, int qtd_estoque) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
        this.qtd_estoque = qtd_estoque;
    }

    // Métodos Getters e Setters

    /**
     * Retorna o identificador único do produto.
     *
     * @return O identificador único do produto.
     */
    public int getIdProduto() {
        return idProduto;
    }

    /**
     * Define o identificador único do produto.
     *
     * @param idProduto O identificador único do produto.
     */
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    /**
     * Retorna o nome do produto.
     *
     * @return O nome do produto.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do produto.
     *
     * @param nome O nome do produto.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o preço do produto.
     *
     * @return O preço do produto.
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Define o preço do produto.
     *
     * @param preco O preço do produto.
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Retorna a data de validade do produto.
     *
     * @return A data de validade do produto.
     */
    public Date getDataValidade() {
        return dataValidade;
    }

    /**
     * Define a data de validade do produto.
     *
     * @param dataValidade A data de validade do produto.
     */
    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    /**
     * Retorna a quantidade disponível em estoque do produto.
     *
     * @return A quantidade disponível em estoque do produto.
     */
    public int getQtd_estoque() {
        return qtd_estoque;
    }

    /**
     * Define a quantidade disponível em estoque do produto.
     *
     * @param qtd_estoque A quantidade disponível em estoque do produto.
     */
    public void setQtd_estoque(int qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }
    
    /**
     * Retorna uma representação em string do objeto Produto.
     *
     * @return Uma string representando o objeto Produto.
     */
    @Override
    public String toString() {
        return "Produto{" +
                "idProduto=" + idProduto +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", dataValidade=" + dataValidade +
                ", qtd_estoque=" + qtd_estoque +
                '}';
    }
}
