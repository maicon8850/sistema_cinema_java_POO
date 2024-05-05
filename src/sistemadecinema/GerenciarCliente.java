/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemadecinema;

import java.util.List;
import manipulararquivo.WR;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Esta classe é responsável por gerenciar operações relacionadas aos clientes.
 * Implementa a interface Gerenciador T onde T é do tipo Cliente.
 */
public class GerenciarCliente implements Gerenciador<Cliente>{
    
    /**
     * Cadastra um novo cliente.
     * @param objeto O cliente a ser cadastrado.
     */
    @Override
    public void cadastrar(Cliente objeto) {
        try {
            // Cria um objeto JSONObject para armazenar as informações do cliente
            JSONObject jsonCliente = new JSONObject();

            // Adiciona as informações do cliente ao objeto JSON
            jsonCliente.put("ID", objeto.getId());
            jsonCliente.put("nome", objeto.getNome());
            jsonCliente.put("Sobrenome", objeto.getSobrenome());
            jsonCliente.put("CPF", objeto.getCpf());
            jsonCliente.put("Endereco", objeto.getEndereco());
            jsonCliente.put("Telefone", objeto.getTelefone());

            // Converte o objeto JSON em uma string
            String informacao = jsonCliente.toString();

            // Obtém o conteúdo atual do arquivo, se existir
            WR utilitarioArquivo = new WR();
            String conteudoArquivo = utilitarioArquivo.lerArquivo("cliente.json");

            // Se o conteúdo do arquivo for vazio, inicia um novo array JSON
            if (conteudoArquivo.isEmpty()) {
                conteudoArquivo = "[" + informacao + "]";
            } else {
                // Remove o último caractere (a ']') do conteúdo do arquivo
                // Remove espaços em branco no início e no final da string, porque não estava sobrescrevendo o ']'
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
            utilitarioArquivo.escreverNoArquivo(conteudoArquivo, "cliente.json", true);

            System.out.println("Cliente cadastrado com sucesso.");
        } catch (Exception e) {
            // Trata exceções
            System.out.println("Ocorreu um erro ao cadastrar o cliente: " + e.getMessage());
        }
 
    }

    @Override
    public Cliente buscar(int id) {
        // Variável para armazenar o cliente encontrado
        Cliente clienteEncontrado = null;

        try {
            WR utilitarioArquivo = new WR();
            String conteudoArquivo = utilitarioArquivo.lerArquivo("cliente.json");

            // Converte o conteúdo do arquivo em um array JSON
            JSONArray arrayClientes = new JSONArray(conteudoArquivo);

            // Itera sobre os objetos JSON no array
            for (int i = 0; i < arrayClientes.length(); i++) {
                JSONObject jsoncliente = arrayClientes.getJSONObject(i);

                // Verifica se o ID do funcionário corresponde ao ID procurado
                if (jsoncliente.getInt("ID") == id) {
                    // Se encontrar, cria um objeto cliente com os dados
                    clienteEncontrado = new Cliente(
                        jsoncliente.getInt("ID"),
                        jsoncliente.getString("nome"),
                        jsoncliente.getString("Sobrenome"),
                        jsoncliente.getString("CPF"),
                        jsoncliente.optString("Endereco", ""),
                        jsoncliente.getString("Telefone")
                    );

                    break;
                }
            }

            if (clienteEncontrado == null) {
                System.out.println("Cliente não encontrado.");
            } else {
                // Se o funcionário for encontrado, você pode fazer o que precisa com ele
                // Por exemplo, exibir informações sobre o funcionário
                System.out.println("Cliente encontrado:");
                System.out.println("ID: " + clienteEncontrado.getId());
                System.out.println("Nome: " + clienteEncontrado.getNome());
                System.out.println("Telefone: " + clienteEncontrado.getTelefone());

            }

        } catch (Exception e) {
            // Trata exceções de leitura do arquivo
            e.printStackTrace();
        }

        // Retorna o funcionário encontrado (ou null se não encontrado)
        return clienteEncontrado;
    }

    @Override
    public List<Cliente> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void atualizar(Cliente objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deletar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
