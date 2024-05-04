/*
 * GerenciarFuncionario.java
 * Esta classe implementa a interface Gerenciador para gerenciar os funcionários do sistema de cinema.
 */

package sistemadecinema;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
        es.escreverNoArquivo(informacao + ";", "funcionario.json", false); // Adiciona uma ponto e virgula  após cada objeto JSON
    }

    /**
     * Método para buscar um funcionário pelo ID.
     * @param id O ID do funcionário a ser buscado.
     * @return O funcionário encontrado, ou null se não for encontrado.
     */
    @Override
    public Funcionario buscar(int id) {
        // Variável para armazenar o funcionário encontrado
        Funcionario funcionarioEncontrado = null;

        try {
            // Caminho do arquivo
            String diretorioTrabalho = System.getProperty("user.dir");
            String caminhoCompleto = diretorioTrabalho + "/src/database/";
            String arquivo = caminhoCompleto+"funcionario.json";
            

            // Cria um objeto BufferedReader para ler o arquivo
            BufferedReader reader = new BufferedReader(new FileReader(arquivo));

            // Variável para armazenar cada linha do arquivo
            String linha;

            // Lê o arquivo linha por linha
            while ((linha = reader.readLine()) != null) {
                // Converte a linha para um objeto JSON
                JSONObject jsonFuncionario = new JSONObject(linha);

                // Verifica se o ID do funcionário corresponde ao ID procurado
                if (jsonFuncionario.getInt("idFuncionario") == id) {
                // Se encontrar, cria um objeto Funcionario com os dados
                    funcionarioEncontrado = new Funcionario(
                    jsonFuncionario.getInt("idFuncionario"),
                    jsonFuncionario.getString("nome"),
                    jsonFuncionario.getString("cargo"),
                    jsonFuncionario.getBoolean("acessoDespesas"),
                    jsonFuncionario.getBoolean("acessoBalancoMensal"),
                    jsonFuncionario.getBoolean("acessoRelatorios"),
                    jsonFuncionario.getBoolean("acessoEstoque"),
                    null // Você precisará corrigir isso se quiser passar a lista de balcões de atendimento
                );
                // Se houver mais atributos, adicione-os aqui

                // Interrompe o loop, pois o funcionário foi encontrado
                break;
}
            }

            // Fecha o BufferedReader
            reader.close();
        } catch (IOException e) {
            // Trata exceções de leitura do arquivo
            e.printStackTrace();
        }

        // Retorna o funcionário encontrado (ou null se não encontrado)
        return funcionarioEncontrado;
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
