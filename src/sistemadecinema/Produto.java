package sistemadecinema;

import java.util.Date;
import org.json.JSONObject;

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
    private static  int instancias;

    // Construtores

    /**
     * Construtor padrão da classe Produto.
     */
    public Produto(){
        instancias++;
    }

    /**
     * Construtor da classe Produto.
     * @param idProduto Id do produto
     * @param nome Nome do produto.
     * @param preco Preço do produto.
     * @param dataValidade Data de validade do produto.
     * @param qtd_estoque Quantidade disponível em estoque do produto.
     */
    public Produto(int idProduto, String nome, double preco, Date dataValidade, int qtd_estoque) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
        this.qtd_estoque = qtd_estoque;
        
        instancias++;
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
    
    public int getInstancias(){
        return instancias;
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
    
    // Método para converter o Produto em um JSONObject
    /**
     * Converte o objeto Produto em um objeto JSONObject.
     *
     * @return Um JSONObject contendo as informações do produto.
     */
    public JSONObject toJson() {
        JSONObject jsonProduto = new JSONObject(); // Cria um novo objeto JSONObject

        // Adiciona as informações do produto ao JSONObject
        jsonProduto.put("idProduto", this.idProduto);
        jsonProduto.put("nome", this.nome);
        jsonProduto.put("preco", this.preco);
        jsonProduto.put("dataValidade", this.dataValidade.toString()); // Salva a data de validade como string
        jsonProduto.put("qtd_estoque", this.qtd_estoque);

        return jsonProduto; // Retorna o JSONObject representando o produto
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
