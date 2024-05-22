package sistemadecinema;

import java.util.ArrayList;
import java.util.List;
import manipulararquivo.WR;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Esta classe gerencia as operações relacionadas aos funcionários do sistema de cinema.
 * Implementa a interface Gestao para fornecer métodos de cadastro, busca, listagem, atualização e exclusão de funcionários.
 * As informações dos funcionários são armazenadas em um arquivo JSON.
 */
public class GestaoFuncionario implements Gestao<Funcionario> {
    
    private List<Funcionario> arrayFuncionario;
    
    /**
     * Construtor padrão para criar uma lista de funcionários no sistema.
     */
    public GestaoFuncionario(){
        arrayFuncionario = new ArrayList<>();
    }
    
    /**
     * Retorna a lista de funcionários.
     * @return A lista de funcionários.
     */
    public List<Funcionario> getListaFuncionario(){
        return arrayFuncionario; // Retorna a lista de funcionários
    }
    
    /**
     * Método para cadastrar um novo funcionário no sistema.
     * @param objeto O funcionário a ser cadastrado.
     */
    @Override
    public void cadastrar(Funcionario objeto) {
        arrayFuncionario.add(objeto);
    }
    
    /**
     * Salva a lista de funcionários em um arquivo JSON.
     * @param funcionarios A lista de funcionários a ser salva.
     */
    @Override
    public void salvar(List<Funcionario> funcionarios) {
        try {
            JSONArray jsonArrayFuncionarios = new JSONArray(); // Cria um novo array JSON

            // Itera sobre a lista de funcionários
            for (Funcionario funcionario : funcionarios) {
                // Cria um objeto JSON para cada funcionário e adiciona ao array JSON
                JSONObject jsonFuncionario = new JSONObject();
                jsonFuncionario.put("ID", funcionario.getIdFuncionario());
                jsonFuncionario.put("nome", funcionario.getNome());
                jsonFuncionario.put("cargo", funcionario.getCargo());
                
                jsonArrayFuncionarios.put(jsonFuncionario);
            }

            // Converte o array JSON em uma string
            String jsonString = jsonArrayFuncionarios.toString();

            // Escreve a string JSON no arquivo
            WR utilitarioArquivo = new WR();
            utilitarioArquivo.escreverNoArquivo(jsonString, "funcionarios.json", true);

            System.out.println("Funcionários salvos com sucesso.");
        } catch (Exception e) {
            // Trata exceções
            System.out.println("Ocorreu um erro ao salvar os funcionários: " + e.getMessage());
        }
    }
    
    
    /**
     * Busca um funcionário pelo ID.
     * @param id O ID do funcionário a ser buscado.
     * @return O funcionário encontrado ou null se não encontrado.
     */
    @Override
    public Funcionario buscar(int id) {
        Funcionario funcionarioEncontrado = null;

        // Itera sobre a lista de funcionários
        for (Funcionario funcionario : arrayFuncionario) {
            // Verifica se o ID do funcionário corresponde ao ID procurado
            if (funcionario.getIdFuncionario() == id) {
                // Se encontrar, atribui o funcionário encontrado à variável funcionarioEncontrado e interrompe o loop
                funcionarioEncontrado = funcionario;
                break;
            }
        }

        // Se o funcionário não for encontrado, imprime uma mensagem
        if (funcionarioEncontrado == null) {
            System.out.println("Funcionário não encontrado.");
        } else {
            // Se o funcionário for encontrado, imprime suas informações
            System.out.println("Funcionário encontrado:");
            System.out.println("ID: " + funcionarioEncontrado.getIdFuncionario());
            System.out.println("Nome: " + funcionarioEncontrado.getNome());
            System.out.println("Cargo: " + funcionarioEncontrado.getCargo());
        }

        return funcionarioEncontrado;
    }

    /**
     * Lista todos os funcionários cadastrados.
     * @return A lista completa de funcionários.
     */
    @Override
    public List<Funcionario> listar() {
        for (Funcionario funcionario : arrayFuncionario){
            System.out.println(funcionario.getNome() + " - " + funcionario.getCargo()); // Imprime cada funcionário da lista
        }

        return arrayFuncionario; // Retorna a lista completa de funcionários
    }

    /**
     * Atualiza as informações de um funcionário.
     * @param funcionarioAtualizado O funcionário com as informações atualizadas.
     */
    @Override
    public void atualizar(Funcionario funcionarioAtualizado) {
        // Variável para armazenar o índice do funcionário a ser atualizado
        int index = -1;

        // Itera sobre a lista de funcionários
        for (int i = 0; i < arrayFuncionario.size(); i++) {
            // Verifica se o ID do funcionário atual corresponde ao ID do funcionário atualizado
            if (arrayFuncionario.get(i).getIdFuncionario() == funcionarioAtualizado.getIdFuncionario()) {
                // Se encontrar, armazena o índice e interrompe o loop
                index = i;
                break;
            }
        }

        // Verifica se o funcionário foi encontrado
        if (index != -1) {
            // Atualiza as informações do funcionário na lista com base no índice
            arrayFuncionario.set(index, funcionarioAtualizado);
            System.out.println("Funcionário atualizado com sucesso.");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    /**
     * Exclui um funcionário da lista.
     * @param id O ID do funcionário a ser excluído.
     */
    @Override
    public void deletar(int id) {
        // Variável para armazenar o índice do funcionário a ser excluído
        int index = -1;

        // Itera sobre a lista de funcionários
        for (int i = 0; i < arrayFuncionario.size(); i++) {
            // Verifica se o ID do funcionário atual corresponde ao ID fornecido
            if (arrayFuncionario.get(i).getIdFuncionario() == id) {
                // Se encontrar, armazena o índice e interrompe o loop
                index = i;
                break;
            }
        }

        // Verifica se o funcionário foi encontrado
        if (index != -1) {
            // Remove o funcionário da lista com base no índice
            arrayFuncionario.remove(index);
            System.out.println("Funcionário excluído com sucesso.");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }
    
    
}
