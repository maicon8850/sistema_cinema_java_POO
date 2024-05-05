package sistemadecinema;

import java.util.List;

/**
 * Esta classe representa um cliente do sistema de cinema.
 */
public class Cliente {

    // Atributos
    private int id;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String endereco;
    private String telefone;

    // Construtores

    /**
     * Construtor padrão da classe Cliente.
     */
    public Cliente() {

    }

    /**
     * Construtor da classe Cliente.
     * @param id        id do cliente.
     * @param nome      Nome do cliente.
     * @param sobrenome Sobrenome do cliente.
     * @param cpf       CPF do cliente.
     * @param endereco  Endereço do cliente.
     * @param telefone  Telefone do cliente.
     */
    public Cliente(int id, String nome, String sobrenome, String cpf, String endereco, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Métodos Getters e Setters
    
    /**
     * Obtém o nome do id.
     *
     * @return O ID do cliente.
     */
    public int getId() {
        return id;
    }
    /**
     * Define o ID do cliente.
     *
     * @param id O ID do cliente.
     */
    public void setId(int id) {
        this.id = id;
    }
    

    /**
     * Obtém o nome do cliente.
     *
     * @return O nome do cliente.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do cliente.
     *
     * @param nome O nome do cliente.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o sobrenome do cliente.
     *
     * @return O sobrenome do cliente.
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * Define o sobrenome do cliente.
     *
     * @param sobrenome O sobrenome do cliente.
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * Obtém o CPF do cliente.
     *
     * @return O CPF do cliente.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF do cliente.
     *
     * @param cpf O CPF do cliente.
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Obtém o endereço do cliente.
     *
     * @return O endereço do cliente.
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço do cliente.
     *
     * @param endereco O endereço do cliente.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Obtém o telefone do cliente.
     *
     * @return O telefone do cliente.
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o telefone do cliente.
     *
     * @param telefone O telefone do cliente.
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Método toString()

    /**
     * Retorna uma representação em string do objeto Cliente.
     *
     * @return Uma string representando o objeto Cliente.
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "id='"+ id + '\'' +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
