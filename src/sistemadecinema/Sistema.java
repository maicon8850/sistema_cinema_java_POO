package sistemadecinema;

import java.util.ArrayList;
import java.util.List;
import manipulararquivo.WR;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Esta classe representa o sistema de gestão do cinema.
 */
public class Sistema {
    
    private GestaoFuncionario gestaoFuncionario = new GestaoFuncionario();
    private GestaoFilme gestaoFilme = new GestaoFilme();
    private GestaoCliente gestaoCliente = new GestaoCliente();
    private GestaoProduto gestaoProduto = new GestaoProduto();
    
    private List<Venda> arrayVendaUnica;

    /**
     * Construtor padrão da classe Sistema.
     */
    public Sistema() {
        arrayVendaUnica = new ArrayList<>(); // Inicializa a lista de vendas
    }

    /**
     * Inicia uma nova venda.
     *
     * @param venda A venda a ser iniciada.
     */
    public void iniciarVenda(Venda venda) {
        arrayVendaUnica.add(venda);
    }

    /**
     * Edita uma venda existente.
     *
     * @param vendaEditada A venda com as edições realizadas.
     */
    public void editarVenda(Venda vendaEditada) {
        if (!arrayVendaUnica.isEmpty()) {
            arrayVendaUnica.set(0, vendaEditada);
            System.out.println("Itens da venda atualizados com sucesso.");
        } else {
            System.out.println("Erro ao atualizar os itens da venda");
        }
    }

    /**
     * Cancela a venda em andamento.
     */
    public void cancelar() {
        if (arrayVendaUnica.isEmpty()) {
            System.out.println("Não há venda a ser cancelada");
        } else {
            arrayVendaUnica.clear();
            System.out.println("Venda cancelada com sucesso.");
        }
    }

    /**
     * Registra a venda no sistema e salva as informações em um arquivo JSON.
     */
    public void registrarVenda() {
        try {
            JSONArray jsonArrayVenda = new JSONArray(); // Cria um novo array JSON

            // Itera sobre a lista de vendas
            for (Venda venda : arrayVendaUnica) {
                // Cria um objeto JSON para cada venda e adiciona ao array JSON
                JSONObject jsonVenda = new JSONObject();
                jsonVenda.put("idVenda", venda.getIdVenda());
                jsonVenda.put("cliente", venda.getCliente().toJson()); // Converte o cliente para JSON
                jsonVenda.put("filme", venda.getFilme().toJson()); // Converte o filme para JSON
                JSONArray jsonArrayProdutos = new JSONArray(); // Cria um novo array JSON para os produtos
                for (Produto produto : venda.getProdutos()) {
                    jsonArrayProdutos.put(produto.toJson()); // Converte cada produto para JSON e adiciona ao array
                }
                jsonVenda.put("produtos", jsonArrayProdutos); // Adiciona o array de produtos ao objeto JSON da venda
                jsonVenda.put("balcaoAtendimento", venda.getBalcaoAtendimento());
                jsonVenda.put("valorTotal", venda.getValorTotal());
                jsonVenda.put("dataHora", venda.getDataHora().toString()); // Salva a data e hora como string

                jsonArrayVenda.put(jsonVenda);
            }

            // Converte o array JSON em uma string
            String jsonString = jsonArrayVenda.toString();

            // Escreve a string JSON no arquivo
            WR utilitarioArquivo = new WR();
            utilitarioArquivo.escreverNoArquivo(jsonString, "vendas.json", true);

            System.out.println("Venda registrada com sucesso.");
        } catch (Exception e) {
            // Trata exceções
            System.out.println("Ocorreu um erro ao registrar a venda: " + e.getMessage());
        }
    }

    /**
     * Gera o resumo atual das vendas realizadas, exibindo informações sobre os produtos, filmes e valores.
     */
    public void gerarResumoAtual() {
        for (Venda vendaAtual : arrayVendaUnica) {
            System.out.println("Resumo da Venda:");
            System.out.println("ID da Venda: " + vendaAtual.getIdVenda());
            System.out.println("Produtos:");
            for (Produto produto : vendaAtual.getProdutos()) {
                System.out.println("  - " + produto.getNome());
                System.out.println("    Preço: " + produto.getPreco());
            }
            System.out.println("Filme:");
            System.out.println("  - " + vendaAtual.getFilme().getTitulo());
            System.out.println("    Legendado: " + (vendaAtual.getFilme().isLegendado() ? "Sim" : "Não"));
            System.out.println("    Horário de Início de Exibição: " + vendaAtual.getFilme().getDataInicioExibicao());
            System.out.println("Valor Total: " + vendaAtual.getValorTotal());
            System.out.println("Data e Hora da Venda: " + vendaAtual.getDataHora());
            System.out.println(); // Adiciona uma linha em branco entre as vendas
        }
    }
    
    /**
     * Salva os registros do sistema em arquivos.
     */
    public void salvar(){
       gestaoCliente.salvar(gestaoCliente.getListaClientes());
       gestaoProduto.salvar(gestaoProduto.listar());
       gestaoFuncionario.salvar(gestaoFuncionario.getListaFuncionario());
       gestaoFilme.salvar(gestaoFilme.getListaFilme());
    }
}
