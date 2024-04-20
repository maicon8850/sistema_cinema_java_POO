import java.util.List;

public class Funcionario {
    // Atributos
    private int idFuncionario;    // Identificador único do funcionário
    private String nome;             // Nome do funcionário
    private String cargo;             // Cargo do funcionário
    private boolean acessoDespesas;    // Indica se o funcionário tem acesso às despesas
    private boolean acessoBalancoMensal;// Indica se o funcionário tem acesso ao balanço mensal
    private boolean acessoRelatorios;   // Indica se o funcionário tem acesso aos relatórios
    private boolean acessoEstoque;    // Indica se o funcionário tem acesso ao estoque
    private List<BalcaoAtendimento> balcoesAtendimento; // Lista de balcões de atendimento atribuídos ao funcionário

    // Construtor
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
    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isAcessoDespesas() {
        return acessoDespesas;
    }

    public void setAcessoDespesas(boolean acessoDespesas) {
        this.acessoDespesas = acessoDespesas;
    }

    public boolean isAcessoBalancoMensal() {
        return acessoBalancoMensal;
    }

    public void setAcessoBalancoMensal(boolean acessoBalancoMensal) {
        this.acessoBalancoMensal = acessoBalancoMensal;
    }

    public boolean isAcessoRelatorios() {
        return acessoRelatorios;
    }

    public void setAcessoRelatorios(boolean acessoRelatorios) {
        this.acessoRelatorios = acessoRelatorios;
    }

    public boolean isAcessoEstoque() {
        return acessoEstoque;
    }

    public void setAcessoEstoque(boolean acessoEstoque) {
        this.acessoEstoque = acessoEstoque;
    }

    public List<BalcaoAtendimento> getBalcoesAtendimento() {
        return balcoesAtendimento;
    }

    public void setBalcoesAtendimento(List<BalcaoAtendimento> balcoesAtendimento) {
        this.balcoesAtendimento = balcoesAtendimento;
    }

    // Métodos adicionais

    // Método para autenticar o funcionário
    public void autenticar() {
        // Implementação da autenticação
    }

    // Método para verificar acesso do funcionário
    public void verificarAcesso() {
        // Implementação para verificar o acesso do funcionário
    }

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
