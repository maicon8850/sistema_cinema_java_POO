package sistemadecinema;

/**
 * Esta classe representa um funcionário do sistema de cinema.
 */
public class Funcionario {
    // Atributos

    // Identificador único do funcionário
    private int idFuncionario;

    // Nome do funcionário
    private String nome;

    // Cargo do funcionário
    private String cargo;

  
    // Construtores

    /**
     * Construtor padrão da classe Funcionario.
     */
    public Funcionario(){

    }

    /**
     * Construtor da classe Funcionario.
     *
     * @param idFuncionario Identificador único do funcionário.
     * @param nome Nome do funcionário.
     * @param cargo Cargo do funcionário.
     */
    public Funcionario(int idFuncionario, String nome, String cargo) {
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.cargo = cargo;
        
    }

    // Métodos Getters e Setters

    /**
     * Obtém o ID do funcionário.
     *
     * @return O ID do funcionário.
     */
    public int getIdFuncionario() {
        return idFuncionario;
    }

    /**
     * Define o ID do funcionário.
     *
     * @param idFuncionario O ID do funcionário.
     */
    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    /**
     * Obtém o nome do funcionário.
     *
     * @return O nome do funcionário.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do funcionário.
     *
     * @param nome O nome do funcionário.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o cargo do funcionário.
     *
     * @return O cargo do funcionário.
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Define o cargo do funcionário.
     *
     * @param cargo O cargo do funcionário.
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    // Sobrescrita do método toString()

    /**
     * Retorna uma representação em string do objeto Funcionario.
     *
     * @return Uma string representando o objeto Funcionario.
     */
    @Override
    public String toString() {
        return "Funcionario{" +
                "idFuncionario=" + idFuncionario +
                ", nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
