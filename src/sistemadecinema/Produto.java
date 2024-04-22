
package sistemadecinema;

import java.util.Date;

// Classe produtio 
class Produto {
    private int idProduto;
    private String nome;
    private double preco;
    private Date dataValidade;
    private int qtd_estoque;
    
    public Produto(){
        
    };
    
    /**
 * Construtor da classe produto alterando o estado na instância do objeto 
 * @param nome Nome do produto.
 * @param preco Preco do produto.
 * @param validade Validade do produto.
 * @param qtd_estoque Quantidade disponível em estoque do produto.
 * @return A constrói o objeto produto.
 */
    public Produto(String nome, double preco, Date dataValidade, int qtd_estoque) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
        this.qtd_estoque = qtd_estoque;
    }

       /**
 * Esse método é utilizado para trazer o Id do produto.
 * @return Trás id do produto.
 */
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public int getQtd_estoque() {
        return qtd_estoque;
    }

    public void setQtd_estoque(int qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }
    
   
}


