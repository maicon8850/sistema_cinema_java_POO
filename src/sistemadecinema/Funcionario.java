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

    // Nome de usuário do funcionário
    private String user;

    // Senha do funcionário
    private String password;


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

    /**
     * Obtém o nome de usuário do funcionário.
     *
     * @return O nome de usuário do funcionário.
     */
    public String getUser() {
        return user;
    }

    /**
     * Define o nome de usuário do funcionário.
     *
     * @param user O nome de usuário do funcionário.
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * Obtém a senha do funcionário.
     *
     * @return A senha do funcionário.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define a senha do funcionário.
     *
     * @param password A senha do funcionário.
     */
    public void setPassword(String password) {
        this.password = password;
    }

   
    /**
     * Método para autenticar o funcionário.
     * Este método implementa a lógica de autenticação do funcionário no sistema.
     */
    public void autenticar() {
        // Implementação da autenticação
    }

    /**
     * Método para verificar o acesso do funcionário.
     * Este método verifica quais recursos o funcionário tem acesso no sistema.
     */
    public void verificarAcesso() {
        // Implementação para verificar o acesso do funcionário
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
