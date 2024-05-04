/*
 * GerenciarFuncionario.java
 * Esta classe implementa a interface Gerenciador para gerenciar os funcionários do sistema de cinema.
 */

package sistemadecinema;

import manipulararquivo.WR;
import java.util.List;
import org.json.JSONObject;

/**
 * Esta classe gerencia as operações relacionadas aos funcionários do sistema de cinema.
 * Implementa a interface Gerenciador para fornecer métodos de cadastro, busca, listagem, atualização e exclusão de funcionários.
 * As informações dos funcionários são armazenadas em um arquivo JSON.
 * @author kaiqu
 */
public class GerenciarFuncionario implements Gerenciador<Funcionario> {
    
    /**
     * Método para cadastrar um novo funcionário no sistema.
     * @param objeto O funcionário a ser cadastrado.
     */
    @Override
    public void cadastrar(Funcionario objeto) {
        // Cria um objeto JSONObject para armazenar as informações do funcionário
        JSONObject jsonFuncionario = new JSONObject();
        
        // Adiciona as informações do funcionário ao objeto JSON
        jsonFuncionario.put("idFuncionario", objeto.getIdFuncionario());
        jsonFuncionario.put("nome", objeto.getNome());
        jsonFuncionario.put("cargo", objeto.getCargo());
        jsonFuncionario.put("acessoDespesas", objeto.isAcessoDespesas());
        jsonFuncionario.put("acessoBalancoMensal", objeto.isAcessoBalancoMensal());
        jsonFuncionario.put("acessoRelatorios", objeto.isAcessoRelatorios());
        jsonFuncionario.put("acessoEstoque", objeto.isAcessoEstoque());
        
        // Converte o objeto JSON em uma string
        String informacao = jsonFuncionario.toString();
        
        // Cria uma instância local da classe WR
        WR es = new WR();
        
        // Chama o método escreverNoArquivo para escrever as informações no arquivo "funcionario.json"
        es.escreverNoArquivo(informacao + "\n", "funcionario.json", false); // Adiciona uma quebra de linha após cada objeto JSON
    }

    /**
     * Método para buscar um funcionário pelo ID.
     * @param id O ID do funcionário a ser buscado.
     * @return O funcionário encontrado, ou null se não for encontrado.
     */
    @Override
    public Funcionario buscar(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Método para listar todos os funcionários do sistema.
     * @return Uma lista contendo todos os funcionários cadastrados.
     */
    @Override
    public List<Funcionario> listar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Método para atualizar as informações de um funcionário.
     * @param objeto O funcionário com as informações atualizadas.
     */
    @Override
    public void atualizar(Funcionario objeto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Método para deletar um funcionário do sistema.
     * @param id O ID do funcionário a ser deletado.
     */
    @Override
    public void deletar(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }    
}
