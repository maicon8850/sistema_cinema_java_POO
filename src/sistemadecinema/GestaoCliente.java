package sistemadecinema;

import java.util.ArrayList;
import java.util.List;
import manipulararquivo.WR;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Esta classe é responsável por gerenciar operações relacionadas aos clientes.
 * Implementa a interface Gestao T onde T é do tipo Cliente.
 */
public class GestaoCliente implements Gestao<Cliente>{

    private List<Cliente> arrayCliente;
    
    /**
     * Construtor da classe GestaoCliente.
     * Inicializa a lista de clientes.
     */
    public GestaoCliente() {
        arrayCliente = new ArrayList<>(); // Inicializa a lista de clientes
    }
    
    public List getListaClientes(){
        return arrayCliente;
    }
    
    /**
     * Cadastra um novo cliente.
     * @param objeto O cliente a ser cadastrado.
     */
    @Override
    public void cadastrar(Cliente objeto) {
        arrayCliente.add(objeto); // Adiciona o cliente à lista de clientes
    }
    
    /**
     * Salva a lista de clientes em um arquivo JSON.
     */
    
    @Override
     public void salvar() {
        try {
            JSONArray jsonArrayClientes = new JSONArray(); // Cria um novo array JSON
            
           
            // Itera sobre a lista de clientes
            for (Cliente cliente : arrayCliente) {
                // Cria um objeto JSON para cada cliente e adiciona ao array JSON
                JSONObject jsonCliente = new JSONObject();
                jsonCliente.put("ID", cliente.getId());
                jsonCliente.put("nome", cliente.getNome());
                jsonCliente.put("sobrenome", cliente.getSobrenome());
                jsonCliente.put("cpf", cliente.getCpf());
                jsonCliente.put("endereco", cliente.getEndereco());
                jsonCliente.put("telefone", cliente.getTelefone());
                jsonArrayClientes.put(jsonCliente);
            }
            
            //System.out.println(jsonArrayClientes);

            // Converte o array JSON em uma string
            String jsonString = jsonArrayClientes.toString(4); // Formata com indentação de 4 espaços

            // Escreve a string JSON no arquivo
            WR utilitarioArquivo = new WR();
            utilitarioArquivo.escreverNoArquivo(jsonString, "clientes.json", true);

            System.out.println("Clientes salvos com sucesso.");
        } catch (Exception e) {
            // Trata exceções
            System.out.println("Ocorreu um erro ao salvar os clientes: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * Busca um cliente pelo ID.
     * @param id O ID do cliente a ser buscado.
     * @return O cliente encontrado ou null se não encontrado.
     */
    @Override
    public Cliente buscar(int id) {
        Cliente clienteEncontrado = null;

        // Itera sobre a lista de clientes
        for (Cliente cliente : arrayCliente) {
            // Verifica se o ID do cliente corresponde ao ID procurado
            if (cliente.getId() == id) {
                // Se encontrar, atribui o cliente encontrado à variável clienteEncontrado e interrompe o loop
                clienteEncontrado = cliente;
                break;
            }
        }

        // Se o cliente não for encontrado, imprime uma mensagem
        if (clienteEncontrado == null) {
            System.out.println("Cliente não encontrado.");
        } else {
            // Se o cliente for encontrado, imprime suas informações
            System.out.println("Cliente encontrado:");
            System.out.println("ID: " + clienteEncontrado.getId());
            System.out.println("Nome: " + clienteEncontrado.getNome());
            System.out.println("Sobrenome: " + clienteEncontrado.getSobrenome());
            System.out.println("CPF: " + clienteEncontrado.getCpf());
            System.out.println("Endereço: " + clienteEncontrado.getEndereco());
            System.out.println("Telefone: " + clienteEncontrado.getTelefone());
        }

        return clienteEncontrado;
    }

    /**
     * Lista todos os clientes cadastrados.
     * @return A lista completa de clientes.
     */
    @Override
    public List<Cliente> listar() {
        for (Cliente cliente : arrayCliente){
            System.out.println(cliente.getNome() + " " + cliente.getSobrenome()); // Imprime cada cliente da lista
        }

        return arrayCliente; // Retorna a lista completa de clientes
    }

    /**
     * Atualiza as informações de um cliente.
     * @param clienteAtualizado O cliente com as informações atualizadas.
     */
    @Override
    public void atualizar(Cliente clienteAtualizado) {
        // Variável para armazenar o índice do cliente a ser atualizado
        int index = -1;

        // Itera sobre a lista de clientes
        for (int i = 0; i < arrayCliente.size(); i++) {
            // Verifica se o ID do cliente atual corresponde ao ID do cliente atualizado
            if (arrayCliente.get(i).getId() == clienteAtualizado.getId()) {
                // Se encontrar, armazena o índice e interrompe o loop
                index = i;
                break;
            }
        }

        // Verifica se o cliente foi encontrado
        if (index != -1) {
            // Atualiza as informações do cliente na lista com base no índice
            arrayCliente.set(index, clienteAtualizado);
            System.out.println("Cliente atualizado com sucesso.");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    /**
     * Exclui um cliente da lista.
     * @param id O ID do cliente a ser excluído.
     */
    @Override
    public void deletar(int id) {
        // Variável para armazenar o índice do cliente a ser excluído
        int index = -1;

        // Itera sobre a lista de clientes
        for (int i = 0; i < arrayCliente.size(); i++) {
            // Verifica se o ID do cliente atual corresponde ao ID fornecido
            if (arrayCliente.get(i).getId() == id) {
                // Se encontrar, armazena o índice e interrompe o loop
                index = i;
                break;
            }
        }

        // Verifica se o cliente foi encontrado
        if (index != -1) {
            // Remove o cliente da lista com base no índice
            arrayCliente.remove(index);
            System.out.println("Cliente excluído com sucesso.");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
}
