/*
 * GestaoFuncionario.java
 * Esta classe implementa a interface Gerenciador para Gestao os funcionários do sistema de cinema.
 */

package sistemadecinema;

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
    
    @Override
public void salvar(List<Funcionario> funcionarios) {
    try {
        JSONArray jsonArrayFuncionarios = new JSONArray(); // Cria um novo array JSON

        // Itera sobre a lista de funcionarios
        for (Funcionario funcionario : funcionarios) {
            // Cria um objeto JSON para cada funcionario e adiciona ao array JSON
            JSONObject jsonFuncionario = new JSONObject();
            jsonFuncionario.put("ID", funcionario.getIdFuncionario());
            jsonFuncionario.put("nome", funcionario.getNome());
            jsonFuncionario.put("cargo", funcionario.getCargo());
            // Adicione outros atributos conforme necessário

            jsonArrayFuncionarios.put(jsonFuncionario);
        }

        // Converte o array JSON em uma string
        String jsonString = jsonArrayFuncionarios.toString();

        // Escreve a string JSON no arquivo
        WR utilitarioArquivo = new WR();
        utilitarioArquivo.escreverNoArquivo(jsonString, "funcionarios.json", false);

        System.out.println("Funcionários salvos com sucesso.");
    } catch (Exception e) {
        // Trata exceções
        System.out.println("Ocorreu um erro ao salvar os funcionários: " + e.getMessage());
    }
}

    /**
     * Método para cadastrar um novo funcionário no sistema.
     * @param objeto O funcionário a ser cadastrado.
     */
    @Override
    public void cadastrar(Funcionario objeto) {
        try {
            // Cria um objeto JSONObject para armazenar as informações do funcionário
            JSONObject jsonFuncionario = new JSONObject();

            // Adiciona as informações do funcionário ao objeto JSON
            jsonFuncionario.put("idFuncionario", objeto.getIdFuncionario());
            jsonFuncionario.put("nome", objeto.getNome());
            jsonFuncionario.put("cargo", objeto.getCargo());

            // Converte o objeto JSON em uma string
            String informacao = jsonFuncionario.toString();

            // Obtém o conteúdo atual do arquivo, se existir
            WR utilitarioArquivo = new WR();
            String conteudoArquivo = utilitarioArquivo.lerArquivo("funcionario.json");

            // Se o conteúdo do arquivo for vazio, inicia um novo array JSON
            if (conteudoArquivo.isEmpty()) {
                conteudoArquivo = "[" + informacao + "]";
            } else {
                // Remove o último caractere (a ']') do conteúdo do arquivo
                // Remove espaços em branco no início e no final da string,porque  não estava sobrescrevendo o ].
                conteudoArquivo = conteudoArquivo.trim(); 
                if (conteudoArquivo.endsWith("]")) {
                conteudoArquivo = conteudoArquivo.substring(0, conteudoArquivo.length() - 1);
}
                // Adiciona uma vírgula para separar o último objeto JSON do novo
                conteudoArquivo += ",";
                // Adiciona o novo objeto JSON ao conteúdo do arquivo
                conteudoArquivo += informacao;
                // Adiciona o caractere de fechamento do array JSON
                conteudoArquivo += "]";
            }

            // Escreve o conteúdo atualizado no arquivo
            utilitarioArquivo.escreverNoArquivo(conteudoArquivo, "funcionario.json", true);

            System.out.println("Funcionário cadastrado com sucesso.");
        } catch (Exception e) {
            // Trata exceções
            System.out.println("Ocorreu um erro ao cadastrar o funcionário: " + e.getMessage());
        }
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
            WR utilitarioArquivo = new WR();
            String conteudoArquivo = utilitarioArquivo.lerArquivo("funcionario.json");

            // Converte o conteúdo do arquivo em um array JSON
            JSONArray arrayFuncionarios = new JSONArray(conteudoArquivo);

            // Itera sobre os objetos JSON no array
            for (int i = 0; i < arrayFuncionarios.length(); i++) {
                JSONObject jsonFuncionario = arrayFuncionarios.getJSONObject(i);

                // Verifica se o ID do funcionário corresponde ao ID procurado
                if (jsonFuncionario.getInt("idFuncionario") == id) {
                    // Se encontrar, cria um objeto Funcionario com os dados
                    funcionarioEncontrado = new Funcionario(
                        jsonFuncionario.getInt("idFuncionario"),
                        jsonFuncionario.getString("nome"),
                        jsonFuncionario.getString("cargo")
                    );

                    break;
                }
            }

            if (funcionarioEncontrado == null) {
                System.out.println("Funcionário não encontrado.");
            } else {
                // Se o funcionário for encontrado, você pode fazer o que precisa com ele
                // Por exemplo, exibir informações sobre o funcionário
                System.out.println("Funcionário encontrado:");
                System.out.println("ID: " + funcionarioEncontrado.getIdFuncionario());
                System.out.println("Nome: " + funcionarioEncontrado.getNome());
                System.out.println("Cargo: " + funcionarioEncontrado.getCargo());

            }

        } catch (Exception e) {
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
