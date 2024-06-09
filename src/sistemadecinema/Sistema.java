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
    
    public void registrarVenda(Venda venda) {
        try {
            // Cria um objeto JSON para a venda
            JSONObject jsonVenda = new JSONObject();
            jsonVenda.put("idVenda", venda.getIdVenda());
            jsonVenda.put("valorTotal", venda.getValorTotal());
            jsonVenda.put("dataHora", venda.getDataHora());

            // Cria um array JSON para os produtos da venda
            JSONArray jsonArrayProdutos = new JSONArray();
            for (Produto produto : venda.getProdutos()) {
                JSONObject jsonProduto = new JSONObject();
                jsonProduto.put("nome", produto.getNome());
                jsonProduto.put("preco", produto.getPreco());
                jsonArrayProdutos.put(jsonProduto);
            }
            jsonVenda.put("produtos", jsonArrayProdutos);

            // Adiciona os detalhes do filme
            JSONObject jsonFilme = new JSONObject();
            jsonFilme.put("titulo", venda.getFilme().getTitulo());
            jsonFilme.put("legendado", venda.getFilme().isLegendado());
            jsonFilme.put("dataInicioExibicao", venda.getFilme().getDataInicioExibicao());
            jsonVenda.put("filme", jsonFilme);

            // Lê o conteúdo atual do arquivo JSON
            WR utilitarioArquivo = new WR();
            String conteudoArquivo = utilitarioArquivo.lerArquivo("vendas.json");
            JSONArray jsonArrayVendas;

            if (conteudoArquivo.isEmpty()) {
                jsonArrayVendas = new JSONArray();
            } else {
                jsonArrayVendas = new JSONArray(conteudoArquivo);
            }

            // Adiciona a nova venda ao array de vendas
            jsonArrayVendas.put(jsonVenda);

            // Escreve o array atualizado de vendas de volta no arquivo JSON
            utilitarioArquivo.escreverNoArquivo(jsonArrayVendas.toString(4), "vendas.json", true);

            System.out.println("Venda registrada com sucesso.");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao registrar a venda: " + e.getMessage());
            e.printStackTrace();
        }
    }

  
    
    /**
     * Gera o resumo atual das vendas realizadas, exibindo informações sobre os produtos, filmes e valores.
     */
    public void gerarResumoAtual(){
        
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
    public void salvar() {
        System.out.println("Salvando clientes...");
        gestaoCliente.salvar();
        System.out.println(gestaoCliente.getListaClientes());
        System.out.println("Salvando produtos...");
        gestaoProduto.salvar();
        System.out.println("Salvando funcionários...");
        gestaoFuncionario.salvar();
        System.out.println("Salvando filmes...");
        gestaoFilme.salvar();
    }
}
