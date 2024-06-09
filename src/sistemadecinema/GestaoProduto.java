package sistemadecinema;

import java.util.ArrayList;
import java.util.List;
import manipulararquivo.WR;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Esta classe gerencia as operações relacionadas aos produtos do sistema de cinema.
 * Implementa a interface Gestao para fornecer métodos de cadastro, busca, listagem, atualização e exclusão de produtos.
 * As informações dos produtos são armazenadas em um arquivo JSON.
 */
public class GestaoProduto implements Gestao<Produto> {
    private List<Produto> arrayProdutos;
    
    // Construtor
    public GestaoProduto() {
        arrayProdutos = new ArrayList<>(); // Inicializa o ArrayList
    }
    
    public List getListaProdutos(){
        return arrayProdutos;
    }
    
    /**
     * Método para cadastrar um novo produto no sistema.
     * 
     * @param produto O produto a ser cadastrado.
     */
    @Override
    public void cadastrar(Produto produto) {
        arrayProdutos.add(produto);
    }

    /**
     * Salva a lista de produtos em um arquivo JSON.
     * 
     */
    @Override
    public void salvar() {
        
        List<Produto> produtos = this.getListaProdutos();
        try {
            JSONArray jsonArrayProdutos = new JSONArray(); // Cria um novo array JSON

            // Itera sobre a lista de produtos
            for (Produto produto : produtos) {
                // Cria um objeto JSON para cada produto e adiciona ao array JSON
                JSONObject jsonProduto = new JSONObject();
                jsonProduto.put("ID", produto.getIdProduto());
                jsonProduto.put("nome", produto.getNome());
                jsonProduto.put("preco", produto.getPreco());
                jsonProduto.put("qtd_estoque", produto.getQtd_estoque());
                jsonProduto.put("data_validade", produto.getDataValidade());

                jsonArrayProdutos.put(jsonProduto);
            }

            // Converte o array JSON em uma string
            String jsonString = jsonArrayProdutos.toString();

            // Escreve a string JSON no arquivo
            WR utilitarioArquivo = new WR();
            utilitarioArquivo.escreverNoArquivo(jsonString, "produtos.json", true);

            System.out.println("Produtos salvos com sucesso.");
        } catch (Exception e) {
            // Trata exceções
            System.out.println("Ocorreu um erro ao salvar os produtos: " + e.getMessage());
        }
    }

    /**
     * Busca um produto pelo ID.
     * 
     * @param id O ID do produto a ser buscado.
     * @return O produto encontrado ou null se não encontrado.
     */
    @Override
    public Produto buscar(int id) {
        Produto produtoEncontrado = null;
        for (Produto produto : arrayProdutos) {
            if (produto.getIdProduto() == id) {
                produtoEncontrado = produto;
                break;
            }
        }
        
        if (produtoEncontrado == null) {
            System.out.print("Produto não encontrado");
        } else {
            System.out.println("Produto encontrado:");
            System.out.println("ID: " + produtoEncontrado.getIdProduto());
            System.out.println("Nome: " + produtoEncontrado.getNome());
            System.out.println("Preço: " + produtoEncontrado.getPreco());
            System.out.println("Quantidade em estoque: " + produtoEncontrado.getQtd_estoque());
        }
        
        return produtoEncontrado;
    }

    /**
     * Lista todos os produtos cadastrados.
     * 
     * @return A lista completa de produtos.
     */
    @Override
    public List<Produto> listar() {
        for (Produto produto : arrayProdutos) {
            System.out.println(produto.getNome() + " - " + produto.getPreco() + " - " + produto.getDataValidade());
        }
        
        return arrayProdutos;
    }

    /**
     * Deleta um produto da lista.
     * 
     * @param id O ID do produto a ser excluído.
     */
    @Override
    public void deletar(int id) {
        // Variável para armazenar o índice do produto a ser excluído
        int index = -1;

        // Itera sobre a lista de produtos
        for (int i = 0; i < arrayProdutos.size(); i++) {
            // Verifica se o ID do produto atual corresponde ao ID fornecido
            if (arrayProdutos.get(i).getIdProduto() == id) {
                // Se encontrar, armazena o índice e interrompe o loop
                index = i;
                break;
            }
        }

        // Verifica se o produto foi encontrado
        if (index != -1) {
            // Remove o produto da lista com base no índice
            arrayProdutos.remove(index);
            System.out.println("Produto excluído com sucesso.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    /**
     * Atualiza as informações de um produto.
     * 
     * @param produtoAtualizado O produto com as informações atualizadas.
     */
    @Override
    public void atualizar(Produto produtoAtualizado) {
        // Variável para armazenar o índice do produto a ser atualizado
        int index = -1;

        // Itera sobre a lista de produtos
        for (int i = 0; i < arrayProdutos.size(); i++) {
            // Verifica se o ID do produto atual corresponde ao ID do produto atualizado
            if (arrayProdutos.get(i).getIdProduto() == produtoAtualizado.getIdProduto()) {
                // Se encontrar, armazena o índice e interrompe o loop
                index = i;
                break;
            }
        }

        // Verifica se o produto foi encontrado
        if (index != -1) {
            // Atualiza as informações do produto na lista com base no índice
            arrayProdutos.set(index, produtoAtualizado);
            System.out.println("Produto atualizado com sucesso.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
}
