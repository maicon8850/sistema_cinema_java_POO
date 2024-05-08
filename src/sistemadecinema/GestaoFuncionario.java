/*
 * GestaoFuncionario.java
 * Esta classe implementa a interface Gerenciador para Gestao os funcionários do sistema de cinema.
 */

package sistemadecinema;

import java.util.ArrayList;
import manipulararquivo.WR;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Esta classe gerencia as operações relacionadas aos funcionários do sistema de cinema.
 * Implementa a interface Gerenciador para fornecer métodos de cadastro, busca, listagem, atualização e exclusão de funcionários.
 * As informações dos funcionários são armazenadas em um arquivo JSON.
 * @author kaiqu
 */
public class GestaoFuncionario implements Gestao<Funcionario> {
    
    private List<Funcionario> arrayFuncionario;
    
    public GestaoFuncionario(){
        arrayFuncionario = new ArrayList<>();
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
     * Salva a lista de clientes em um arquivo JSON.
     * @param funcionario A lista de clientes a ser salva.
     */
    @Override
    public void salvar(List<Funcionario> funcionarios) {
        try {
            JSONArray jsonArrayFuncionarios = new JSONArray(); // Cria um novo array JSON

            // Itera sobre a lista de clientes
            for (Funcionario funcionario : funcionarios) {
                // Cria um objeto JSON para cada cliente e adiciona ao array JSON
                JSONObject jsonFuncionario = new JSONObject();
                jsonFuncionario.put("ID", funcionario.getIdFuncionario());
                jsonFuncionario.put("nome", funcionario.getNome());
                jsonFuncionario.put("sobrenome", funcionario.getCargo());
                
                jsonArrayFuncionarios.put(jsonFuncionario);
            }

            // Converte o array JSON em uma string
            String jsonString = jsonArrayFuncionarios.toString();

            // Escreve a string JSON no arquivo
            WR utilitarioArquivo = new WR();
            utilitarioArquivo.escreverNoArquivo(jsonString, "funcionarios.json", true);

            System.out.println("Funcionario salvos com sucesso.");
        } catch (Exception e) {
            // Trata exceções
            System.out.println("Ocorreu um erro ao salvar os funcionarios: " + e.getMessage());
        }
    }
    
    /**
     * Retorna a lista de clientes.
     * @return A lista de clientes.
     */
    public List<Funcionario> getListaFuncionario(){
        return arrayFuncionario; // Retorna a lista de clientes
    }
    
    @Override
    public Funcionario buscar(int id) {
        Funcionario funcionarioEncontrado = null;

        // Itera sobre a lista de Funcionarios
        for (Funcionario funcionario : arrayFuncionario) {
            // Verifica se o ID do Funcionario corresponde ao ID procurado
            if (funcionario.getIdFuncionario() == id) {
                // Se encontrar, atribui o Funcionario encontrado à variável FuncionarioEncontrado e interrompe o loop
                funcionarioEncontrado = funcionario;
                break;
            }
        }

        // Se o Funcionario não for encontrado, imprime uma mensagem
        if (funcionarioEncontrado == null) {
            System.out.println("Funcionario não encontrado.");
        } else {
            // Se o Funcionario for encontrado, imprime suas informações
            System.out.println("Funcionario encontrado:");
            System.out.println("ID: " + funcionarioEncontrado.getIdFuncionario());
            System.out.println("Nome: " + funcionarioEncontrado.getNome());
            System.out.println("Nome: " + funcionarioEncontrado.getCargo());
            
        }

        return funcionarioEncontrado;
    }

    /**
     * Lista todos os Funcionarios cadastrados.
     * @return A lista completa de Funcionarios.
     */
    @Override
    public List<Funcionario> listar() {
        for (Funcionario Funcionario : arrayFuncionario){
            System.out.println(Funcionario.getNome() + " " + Funcionario.getCargo()); // Imprime cada Funcionario da lista
        }

        return arrayFuncionario; // Retorna a lista completa de Funcionarios
    }

    /**
     * Atualiza as informações de um Funcionario.
     * @param FuncionarioAtualizado O Funcionario com as informações atualizadas.
     */
    @Override
    public void atualizar(Funcionario FuncionarioAtualizado) {
        // Variável para armazenar o índice do Funcionario a ser atualizado
        int index = -1;

        // Itera sobre a lista de Funcionarios
        for (int i = 0; i < arrayFuncionario.size(); i++) {
            // Verifica se o ID do Funcionario atual corresponde ao ID do Funcionario atualizado
            if (arrayFuncionario.get(i).getIdFuncionario() == FuncionarioAtualizado.getIdFuncionario()) {
                // Se encontrar, armazena o índice e interrompe o loop
                index = i;
                break;
            }
        }

        // Verifica se o Funcionario foi encontrado
        if (index != -1) {
            // Atualiza as informações do Funcionario na lista com base no índice
            arrayFuncionario.set(index, FuncionarioAtualizado);
            System.out.println("Funcionario atualizado com sucesso.");
        } else {
            System.out.println("Funcionario não encontrado.");
        }
    }

    /**
     * Exclui um Funcionario da lista.
     * @param id O ID do Funcionario a ser excluído.
     */
    @Override
    public void deletar(int id) {
        // Variável para armazenar o índice do Funcionario a ser excluído
        int index = -1;

        // Itera sobre a lista de Funcionarios
        for (int i = 0; i < arrayFuncionario.size(); i++) {
            // Verifica se o ID do Funcionario atual corresponde ao ID fornecido
            if (arrayFuncionario.get(i).getIdFuncionario() == id) {
                // Se encontrar, armazena o índice e interrompe o loop
                index = i;
                break;
            }
        }

        // Verifica se o Funcionario foi encontrado
        if (index != -1) {
            // Remove o Funcionario da lista com base no índice
            arrayFuncionario.remove(index);
            System.out.println("Funcionario excluído com sucesso.");
        } else {
            System.out.println("Funcionario não encontrado.");
        }
    }
}
