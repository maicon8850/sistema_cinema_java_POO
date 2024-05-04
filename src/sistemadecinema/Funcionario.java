package sistemadecinema;

import java.util.List;

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

    // Indica se o funcionário tem acesso às despesas
    private boolean acessoDespesas;

    // Indica se o funcionário tem acesso ao balanço mensal
    private boolean acessoBalancoMensal;

    // Indica se o funcionário tem acesso aos relatórios
    private boolean acessoRelatorios;

    // Indica se o funcionário tem acesso ao estoque
    private boolean acessoEstoque;

    // Lista de balcões de atendimento atribuídos ao funcionário
    private List<BalcaoAtendimento> balcoesAtendimento;

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
     * @param acessoDespesas Indica se o funcionário tem acesso às despesas.
     * @param acessoBalancoMensal Indica se o funcionário tem acesso ao balanço mensal.
     * @param acessoRelatorios Indica se o funcionário tem acesso aos relatórios.
     * @param acessoEstoque Indica se o funcionário tem acesso ao estoque.
     * @param balcoesAtendimento Lista de balcões de atendimento atribuídos ao funcionário.
     */
    public Funcionario(int idFuncionario, String nome, String cargo, boolean acessoDespesas, boolean acessoBalancoMensal,
                       boolean acessoRelatorios, boolean acessoEstoque, List<BalcaoAtendimento> balcoesAtendimento) {
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.cargo = cargo;
        this.acessoDespesas = acessoDespesas;
        this.acessoBalancoMensal = acessoBalancoMensal;
        this.acessoRelatorios = acessoRelatorios;
        this.acessoEstoque = acessoEstoque;
        this.balcoesAtendimento = balcoesAtendimento;
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
     * Verifica se o funcionário tem acesso às despesas.
     *
     * @return true se o funcionário tem acesso às despesas, caso contrário false.
     */
    public boolean isAcessoDespesas() {
        return acessoDespesas;
    }

    /**
     * Define se o funcionário tem acesso às despesas.
     *
     * @param acessoDespesas true se o funcionário tem acesso às despesas, caso contrário false.
     */
    public void setAcessoDespesas(boolean acessoDespesas) {
        this.acessoDespesas = acessoDespesas;
    }

    /**
     * Verifica se o funcionário tem acesso ao balanço mensal.
     *
     * @return true se o funcionário tem acesso ao balanço mensal, caso contrário false.
     */
    public boolean isAcessoBalancoMensal() {
        return acessoBalancoMensal;
    }

    /**
     * Define se o funcionário tem acesso ao balanço mensal.
     *
     * @param acessoBalancoMensal true se o funcionário tem acesso ao balanço mensal, caso contrário false.
     */
    public void setAcessoBalancoMensal(boolean acessoBalancoMensal) {
        this.acessoBalancoMensal = acessoBalancoMensal;
    }

    /**
     * Verifica se o funcionário tem acesso aos relatórios.
     *
     * @return true se o funcionário tem acesso aos relatórios, caso contrário false.
     */
    public boolean isAcessoRelatorios() {
        return acessoRelatorios;
    }

    /**
     * Define se o funcionário tem acesso aos relatórios.
     *
     * @param acessoRelatorios true se o funcionário tem acesso aos relatórios, caso contrário false.
     */
    public void setAcessoRelatorios(boolean acessoRelatorios) {
        this.acessoRelatorios = acessoRelatorios;
    }

    /**
     * Verifica se o funcionário tem acesso ao estoque.
     *
     * @return true se o funcionário tem acesso ao estoque, caso contrário false.
     */
    public boolean isAcessoEstoque() {
        return acessoEstoque;
    }

    /**
     * Define se o funcionário tem acesso ao estoque.
     *
     * @param acessoEstoque true se o funcionário tem acesso ao estoque, caso contrário false.
     */
    public void setAcessoEstoque(boolean acessoEstoque) {
        this.acessoEstoque = acessoEstoque;
    }

    /**
     * Obtém a lista de balcões de atendimento atribuídos ao funcionário.
     *
     * @return A lista de balcões de atendimento.
     */
    public List<BalcaoAtendimento> getBalcoesAtendimento() {
        return balcoesAtendimento;
    }

    /**
     * Define a lista de balcões de atendimento atribuídos ao funcionário.
     *
     * @param balcoesAtendimento A lista de balcões de atendimento.
     */
    public void setBalcoesAtendimento(List<BalcaoAtendimento> balcoesAtendimento) {
        this.balcoesAtendimento = balcoesAtendimento;
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
                ", acessoDespesas=" + acessoDespesas +
                ", acessoBalancoMensal=" + acessoBalancoMensal +
                ", acessoRelatorios=" + acessoRelatorios +
                ", acessoEstoque=" + acessoEstoque +
                ", balcoesAtendimento=" + balcoesAtendimento +
                '}';
    }
}
